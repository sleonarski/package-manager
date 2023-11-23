package com.orion.packagemanager.model;

import jakarta.persistence.Entity;

import java.util.Random;

public class User {

    private final long id;
    private final String name;

    public User(String name) {
        this.id = generateID();
        this.name = name;
    }

    private long generateID() {
        var random = new Random();
        return random.nextLong(100_000);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
