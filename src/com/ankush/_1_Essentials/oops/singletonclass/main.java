package com.ankush._1_Essentials.oops.singletonclass;

public class main {


    public static void main(String[] args) {
        //  Singleton obj = new Singleton();  can't call it

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();



    }


}


