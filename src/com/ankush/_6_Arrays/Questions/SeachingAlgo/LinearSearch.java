package com.ankush._6_Arrays.Questions.SeachingAlgo;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={12,5,8,6,9,5,2,151};
        System.out.println(Linear(arr,59));
    }

    static int Linear(int [] arr , int target )
    {
        for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] == target) return i;
        }

        return -1;
    }
}
