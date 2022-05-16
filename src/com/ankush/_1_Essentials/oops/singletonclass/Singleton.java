package com.ankush._1_Essentials.oops.singletonclass;

public class Singleton {
    int num = 0;
    private Singleton()
    {


    }

    private static  Singleton instance;

    public static  Singleton getInstance()
    {       // check whea
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
