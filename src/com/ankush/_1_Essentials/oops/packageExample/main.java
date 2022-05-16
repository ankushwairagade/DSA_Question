package com.ankush._1_Essentials.oops.packageExample;


import com.ankush._1_Essentials.oops.packageExample.pkg1.addition;
import com.ankush._1_Essentials.oops.packageExample.pkg2.substraction;

public class main {
    public static void main(String[] args) {
        addition objadd = new addition(20,30,5);
        objadd.add();  // a+b;
        substraction objsub = new substraction(90,50);
        objsub.sub();
    }
}
