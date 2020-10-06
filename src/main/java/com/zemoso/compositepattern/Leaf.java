package com.zemoso.compositepattern;

public class Leaf implements Component{
    int price;
    String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showprice() {
        System.out.println(name+":"+price);
    }
}
