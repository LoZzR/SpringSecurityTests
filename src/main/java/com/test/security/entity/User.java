package com.test.security.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/*import javax.persistence.Entity;
import javax.persistence.Id;*/

//@Entity
@Getter
@RequiredArgsConstructor
public class User {

    //@Id
    private int id;
    private final String username;
    private final String password;
    private final String authority;
    // Omitted getters and setters
}
