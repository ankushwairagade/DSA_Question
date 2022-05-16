package com.ankush._7_Searching.Questions;

public class CeilingNFlooring {

    // ceilling of number given array
    // arr[] =[2,3,5,9,14,16,18], target =15
    // what do you mean ceilling ?
    // smallest element in array greater or = target
    // Ceilling (arr , target=14) =>>> 14
    // Ceilling (arr,target=15) =>>> 15
    // Ceilling (arr, target=4) =>> 5


    public static void main(String[] args) {
int []arr={2,3,5,9,14,16,18};
System.out.println( CeillingOfNumber(arr,1));
System.out.println(flooraNumber(arr,1));

    }

    static int CeillingOfNumber(int []arr, int target)
    {
        if(target > arr[arr.length-1]) return -1; // overflow condition catched

        int s=0,e=arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid] == target){
                return mid;}
            if(target < arr[mid])
            {
                e=mid-1;
            }
            if(target > arr[mid]){
                s=mid+1;
            }

        }

        return s;
    }


    static int flooraNumber(int[]arr, int target)
    {
        if(target <arr[0]) return -1;
        int start=0,end=arr.length-1;

        while(start <= end)
        {
            int mid = start + (end -start )/2;
            if(arr[mid] == target) return mid;

            if(target < arr[mid])
            {
                end=mid-1;
            }
            if(target > arr[mid]) { start = mid+1;}
        }

        return end;
    }
}
