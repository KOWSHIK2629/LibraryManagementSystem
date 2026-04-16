package com.library;

public class User {
    String name;
    int id;
    int booksIssued;
    int days;

    public User(String name, int id, int booksIssued, int days) {
        this.name = name;
        this.id = id;
        this.booksIssued = booksIssued;
        this.days = days;
    }
}
