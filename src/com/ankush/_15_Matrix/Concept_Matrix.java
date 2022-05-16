package com.ankush._15_Matrix;

import java.util.Random;

public class Concept_Matrix {
    public static void main(String[] args) {
        // two-D array  [][]    || 2d array

        Random rand = new Random();

        int [][] arr = new int[5][7];  // row , col

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]= rand.nextInt(50);
            }
        }

        // row  arr.length
        // col  arr[0].length
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("  "+arr[i][j]);
            }
            System.out.println();
        }

    }
}
