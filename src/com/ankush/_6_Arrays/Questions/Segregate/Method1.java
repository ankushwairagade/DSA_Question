package com.ankush._6_Arrays.Questions.Segregate;

import java.util.Arrays;

public class Method1 {

    public static void main(String[] args) {
            int [] arr={0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
            System.out.println(Arrays.toString(segregate(arr)));
    }

    static int[] segregate(int []arr)
    {
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) count++;
        }

        for (int i = 0; i < arr.length; i++) {
            if(count >0)
            {
                arr[i]=0; count--;
            }else{
                arr[i] = 1;
            }
        }

        return arr;
    }

}
