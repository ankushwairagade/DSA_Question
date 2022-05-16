package com.ankush._11_Stack;

import java.util.Stack;
public class MinBracketReversal {
    public static void main(String[] args) {
        String str ="}}{{";
        System.out.println(MinReversal(str));
    }

    private static int MinReversal(String str) {

        int len = str.length();
        if(len %2 !=0) {
            // odd count hue toh return -1;
            return -1;
        }

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < len; i++) {
            char c =str.charAt(i);
            if(!s.isEmpty() && s.peek() == '}')
            {
               if(s.peek()=='{') s.pop();
               else s.push(c);

            }else{
                s.push(c);
            }

        }

        int  unbal_len = s.size();
        int n=0;

        while (!s.isEmpty() && s.peek()=='{')
        {
            s.pop();
            n++;
        }


        return (unbal_len / 2 + n%2);
    }
}
