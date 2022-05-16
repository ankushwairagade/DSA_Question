package com.ankush._11_Stack;

import java.util.Random;

public class CustomReversalStack {


        int [] arr;
       static int size = 50;
        int top =-1;

        public CustomReversalStack()
        {
            this.arr=new int[size];
        }
        public CustomReversalStack(int si) {
            this.arr = new int[si];
        }

        public  boolean isEmpty()
        {
            if(top ==-1) return true;

            return false;
        }

        public void push(int val)
        {
            if(top >arr.length-1)
            {
                System.out.println("Over flow");
                return;
            }

            arr[++top] = val;
            System.out.println("Pushed on stack "+val);
        }

        public int pop()
        {
            if(top == -1)
            {
                System.out.println("Stack in UnderFlow ");
                return -1;
            }

            return arr[top--];
        }

        public void Display()
        {  if(top ==-1) {
            System.out.println("Underflow"); return;
        }
            for (int i = 0; i <= top; i++) {
                System.out.print("  "+arr[i]);
            }
        }

        public void peek()
        {
            if(top ==-1) {
                System.out.println("underFlow"); return;
            }
            System.out.println("Peek is "+arr[top]);
        }




    public static void main(String[] args) {
        CustomReversalStack obj = new CustomReversalStack(20);
        Random rand = new Random();
       // System.out.println(obj.arr.length);
        obj.Display();
        for (int i = 0; i < 10; i++) {
            obj.push((int)rand.nextInt(100));
        }
        System.out.println("Check Stack Empty or not  "+obj.isEmpty());
        obj.pop();
        obj.pop();
        obj.peek();
        obj.Display();
        System.out.println();
        obj=Reversal(obj);
        System.out.println();
        obj.Display();
        System.out.println();
        obj.peek();
    }

    static CustomReversalStack Reversal(CustomReversalStack ll)
    {
        CustomReversalStack RE = new CustomReversalStack(ll.arr.length);
        while(!ll.isEmpty())
        {
            RE.push(ll.pop());
        }
        return RE;
    }
}
