package com.ankush._11_Stack;

import java.util.*;

public class InternalImplemetation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(18);
        stack.push(75);
        stack.push(20);
        stack.push(99);
     //  System.out.println(stack.pop());
     //  System.out.println(stack.peek());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(20);queue.add(28);queue.add(9);queue.add(5);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.peek());

        Deque<Integer> deque = new ArrayDeque<>();
        // Doubly Queue on simple words
        /// add from both end and also delete from both end

        // Deque faster than queue and stack


    }
}
