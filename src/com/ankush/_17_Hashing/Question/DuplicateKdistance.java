package com.ankush._17_Hashing.Question;

import java.util.HashSet;

public class DuplicateKdistance {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,1,5,8};

        System.out.println(Kdistance(arr,3));
    }

    private static boolean Kdistance(int[] arr, int k) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            if(set.contains(arr[i])) return true;

            set.add(arr[i]);

            if(set.size()>k)
            {
                set.remove(arr[i-k]);
            }


        }


        return false;
    }
}
