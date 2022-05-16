package com.ankush._6_Arrays.Questions.Segregate;

import java.util.Arrays;
//https://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/
public class Method2 {

    public static void main(String[] args) {
        int [] arr={ 0, 1, 0, 1, 1, 1 };
        System.out.println(Arrays.toString(sol(arr)));
    }
        // fuck ,my mistake .. now its working fine
    static int[] sol(int [] arr) // something is fizzy
    {
        int start=0 , ending=arr.length-1;

        while(start<ending)
        {
            while(arr[start] == 0 && start < ending ) start++;
            while(arr[ending] == 1 && start<ending ) ending--;

            if(start < ending )
            {
                arr[start++] =0;
                arr[ending++]=1;

            }
        }


        return arr;
    }


}
