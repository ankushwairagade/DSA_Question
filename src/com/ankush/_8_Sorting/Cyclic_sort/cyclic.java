package com.ankush._8_Sorting.Cyclic_sort;

import java.util.Arrays;

public class cyclic {
    public static void main(String[] args) {

        int []arr={5,4,1,2,3};
        cyclicSort(arr);
        System.out.print(Arrays.toString(arr));
    }

    // ye google, amazon .... many more indirect question aate hai
    // T(n) = 0(n)

   static void cyclicSort(int [] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]==arr[correct]){i++;}
            else{
                swap(arr,i,correct);
            }

        }


    }

   static private void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }

}
