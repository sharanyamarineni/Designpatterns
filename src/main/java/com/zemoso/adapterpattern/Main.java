package com.zemoso.adapterpattern;

import com.zemoso.adapterpattern.Adapter;
import com.zemoso.adapterpattern.Basic;
import com.zemoso.adapterpattern.Phone;

public class Main {
    public static void main(String[] args) {
        SmartPhone smart=new SmartPhone();
        Phone phone=new Phone();
        Basic adapter=new Adapter(smart);
        phone.lock();
        adapter.lock();

    }
}
