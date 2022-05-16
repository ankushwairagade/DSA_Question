package com.ankush._1_Essentials.oops.inheritance.multilevel_Inheritance;

public class main {
    public static void main(String[] args) {
        C obj = new C(10,20,30);
        obj.showdata();
        obj.setA(2);
        obj.setC(50);
        obj.showdata();
    }

}

class A{
    int a;

    public A(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

class B extends A{
    int b;

    public B(int a, int b) {
        super(a);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

class C extends B{
    int c;

    public C(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    void showdata()
    {
        System.out.println(a+"\n"+b+"\n"+c);
    }
}
