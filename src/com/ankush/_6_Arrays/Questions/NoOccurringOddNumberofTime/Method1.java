package com.ankush._6_Arrays.Questions.NoOccurringOddNumberofTime;

public class Method1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3 , 4 , 4};   // sort  1 , 1 , 2 , 2 , 3 , 3 , 3 , 4 , 4
        //Output : 3                        //                1   0   1   0   1   0   1

            System.out.println(sol(arr));
    }


    static int sol(int[] arr)  // T= 0(n^2)  ,S=0(1)
    {
        for (int i = 0; i < arr.length-1; i++) {
                int count=0;
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[i] == arr[j]) count++;
            }
            if(count %2 !=0 )return arr[i];
        }

        return -1;
    }
}
