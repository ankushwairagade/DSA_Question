package com.ankush._6_Arrays.Questions;
// https://www.geeksforgeeks.org/find-subarray-with-given-sum/
public class FindSubarraywithGivenSum {

    public static void main(String[] args) {

        int []arr={1,4,20,3,10,5};
        int sum=37;
        int s=0,e=1, ans=arr[0];
        while(s <= e)
        {
            if(ans==sum)
        {
            System.out.println("index "+s+" to "+(e-1));
            break;
        }

            if(ans < sum)
            {
                ans=ans+arr[e++];
            }else
            {
                ans=ans-arr[s++];
            }


        }
    }
}
