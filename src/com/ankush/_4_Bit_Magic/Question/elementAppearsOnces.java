package com.ankush._4_Bit_Magic.Question;
// https://www.geeksforgeeks.org/find-the-element-that-appears-once/
public class elementAppearsOnces {
/*

    Given an array where every element occurs three times,
    except one element which occurs only once. Find the element
    that occurs once. The expected time complexity is O(n) and O(1) extra space.
        Input: arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3}
                Output: 2
*/


    public static void main(String[] args) {
        int [] arr ={2,3,3,4,2,25,4};

        System.out.println(sol(arr));
    }

    static int sol(int []arr)
    {  int sum=0;

        for(int x:arr)
        {
            sum ^=x;
        }
        return sum;
    }


}
