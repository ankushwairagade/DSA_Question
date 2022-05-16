package com.ankush.ImptopicRevision;

public class today3522 {
    // revision

    public static void main(String[] args) {
        int []arr = { 3,5,1,4};

        System.out.println(MissingNumber(arr));
    }
    // cyclic sort
    //
    // range ( 0 |  1  to  n-1 | n ) used cyclic sort
    static void cyclicsort(int [] arr)
    {
        int i=0;
        while(i <arr.length)
        {
            int correct = arr[i];
            if(arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            }else i++;
        }
    }

    static int MissingNumber(int []arr)
    {
        int i=0;

        while(i< arr.length)
        {
            int ci = arr[i]-1;
            if( ci <arr.length-1 && arr[i] != arr[ci] )
            {
                swap(arr,i,ci);
            }else i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1)
            {
                return j+1;
            }
        }
        return -1;
    }
    static void swap(int []arr ,int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


}
