package com.ankush._6_Arrays.Questions.SortColors;

import java.util.Arrays;

// Amazon , microsoft
// https://leetcode.com/problems/sort-colors/
public class Sortcolor {
    public static void main(String[] args) {
        int[] arr = {2,0,1};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }

   static void sort(int [] nums){
    int z=0,o=0,t=0;

        for(int i=0;i<nums.length;i++)
        {
            if(z == nums[i]) z++;
            if(o == nums[i]) o++;
            if(t == nums[i]) t++;

        }
        System.out.print(z+"  "+o+"  "+t);

        for(int i=0;i<nums.length;i++)
    {
        if(z > 0)
        {
            nums[i]=0;
            z--;
        }
        else{
            if(z==0 && o > 0)
            {
                nums[i] = 1;
                o--;
            }else{
                if(z == 0 && o == 0 && t > 0)
                {
                    nums[i]=2;
                    t--;
                }
            }
        }

    }



    }
}
