package com.ankush._8_Sorting.Cyclic_sort.Company_questions;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/missing-number/
public class Missingnumber_Amazon {

    // problem statement input array [3,0,1] find missing numbers?  o/p =2
    // understand array contain 0-n element then hit cyclic sort condition

    // what we are doing in this question is ...
    // we can't find correct == arr[i]-1
        // 3  we can't find correct index so we skipped this thing
// they mention range [0, n]


    public static void main(String[] args) {
        int [] arr = {3,0,1};
        List<Integer> list = new ArrayList<>();
        System.out.print(cyclic(arr));
    }
        // Time Complexity Linear bcz of Cyclic Sort
    static int cyclic(int [] arr)
    {   int i=0;
        while(i<arr.length)
        {
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }else{i++;}

        }
        // my array is sorted now i want to check
        // if  i != i+1 then element

        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j) return j;
        }
        return arr.length;
    }

    private static void swap(int[] arr, int i, int correct) {

        int temp = arr[i];
        arr[i]=arr[correct];
        arr[correct] =temp;
    }

}
