package com.ankush._5_Recursion.Level_2_with_Arrays;

public class SumofArray {
    public static void main(String[] args) {

        int arr[] = { 15, 2, 3, 4, 5 };

        System.out.println(sum(arr,arr.length));

        System.out.println(Product(arr,arr.length));
    }

    static int sum(int [] Arr ,int n)
    {
        if(n<=0) return 0;

        return Arr[n-1]+sum(Arr,n-1);
    }

    static int Product(int [] arr , int n)
    {
        if(n<=0) return 1;

        return arr[n-1]*Product(arr,n-1);
    }
}
