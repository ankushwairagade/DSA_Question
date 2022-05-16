package com.ankush._6_Arrays.Questions.NoOccurringOddNumberofTime;

public class XorMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3 , 4 , 4};   // sort  1 , 1 , 2 , 2 , 3 , 3 , 3 , 4 , 4
        //Output : 3                        //                1   0   1   0   1   0   1

        System.out.println(sol(arr));
    }

    static int sol2(int []arr)
    {   int max=0;
        for(int x :arr)
        {
            max ^=x;
        }
        return max;

    }

    static int sol (int []arr) // Now, this also works
    {   int max=0;
        for (int i = 0; i < arr.length; i++) {

            max ^= arr[i];

        }
        return max;

    }
}
