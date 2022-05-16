package com.ankush._7_Searching.LinearSearch;

public class Linear {
    public static void main(String[] args) {

        int [] arr={51,26,5,4,15,9,6,21,541,18,9,96};
        int key=5;
        System.out.print(LS(arr,key));

    }

    static int LS(int[] arr, int key)  // Linear Search
    {
        for (int i = 0; i < arr.length; i++) {
            {
                if(arr[i]== key) return i;
            }
        }

        return -1;
    }
}
