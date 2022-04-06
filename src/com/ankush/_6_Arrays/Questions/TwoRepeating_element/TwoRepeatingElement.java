package com.ankush._6_Arrays.Questions.TwoRepeating_element;

import java.util.Arrays;

//https://www.geeksforgeeks.org/find-the-two-repeating-elements-in-a-given-array/
//https://leetcode.com/problems/find-the-duplicate-number/
// Medium level question
public class TwoRepeatingElement {


    // cyclic sort
    // Geeksforgeeks

    public static void main(String[] args) {

        int [] arr={4, 2, 4, 5, 2, 3, 1};
        System.out.println(Arrays.toString(finding(arr)));
    }


    static int[] finding(int[] arr)
    {
        int i=0;
        while (i<arr.length)
        {   int correctindex=arr[i]-1;
            if(arr[i]!=arr[correctindex])
            {
                int temp=arr[i];
                arr[i]=arr[correctindex];
                arr[correctindex]=temp;
            }else i++;
        }


        return new int[]{arr[arr.length-2],arr[arr.length-1]};
    }
}
