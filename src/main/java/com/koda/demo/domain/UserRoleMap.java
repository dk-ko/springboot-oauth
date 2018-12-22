package com.koda.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class UserRoleMap implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_USER_MAP"))
    private User user;

    @ManyToOne
    @JoinColumn(name = "user_role_id", foreignKey = @ForeignKey(name = "FK_USER_ROLE_MAP"))
    private UserRole userRole;

    public UserRoleMap(User user, UserRole userRole) {
        this.user = user;
        this.userRole = userRole;
    }
}
