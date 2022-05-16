package com.ankush._6_Arrays.Questions.FindPair_suminarray;

import java.util.Arrays;

public class Method2 {

    public static void main(String[] args) {

        int arr[] = {0, -1, 2, -3, 1};
        System.out.println(Arrays.toString(Sol(arr,3)));
    }


    static int [] Sol (int[] arr ,int sum)  // this function give T(n) = 0(n . log n)  // while loop liye  n * movement k liye log n
    {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int s=0,e= arr.length-1;

        while(s<e)
        {
            if(arr[s]+arr[e] == sum)
            {
                int a=arr[s],b=arr[e];
                int [] re = {a,b};
                return re;
            }

            if(arr[e]+arr[s] < sum)
            {
                s++;
            }else{
                e--;
            }

        }

        return new int[]{-1, -1};
    }


}
