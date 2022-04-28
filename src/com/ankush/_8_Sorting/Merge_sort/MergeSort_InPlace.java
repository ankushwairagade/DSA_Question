package com.ankush._8_Sorting.Merge_sort;

import java.util.Arrays;

public class MergeSort_InPlace {

    public static void main(String[] args) {
        int [] arr={0,158,12,6,5,9,4,120,215,9,9,62,6};
        MergeSortInplace(arr,0,arr.length);
        System.out.print(Arrays.toString(arr));
    }

    static void MergeSortInplace(int[]arr , int s , int e)
    {
        if(e-s==1) return;
        int mid =(s+e)/2;
        MergeSortInplace(arr,s,mid);
        MergeSortInplace(arr,mid,e);

        merge(arr,s,mid,e);

    }

    private static void merge(int[] arr, int s, int mid, int e) {
        int []mix = new int[e - s];
        int i=s,j=mid,k=0;

        while(i < mid && j < e)
        {
            if(arr[i] < arr[j])
            {
                mix[k]=arr[i++];
            }else{
                mix[k]=arr[j++];
            }
            k++;
        }

        while(i< mid)
        {
            mix[k++]=arr[i++];
        }
        while (j < e){
            mix[k++]=arr[j++];
        }

        System.arraycopy(mix, 0, arr, s + 0, mix.length);




    }


}

