package com.ankush._1_Essentials.oops.accescontrol;


class A
{    String b;
    private int a;
    int [] arr;  // don't specified anything ?

    public A(int a, int[] arr, String b) {
        this.a = a;
        this.arr = arr;
        this.b = b;
    }
}

public class main {



    public static void main(String[] args) {
        int [] arr= {10,2,5,5};
        A obj = new A(10,arr,"abc");
        //A abs= new A();
        //   abs.b="abc";    // access
        //   abs.a=4;        // this is not access


    }
}
