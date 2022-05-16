package com.ankush._11_Stack;

import java.util.Arrays;
import java.util.Stack;

public class Stockspan {
    public static void main(String[] args) {
        int[] arr = {100, 30, 10, 20, 25, 40, 26, 35, 45};
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 0;

        for (int i = 1; i < arr.length; i++) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i])
                st.pop();


            span[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek() - 1);
        }
        System.out.println(Arrays.toString(span));
    }
 }
