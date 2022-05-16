package com.ankush._11_Stack;

import java.util.Random;
import java.util.Stack;

public class Reverse_the_Stack {

    public static void main(String[] args) {
        Random rand = new Random();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 10; i++) {
            stack.push((int)rand.nextInt(100));
        }
        System.out.println(stack);
        stack=CustomReverse(stack);
        System.out.println(stack);

    }

    private static Stack<Integer> CustomReverse(Stack<Integer> stack) {

        Stack<Integer> ls = new Stack<>();
        while(!stack.isEmpty()) ls.push(stack.pop());
        return ls;
    }
}
