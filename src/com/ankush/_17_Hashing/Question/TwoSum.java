package com.ankush._17_Hashing.Question;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[]arr={21,5,4,7,9,6,2,66,1};
        // this is unsorted array and find two element which sum is equal to X
        // and return index
        int sum=71;

        System.out.println(Arrays.toString(TwoSUM(arr, sum)));

    }

    static int[] TwoSUM(int[]arr,int target)
    {
        int []res = new int[2];
        HashMap<Integer,Integer> hashMap= new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
        if(hashMap.containsKey(target - arr[i]))
        { res[0]=hashMap.get(target-arr[i]);
            res[1]=i;
            return res;
        }
        hashMap.put(arr[i],i);
        }
        return res;
    }

}
