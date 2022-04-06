package com.ankush._8_Sorting.Cyclic_sort.Company_questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// https://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/
// https://leetcode.com/problems/find-the-duplicate-number/

// ye question mai two variation hai   ye sol hard problem k liye sol kiya ha
public class findDuplicateNumbers {
    // PS: given Array n , element Range [0 to n-1]
    // T(n) = 0(n) S(n)=0(1)

/*    Input : n = 7 and array[] = {1, 2, 3, 6, 3, 6, 1}
    Output: 1, 3, 6
        */
// Medium level Question

    public static void main(String[] args) {
            int [] arr = {1,2,3,6,3,6,1};
            System.out.println(Solution(arr));


    }


    static List<Integer> Solution(int [] arr )
    {
        List<Integer> list = new ArrayList<>();
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }else {i++;}

        }

        // array is sorted here now we want to find duplicated number

        for (int j = 0; j < arr.length ; j++) {
            if(arr[j]!=j+1)
            {
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
