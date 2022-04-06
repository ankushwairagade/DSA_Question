package com.ankush._5_Recursion.Level_2_with_Arrays;

public class minNmax {
    public static void main(String[] args) {
        int [] arr={11,2,5,8,6,9,1,81};
        int min=999999 , max=-999999;
        System.out.println(min(arr,arr.length,min));
        System.out.println(max(arr,arr.length,max));
    }

    static int max(int[] arr,int n ,int max)
    {
        if(n<=0) return max;

        if(arr[n-1]>max) max=arr[n-1];

        return max(arr,n-1,max);
    }

    static int min (int [] arr , int n, int min)
    {
        if(n<=0) return min;

        if(min>arr[n-1]) min =arr[n-1];

        return min(arr,n-1,min);
    }
}
