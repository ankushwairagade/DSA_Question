package com.ankush._6_Arrays.Questions.SortingAlgo;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr1={12,15,9,16,94,510,35,6,9};

        System.out.print(Arrays.toString(Msort(arr1)));

    }

    static int[] Msort(int[]arr)
    {
        if(arr.length==1) return arr;

        int mid= arr.length/2;
        int[] left =Msort(Arrays.copyOfRange(arr,0,mid));
        int[] right=Msort(Arrays.copyOfRange(arr,mid,arr.length));

        return Merge(left,right);

    }

    static int[] Merge(int[] left, int[] right)
    {
        int []mix=new int[left.length+right.length];
        int l=0,r=0,k=0;
        while(l<left.length && r<right.length)
        {
            if(left[l] < right[r])
            {
                mix[k]=left[l++];
            }
            else
            {
                mix[k]=right[r++];
            }
            k++;
        }

        while(l<left.length)
        {
            mix[k++] = left[l++];
        }
        while (r<right.length)
        {
            mix[k++] = right[r++];
        }

       return mix;
    }
}
