package com.example.new_home_work_s3_e6.models;

public class User {
    private String name, surname;
    private int image;

    public User(int image,String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getImage() {
        return image;
    }
}

