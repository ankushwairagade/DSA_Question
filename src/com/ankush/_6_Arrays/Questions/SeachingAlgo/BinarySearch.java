package com.ankush._6_Arrays.Questions.SeachingAlgo;

public class BinarySearch {

    public static void main(String[] args) {
        // binary search condition is array should sorted   BS = T(n) =0(log n)
        int[] arr={2,6,8,9,15,18,19,24,26,29,35,40};
        System.out.println(Binary(arr,69));
    }

    static int Binary(int [] arr ,int target)
    {
            int start =0, end= arr.length-1;

            while(start <= end)
            {
                int mid =start + (end-start) / 2;
                if(arr[mid] == target) return mid;

                if(target < arr[mid]) end = mid-1;

                if(target > arr[mid]) start = mid+1;
            }



            return -1;
    }

}
