package com.ankush._6_Arrays.Questions.TwoRepeating_element;

import java.util.Arrays;

public class bruteforce_method {
    // n*n    total complexity is   0 (n.logn)
    public static void main(String[] args) {
        int [] arr={4, 2, 4, 5, 2, 3, 1};
        System.out.println(Arrays.toString(finding(arr)));
    }

    static int[] finding(int []arr)
    {
        Arrays.sort(arr);  //  T(n) = 0 ( n.log n )
        int []set = new int[2];
        int p=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1])
            {
                set[p++]=arr[i];
            }
        }


        return set;
    }
}
