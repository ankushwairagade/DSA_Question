package com.ankush._6_Arrays.Questions.Maxium_Difference;

public class Max_difference {
    // Maximum Difference in array without any conditions

    public static void main(String[] args) {
                int [] arr = {2, 3, 10, 6, 4, 8, 1};

                System.out.println("Max difference  "+(max(arr) - min(arr)));
    }

    static int min(int [] arr)
    {       int min=99999;
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]) min=arr[i];
        }
        return min;
    }
    static int max(int [] arr)
    {     int max= -99999;
        for (int i = 0; i < arr.length; i++) {

                if(max<arr[i]) max=arr[i];

        }
        return max;
    }
}
