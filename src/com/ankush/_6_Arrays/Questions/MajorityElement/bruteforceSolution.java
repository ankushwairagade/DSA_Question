package com.ankush._6_Arrays.Questions.MajorityElement;

import java.util.Arrays;

public class bruteforceSolution {
    public static void main(String[] args) {
            int [] arr ={3,2,3};
            Solution(arr);

    }  // 2 2 3 3 4 4 4 4


    static void Solution(int [] arr)  //  t(n) =0(n/2) = 0(n)
    {
        Arrays.sort(arr);
        // n/2 times
        int n = (arr.length )/ 2;

        for (int i = 0; i < (arr.length/2) + 1 ; i++) {
            if(arr[i] == arr[i+n] )
            {
                System.out.println(arr[i]);
            }
        }


    }
}
