package com.ankush._8_Sorting.Merge_sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int [] arr={0,158,12,6,5,9,4,120,215,9,9,62,6};
        System.out.print(Arrays.toString(mergesort(arr)));
    }
        // T(n) = 0 ( n.logn )
    static int[] mergesort(int[]arr)
    {
        if(arr.length==1) return arr;

        int mid = arr.length/2;

        int left[]=mergesort(Arrays.copyOfRange(arr,0,mid));
        int right[]=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge2array(left,right);
    }

    private static int[] merge2array(int[] left, int[] right) {
        int []mix=new int[left.length+ right.length];
        int i=0,j=0,k=0;
        while(i< left.length && j< right.length)
        {
            if(left[i]<right[j])
            {
                mix[k]= left[i++];
            }else{
                mix[k]= right[j++];
            }
            k++;
        }
        // remaining element should copy to array at back side
        // only one of the while loop is going to run and other is false

        while(i<left.length)
        {
            mix[k++]=left[i++];
        }
        while (j<right.length)
        {
            mix[k++] = right[j++];
        }
        return mix;
    }
}
