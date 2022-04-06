package com.ankush._8_Sorting.Cyclic_sort.Company_questions;
// https://leetcode.com/problems/first-missing-positive/
public class FirstMissingPositive_Amazon {

    // tag is Hard
    // PS: Given unsorted array return smallest missing positive integer
    // algo thats run on T(n) =0(n) , S(n)=0(1)

/*
    Input: nums = [1,2,0]
    Output: 3
    Example 2:

    Input: nums = [3,4,-1,1]
    Output: 2
    Example 3:

    Input: nums = [7,8,9,11,12]
    Output: 1
    // looking to example range is [1,N]
    first example 1 ,2 ,0           correct = arr[i]-1;
         index    0  1  2
*/


    public static void main(String[] args) {

        int [] arr={1,2,0};
        System.out.print(Solution(arr));
    }

    static  int  Solution(int[] arr)
    {
        int i=0;
        while(i<arr.length) {
            int correct = arr[i] - 1;
            if (arr[i]>0 && arr[i]< arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
            // after this cyclic sort is applied
            // now find index
        }
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]!=j+1)
                {
                    return j+1;
                }
            }


        return 1;
    }

    private static void swap(int[] arr, int i, int correct) {

        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

}
