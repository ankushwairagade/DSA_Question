package com.ankush._6_Arrays.Questions.FindPair_suminarray;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum/
public class bruteforceMethod {
    public static void main(String[] args) {

        int [] arr ={1, -2, 1, 0, 5};
        System.out.println(Arrays.toString(sol(arr, 2)));

    }

    static int[] sol(int []arr ,int sum)        // ye function 0(n^2) so high
    {
        int a=-1,b=-1,flag=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if(arr[i] + arr[j] == sum)
                {
                    a=arr[i]; b=arr[j]; flag=1; break;
                }
            }

            if(flag == 1) break;
        }

        int[] re ={a,b};
        return re;
    }
}
