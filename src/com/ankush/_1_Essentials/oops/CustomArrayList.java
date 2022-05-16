package com.ankush._1_Essentials.oops;

public class CustomArrayList {


    private  int[] arr;
    private final int DEFAULT_SIZE=10;
    private int size=0;

    CustomArrayList()
    {
        arr= new int[DEFAULT_SIZE];
    }

    void add(int num)
    {
        if(isFull())
        {
                resizearray();
        }
        arr[size++] =num;
    }

    private void resizearray() {
        int []arnew = new int[DEFAULT_SIZE * 2];

        for (int i = 0; i < arr.length; i++) {
            arnew[i] = arr[i];
        }
    }

    private boolean isFull() {

        return size == arr.length-1;
    }



    public static void main(String[] args) {

    }
}
