package com.ankush._6_Arrays.Questions.Maxium_Difference;

import java.util.Arrays;

public class method1 {


    public static void main(String [] args)
    {
                    int [] nums = {9,4,3,2};
                    System.out.println(Arrays.toString(min(nums)));
                    int [] min= min(nums);
                    System.out.println(max(nums,min[0]));
                    int difference=(max(nums,min[0]))-min[1];
                    System.out.println(difference);
    }
    // brute force method

   static int[] min(int[] arr )
    {
        int min=999999,m=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(min>arr[i]) {
                min= arr[i]; m=i;
            }
        }
        int [] re = {m,min};
        return re;
    }

    static int max(int[]arr,int i)
    {   int max=-999999;
        for(int j=i;j<arr.length;j++)
        {
            if(max < arr[j]){
                max = arr[j];
            }
        }
            return max;
    }



}
