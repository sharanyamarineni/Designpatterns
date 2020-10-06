package com.zemoso.singletonpattern;
class Singleton{
    static Singleton obj =null;
    int a;
    private Singleton(){
        a=10;
    }
    public static Singleton getInstance(){
        if(obj == null){
            obj = new Singleton();
        }
        return obj;
    }
}
public class Sample {
    public static void main(String[] args) {
        Singleton single1 = Singleton.getInstance();
        Singleton single2 = Singleton.getInstance();
        System.out.println(single1.a);
        System.out.println(single2.a);
    }
}
