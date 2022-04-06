package com.ankush._1_Essentials.oops.inheritance.single_Inheritance;

public class main {

    public static void main(String[] args) {

        B obj = new B(10,20);
        obj.show();
    }
}

class A{
    int a;

    public A(int a) {
        this.a = a;
    }
    void show()
    {
        System.out.println(a);
    }
}

class B extends A{

    int b;

    public B(int a, int b) {
        super(a);
        this.b = b;
    }


    void show()
    {   System.out.println(a);
        System.out.println(b);
    }
}
