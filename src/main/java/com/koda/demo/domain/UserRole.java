package com.koda.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class UserRole {

    @Id
    @GeneratedValue
    private Long id;

    private String role;

    public UserRole(String role) {
        this.role = role;
    }
}
