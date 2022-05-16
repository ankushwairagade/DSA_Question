package com.ankush._7_Searching.Questions;

// medium Level Leetcode
public class PeakElement {

    public static void main(String[] args) {
        int []arr={0,1,2,3,7,8,9,2,1,0};
        System.out.println(peak(arr));
    }

    static int peak(int[] arr)
    {
        int s=0, e = arr.length-1;

        while(s<e)
        {
            int mid = s+ (e-s)/2;
                // 8 > 9
            if(arr[mid] >arr[mid+1])
            {
                e=mid;
            }else {
                s=mid+1;
            }
        }
        return arr[s];
    }
}
