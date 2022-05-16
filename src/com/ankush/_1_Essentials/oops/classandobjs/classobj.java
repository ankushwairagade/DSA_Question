package com.ankush._1_Essentials.oops.classandobjs;

public class classobj {

    public static void main(String[] args) {

        // Object creating
        Box  obj1 = new Box(); // default constuctor
        Box  obj2 = new Box(10,2,4);
        Box  obj3 = new Box();
        obj3.setDimension(20,10,18);

        obj1.showdata();
        obj2.showdata();
        obj3.showdata();
    }
}


class Box{
    int length , heigth ,breadth;


    public Box()  // Default constructor
    {
        length=1; heigth=1; breadth=1;
    }

    public Box(int length, int heigth, int breadth)  // parameter constructor
    {
        this.length = length;
        this.heigth = heigth;
        this.breadth = breadth;
    }

    void setDimension(int l , int h ,int b) // parameter function
    {
        length=l;
        heigth=h;
        breadth=b;
    }

    void showdata() // function without parameter
    {
        // work to do
        System.out.println("length "+length);
        System.out.println("breadth "+breadth);
        System.out.println("Heigth "+heigth);
    }
}


