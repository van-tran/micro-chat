package com.example.chat.security;

import java.util.Arrays;
import java.util.Optional;

public enum UserRole {

    ADMIN(1),
    USER(1);

    private int roleID;

    private UserRole(int roleID) {
        this.roleID = roleID;
    }

    public int getRoleID() {
        return roleID;
    }

    public static Optional<UserRole> findByRoleID(int roleID) {
        return Arrays.stream(values()).filter(userRole -> userRole.getRoleID() == roleID)
                .findFirst();
    }
}
