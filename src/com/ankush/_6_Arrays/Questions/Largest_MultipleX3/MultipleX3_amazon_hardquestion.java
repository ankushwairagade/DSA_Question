package com.ankush._6_Arrays.Questions.Largest_MultipleX3;

import java.util.Arrays;

public class MultipleX3_amazon_hardquestion {
// https://leetcode.com/problems/largest-multiple-of-three/

    public static void main(String[] args) {
        int[] arr = {8, 6, 7, 1, 0};
        Arrays.sort(arr);
        int[] pass = solution(arr);
        print(arr, pass[0], pass[1]);

    }

    static void print(int[] arr, int s, int e) {
        char a = '"';
        String retu = "";
        retu = retu.concat(String.valueOf(a));
        for (int i = e; i >= s; i--) {
            //    System.out.print(arr[i]);
            retu = retu.concat(String.valueOf(arr[i]));
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                retu = retu.concat(String.valueOf(arr[i]));
            }

        }

        retu = retu.concat(String.valueOf(a));
        System.out.print(retu);
    }

        static int[] solution ( int[] arr)
        {

            int s = 0, e = arr.length - 1;
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }

            while (s < e) {
                if (sum % 3 == 0) return new int[]{s, e};

                if (sum % 3 == 1) {
                    sum = sum - arr[s];
                    s++;
                }
                if (sum % 3 == 2) {
                    sum = sum - arr[e];
                    e--;
                }
            }


            return new int[]{-1};
        }


    }

