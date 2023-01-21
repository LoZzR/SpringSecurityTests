package com.test.security.service;

import com.test.security.entity.User;
import com.test.security.helper.SecurityUser;
import com.test.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
public class JpaUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public SecurityUser loadUserByUsername(String username) {
        Supplier<UsernameNotFoundException> s =
                () -> new UsernameNotFoundException(
                        "Problem during authentication!");
        User u = userRepository
                .findUserByUsername(username)
                .orElseThrow(s);
        return new SecurityUser(u);
    }
}
