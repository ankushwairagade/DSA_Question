package com.ankush._5_Recursion.Level_2_with_Arrays;

public class CheckSortArray {
    public static void main(String[] args) {
            int []arr = {25,6,9,5,11,2,29,0};
            int [] arr1 ={1,3,8,10,20,65,180,522};
            System.out.println(Check(arr1,0));

    }

    private static boolean Check(int[] arr, int i) {

        if(arr.length-1 ==i) return true;

        if(arr[i]< arr[i+1]) return Check(arr,i+1);
        else return false;

    }

    // Check krna hai ki array sort hai yaa nahi using Recursion



}
