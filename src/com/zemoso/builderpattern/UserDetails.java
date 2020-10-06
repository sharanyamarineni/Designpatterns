package com.zemoso.builderpattern;

public class UserDetails {
    private String name;
    private int number;
    private String location;
    private int dob;

    public UserDetails setName(String name) {
        this.name = name;
        return this;
    }

    public UserDetails setNumber(int number) {
        this.number = number;
        return this;
    }

    public UserDetails setLocation(String location) {
        this.location = location;
        return this;
    }

    public UserDetails setDob(int dob) {
        this.dob = dob;
        return this;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", location='" + location + '\'' +
                ", dob=" + dob +
                '}';
    }
}
