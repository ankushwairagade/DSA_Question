package com.ankush._5_Recursion.RecursionWithPattern;

public class triangle {
  /*      * * * *
          * * *
          * *
          *           */

    // how to print this using recursion   // trick

    public static void main(String[] args) {
        newtriangle2(4,0);
    }
        // First Method to solve
    static void triangle(int n)
    {   if(n==0) return;

       printo(n);
        System.out.println();
        triangle(n-1);
    }
    static void printo(int n)
    {   if(n==0)return;
        System.out.print(" * ");
        printo(n-1);
    }



    /////////////

    static void newtriangle(int r ,int c)
    {
        if(r==0) return;

        if(c<r){
            System.out.print(" * ");
            newtriangle(r,c+1);
        }else{
            System.out.println();
            newtriangle(r-1,0);
        }
    }

        // normal triangle
    static void newtriangle2(int r ,int c)
    {
        if(r==0) return;

        if(c<r){  newtriangle2(r,c+1);
            System.out.print(" * ");

        }else{   newtriangle2(r-1,0);
            System.out.println();


        }
    }
}
