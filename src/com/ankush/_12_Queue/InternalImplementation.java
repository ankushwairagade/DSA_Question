package com.ankush._12_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InternalImplementation {

    // Collection Framework


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue.add(20));
        queue.add(95);
        queue.add(98);
          System.out.println(queue.element() ); // front
          System.out.println(queue.remove());
           // check out internal functions and that all !

    }

}
