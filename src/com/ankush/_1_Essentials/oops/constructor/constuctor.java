package com.ankush._1_Essentials.oops.constructor;

public class constuctor {

    public static void main(String[] args) {

        animal obj1 = new animal();                 // default constructor
        animal obj2 = new animal("tiger");    // parameter constructor
        animal obj3 = new animal(obj2);             // Copy contructor

        obj1.show();
        obj2.show();
        obj3.show();
    }
}

 class animal
 {  String name;

     public animal(animal obj2) // Copy Constructor
     {
         name = obj2.name;
     }

     public animal(String name)  // parameter Constructor
     {
         this.name=name;
     }

     public animal()  // Default Constructor
     {
         name="Monkey";
     }


     void show()
     {
         System.out.println(name);
     }
 }
