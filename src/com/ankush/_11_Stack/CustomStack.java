package com.ankush._11_Stack;

public class CustomStack {
    int[] arr;
    int top = -1;
    static int size = 10;

    CustomStack() {
        this.arr = new int[size];
    }

    CustomStack(int si) {
        this.arr = new int[si];
    }


    void push(int val)
    {
        if(top >arr.length-1){
            System.out.println("OverFlow");
            return;
        }
        top++;
        arr[top]=val;
        System.out.println(val+" Successfully inserted into stack");
    }

    void peek()
    {
        if(top >arr.length-1){
            System.out.println("OverFlow");
            return;
        }

        System.out.println("Peek element is "+arr[top]);
    }

    void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack in UnderFlow"); return;
        }

        // otherwise

        int removed = arr[top--];
        System.out.println(removed+" the element poped from stack");
    }

    void Display()

    {
        if(top == -1){
            System.out.println("UnderFlow can't Display anything");
        }

        for (int i = 0; i <= top; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {

        CustomStack stack = new CustomStack(20); // bydefault size is 10  // other (put some custom value)
        stack.push(10); stack.push(97); stack.push(32); stack.push(65);
        stack.Display();
        stack.peek();
        stack.pop();
        stack.Display();

    }

}