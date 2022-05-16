package com.ankush.ImptopicRevision;

import java.util.Arrays;

public class Concept_Searching_Sorting {
    public static void main(String[] args) {

        int[] arr ={2,65,1,65,49,652,68,4152,13,1,96};
       // System.out.println(Arrays.toString(MergeSort(arr)));
       // QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

      //  BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // MergeSort
    static int [] MergeSort(int [] arr)
    {
        if(arr.length == 1) return arr;
        int mid = arr.length/2;
        int [] left = MergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right =  MergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return MergeTwo(left,right);
    }
    private static int[] MergeTwo(int[] left, int[] right) {
        int [] mix = new int[left.length + right.length];

        int i=0,j=0,m=0;

        while (i <left.length && j < right.length)
        {
            if( left [i] < right[j])
            {
                mix[m]=left[i++];
            }else{
                mix[m] = right[j++];
            }
            m++;
        }

        while(i<left.length)
        {
            mix[m++] =left[i++];
        }
        while(j<right.length)
        {
            mix[m++] = right[j++];
        }

        return mix;
    }


    // QuickSort
    static  void QuickSort(int []arr ,int lo , int hi)
    {
        // base condition
        if(lo >= hi) return;
      int s=lo , e =hi , mid = s+(e-s)/2;
      int pivot = arr[mid];

      while( s <= e)
      {
          while(arr[s] < pivot) s++;
          while (pivot < arr[e]) e--;

          // swap
          if(s <= e)
          { int temp = arr[s];
              arr[s++]=arr[e];
              arr[e--] =temp;

          }
      }

        QuickSort(arr,lo,e);
        QuickSort(arr,s,hi);
    }

    // BubbleSort
    static void BubbleSort(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] > arr[j+1])
                {
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    // Searching Algorithm


}

