package com.ankush.ImptopicRevision;

import java.util.HashSet;

public class ba {
    public static void main(String[] args) {
        int[]arr={1,2,2,3,4,1};
        System.out.println(RepeatingNumber(arr,arr.length));
    }
    static int RepeatingNumber(int arr[], int size)
    {
        HashSet<Integer> s = new HashSet<>();

        int max=0;
        for(int i = 0; i < size; i++)
        {
            if(!s.isEmpty() && s.contains(arr[i])) {
                System.out.println(arr[i] + "  ");
                max ^= arr[i];

            }
            s.add(arr[i]);

        }
        return max;
    }
}
