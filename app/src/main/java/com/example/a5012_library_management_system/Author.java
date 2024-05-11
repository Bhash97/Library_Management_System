package com.example.a5012_library_management_system;

public class Author {
    private String name;

    public Author() {
        // Default constructor
    }

    public Author(String name) {
        this.name = name;
    }

    // Getter and setter for the author's name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
