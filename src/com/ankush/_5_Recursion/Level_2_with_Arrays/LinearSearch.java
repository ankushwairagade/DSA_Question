package com.ankush._5_Recursion.Level_2_with_Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int [] arr ={1,5,2,6,9,42,558,8,4,10,251,250,269,350};

            System.out.println(Linear(arr,arr.length,350));
    }

    static int Linear(int[] arr , int n,int key)
    {
        if(n<=0) return -1;
        if(arr[n-1]==key) return n-1;

        return Linear(arr,n-1,key);
    }
}

