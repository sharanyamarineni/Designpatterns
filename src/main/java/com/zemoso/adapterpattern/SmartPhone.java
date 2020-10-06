package com.zemoso.adapterpattern;

import com.zemoso.adapterpattern.Features;

public class SmartPhone implements Features {

    @Override
    public void fingerprint() {
        System.out.println("added fingerprint");
    }

    @Override
    public void camera() {
        System.out.println("added camera");
    }
}
