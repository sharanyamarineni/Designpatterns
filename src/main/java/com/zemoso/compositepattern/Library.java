package com.zemoso.compositepattern;

import java.util.ArrayList;

interface Component{
    void showprice();
}

class Library implements Component{
    String name;
    ArrayList<Component> list=new ArrayList<>();

    public Library(String name) {
        super();
        this.name = name;
    }

    public void addComponent(Component com){
        list.add(com);
    }
    @Override
    public void showprice() {
        System.out.println(name);
        for(Component c : list){
            c.showprice();
        }
    }
}
