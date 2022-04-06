package com.ankush._5_Recursion.Level_2_with_Arrays;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.ArrayList;
import java.util.List;

public class MultipleOccurrence {
    public static void main(String[] args) {
            int [] arr = {1,2,4,3,4,5};
            ArrayList<Integer> list = new ArrayList<>();
            //System.out.println(Finding(arr,4,0,list));

        System.out.println(Sol(arr,0,4));
    }
        // ek problem ko solve krne ke multiple Solution hai ... different Variation
    static ArrayList<Integer> Finding(int[] arr,int key,int index,ArrayList<Integer> list)
    {

        if(index == arr.length) return list;

        if(arr[index] == key ) list.add(index);

        return Finding(arr,key,index+1,list);

    }


    // VVI goal return the list don't take in argument
    // now Arraylist is created  inside it

    // problem every function call have a new Array List
    //  fun ( arr , index , key )


    static ArrayList<Integer> Sol(int[] arr, int index , int target)
    {
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length) return list;

        if(arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFrombelowCalls =  Sol(arr,index+1,target);

        list.addAll(ansFrombelowCalls);

        return list;
    }

    // this above approach is not optimized bcz of creating
    // multiple list in own function call
    // but this is the one way to solve problem
    // also understand the basic of recursion very well





}
