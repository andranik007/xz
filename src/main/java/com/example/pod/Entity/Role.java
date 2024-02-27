package com.example.pod.Entity;

public enum Role {
    USER("Пользователь"),
        ADMIN("Администратор");

    public final String name;

    Role(String name){this.name = name;}
}
