package com.zemoso.builderpattern;

public class Main {
    public static void main(String[] args) {
        UserDetails user = new UserDetails();
        user.setDob(234).setLocation("hyd").setName("john");
        System.out.println(user);
    }
}
