package com.ankush._15_Matrix;

import java.util.Arrays;
import java.util.Random;

public class SearchingMatrix_Linear {

    // for random matrix  --- > Linear searching in MATRIX
    // t(n) = 0(n*m) || (row * col)  || n^2]
    public static void main(String[] args) {

        int[][]arr=new int[4][4];

        initarray(arr,20);
        print(arr);
        System.out.println(Arrays.toString(searching(arr, 15)));

    }

    static void initarray(int[][] arr, int upto)
    {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j]=rand.nextInt(upto);
            }
        }
    }

    static void print(int[][]arr)
    {
        for (int i = 0; i < arr.length; i++) {

            for(int x : arr[i])
            {
                System.out.print(x+"  ");
            }
            System.out.println();
        }
    }
    static int[] searching(int[][]arr,int target)  // N^2
    {
        int[] found={-1,-1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target)
                {
                    found[0]=i;
                    found[1]=j;
                    return found;
                }
            }
        }


        return found;
    }
}
