package com.ankush._6_Arrays.Questions.NoOccurringOddNumberofTime;

import java.util.Arrays;

public class Method2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 3, 1, 3 , 4 , 4};   // sort  1 , 1 , 2 , 2 , 3 , 3 , 3 , 4 , 4
        //Output : 3                        //                1   0   1   0   1   0   1

        System.out.println(sol(arr));

        // im doing somthing wrong step .... fuck off..
    }
    static int sol (int[] arr) // something wrong
    {
        Arrays.sort(arr);
        int voter = arr[0];
        int vote = 1;
        for (int i = 1; i < arr.length-1; i++) {

            if(vote <= arr[i] && vote == 1)
            {
              vote--;

            }else {
                if (vote == 0 && voter < arr[i]) {
                    voter = arr[i];
                    vote = 1;
                }else
                if(vote<arr[i] && vote == 1)
                {
                  return  arr[i];
                }


            }
        }
        return voter;
    }
}
