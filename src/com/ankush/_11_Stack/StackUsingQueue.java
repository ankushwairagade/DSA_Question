package com.ankush._11_Stack;

import java.util.Random;
import java.util.Stack;

public class StackUsingQueue {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            stack1.push((int)rand.nextInt(100));
        }
        System.out.println(stack1);
        while(!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }


        System.out.println(stack2);
    }
}
