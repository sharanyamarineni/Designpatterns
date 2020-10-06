package com.zemoso.adapterpattern;

interface Features{
    public void fingerprint();
    public void camera();
}
interface Basic{
    public void lock();
}
public class Phone implements Basic{

    @Override
    public void lock() {
        System.out.println("added lock");
    }

}
