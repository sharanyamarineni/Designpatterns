package com.zemoso.adapterpattern;

public class Adapter implements Basic {
    Features features;
    public Adapter(Features features){
        this.features=features;
    }
    @Override
    public void lock() {
        features.fingerprint();
    }
}
