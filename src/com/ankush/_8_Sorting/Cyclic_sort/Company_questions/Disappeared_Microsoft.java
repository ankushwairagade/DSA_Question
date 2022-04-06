package com.ankush._8_Sorting.Cyclic_sort.Company_questions;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class Disappeared_Microsoft {

    // Given an array nums of n integers where nums[i] is in the range [1, n],
    // return an array of all the integers in the range [1, n] that do not appear in nums.
    // ----->  to apply cyclic sort     hints is range [1,n]   then check  example
    // Input: nums = [4,3,2,7,8,2,3,1]      //Output: [5,6]

    public static void main(String[] args) {
        //int [] nums = {4,3,2,7,8,2,3,1};
        int []nums = {1,2,2,2,8,5,7,8};
        System.out.print(Solution(nums));

    }

    static List<Integer> Solution(int [] arr)
    {
        List<Integer> list = new ArrayList<>();

        int i=0;
        while(i<arr.length)
        {       // range [1,n]
            int correctIndex = arr[i]-1;

            if(arr[i]!=arr[correctIndex])
            {
                swap(arr, i ,correctIndex);
            }else{i++;}


        }


        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1) list.add(j+1);
        }

        return list;
    }

    private static void swap(int[] arr, int i, int correctIndex) {

        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] =temp;
    }
}
