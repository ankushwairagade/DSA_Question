package com.ankush._6_Arrays.Questions.FindPair_suminarray;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum/
public class bruteforceMethod {
    public static void main(String[] args) {

        int [] arr ={1, -2, 1, 0, 5};
        System.out.println(Arrays.toString(sol(arr, 2)));

    }

    static int [] sol(int []arr,int sum)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length-1; j++) {
                if(arr[i]+arr[j+1] == sum)
                {   int[] a= new int[]{i, j + 1};
                    return a;
                }
            }
        }
        int[]x=new int[]{-1,-1};
    return x;
    }
}
