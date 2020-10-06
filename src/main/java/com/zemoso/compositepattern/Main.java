package com.zemoso.compositepattern;

public class Main {
    public static void main(String[] args) {
        Component history1=new Leaf(200,"history1");
        Component history2=new Leaf(400,"history2");
        Component maths1=new Leaf(600,"maths1");
        Component science1=new Leaf(300,"science1");
        Component science2=new Leaf(450,"science2");

        Library history=new Library("History books");
        Library science=new Library("Science books");
        Library maths=new Library("Maths books");
        Library books=new Library("All books");

        history.addComponent(history1);
        history.addComponent(history2);
        science.addComponent(science1);
        science.addComponent(science2);
        maths.addComponent(maths1);
        books.addComponent(history);
        books.addComponent(science);
        books.addComponent(maths);

        books.showprice();
    }






}
