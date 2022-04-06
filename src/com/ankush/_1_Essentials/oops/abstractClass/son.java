package com.ankush._1_Essentials.oops.abstractClass;

public class son extends Parent{

    @Override
    void partner(String name, int age) {
        System.out.println("i love to be "+name+"  her age is "+age);
    }

    @Override
    void career(String name) {
        System.out.println("Im going to be "+name);
    }
}
