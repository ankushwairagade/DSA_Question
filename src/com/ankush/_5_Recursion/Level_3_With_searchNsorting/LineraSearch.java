package com.ankush._5_Recursion.Level_3_With_searchNsorting;

public class LineraSearch {
    public static void main(String[] args) {

        int[] arr = {14,1,25,36,15,89,65,4,10,69};
        System.out.println(LinearF(arr,0,10));
        System.out.println(LinearB(arr,arr.length-1,10));
    }

    static int LinearF (int[] arr,int n ,int key)  // searching from Start
    {   if(n == arr.length) return -1;

        if(arr[n] == key) return n;
        else return LinearF(arr,n+1,key);
    }




    static int LinearB(int[] arr,int n, int key) // seaching from end
    {
        if(n<=0) return 0;

        if(arr[n-1] == key) return n-1;

        return LinearB(arr,n-1,key);
    }
}
