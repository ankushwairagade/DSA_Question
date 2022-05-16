package com.ankush._15_Matrix;

import java.util.Scanner;

public class SearchingMatrix_Linear {

    // for random matrix  --- > Linear searching in MATRIX
    // t(n) = 0(n*m) || (row * col)  || n^2]


    public static void main(String[] args) {
        int [][]arr=new int[3][5];
        Scanner sc = new Scanner(System.in);
            System.out.println("Entering Number into array 3X5");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]= sc.nextInt();

            }
        }

        printingMatrix(arr);


        System.out.println("Searching  "+searchingInMaxtrix(arr,100));

    }

    private static boolean searchingInMaxtrix(int[][] arr,int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                if(arr[i][j] == target) return true;
            }
        }
        return false;
    }


    static  void printingMatrix(int[][]arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("  "+arr[i][j]);
            }
            System.out.println();
        }
    }

}
