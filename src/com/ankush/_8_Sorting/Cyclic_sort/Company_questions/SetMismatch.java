package com.ankush._8_Sorting.Cyclic_sort.Company_questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/set-mismatch/
public class SetMismatch {
    // range is [1 ,N]
    // task is find repetition of number and loss of another number
   /*   Input: nums = [1,2,2,4]
        Output: [2,3]             */
    // just variation on cyclic sort

    public static void main(String[] args) {

        int [] nums ={1,2,2,4};
        System.out.print(Solution(nums));
    }


    static List<Integer> Solution(int [] arr)
    {
        List<Integer> list = new ArrayList<>();
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }else{i++;}
        }
        // sorted array hogya now find ith and valued of ith index
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j]!=j+1)
            {
                list.add(j+1);
                list.add(arr[j]);
            }
        }

        Collections.sort(list);
        return list;
    }

    private static void swap(int[] arr, int i, int correct) {
    int temp = arr[i];
    arr[i] = arr[correct];
    arr[correct] = temp;
    }


}
