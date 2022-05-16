package com.ankush._8_Sorting.Merge_sort;

import java.util.Arrays;

public class Merge2_array {

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 8,9,9,9,50};
        int[] arr2 = {5, 6, 12, 50};
        System.out.print(Arrays.toString(mergetwoSortedArray(arr1, arr2)));
    }

    static int[] mergetwoSortedArray(int[] left, int[] right) {

        int mix[]=new int[left.length + right.length];

        int i=0,j=0,k=0;

        while(i < left.length && j < right.length)
        {
            if(left[i]<right[j])
            {
                mix[k]=left[i++];
            }else
            {
                mix[k]= right[j++];
            }
            k++;
        }

        // remaining element just copy them into array

        while(i<left.length)
        {
            mix[k++]=left[i++];
        }
        while ((j< right.length))
        {
            mix[k++]=right[j++];
        }




    return mix;
    }
}

