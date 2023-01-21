package com.test.security.config;

import com.test.security.entity.User;
import com.test.security.helper.PlainTextPasswordEncoder;
import com.test.security.helper.SecurityUser;
import com.test.security.service.CustomInMemoryUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

import java.util.List;

//@Configuration
public class CustomUserDetailsServiceConfig {

    //@Bean
    /*public UserDetailsService userDetailsService() {
        UserDetails u = new SecurityUser(new User("zack", "test123", "read"));
        List<UserDetails> users = List.of(u);
        return new CustomInMemoryUserDetailsService(users);
    }*/
    //@Bean
    public PasswordEncoder passwordEncoder() {
        //return NoOpPasswordEncoder.getInstance();
        return new PlainTextPasswordEncoder();
    }

    /*@Bean
    public PasswordEncoder passwordEncoder() {
        Map<String, PasswordEncoder> encoders = new HashMap<>();
        encoders.put("noop", new PlainTextPasswordEncoder());
        encoders.put("bcrypt", new BCryptPasswordEncoder());
        encoders.put("scrypt", new SCryptPasswordEncoder());
        return new DelegatingPasswordEncoder("noop", encoders);
    }*/
}
