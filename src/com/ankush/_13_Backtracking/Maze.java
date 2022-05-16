package com.ankush._13_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Maze {

    // finding total paths in maze N*M

    public static void main(String[] args) {
       // System.out.println(CountPath(3,3));
       // Allpath("",3,3);
       // System.out.println(RetAllPath("",3,3));
        System.out.println(MoveAlsoDiagonal("",3,3));
    }

    static int CountPath(int r , int c) // Move at one step either Right or Down  Calculating Paths
    {
        if(r == 1 || c == 1){
            return 1;
        }

        int left = CountPath(r, c-1);
        int right = CountPath(r-1 , c);

        return (left+right);
    }

    static void Allpath(String p , int r , int c)
    {
        if( r == 1 && c == 1)
        {
            System.out.println(p);
            return;
        }
        if(r!=1) {
            Allpath(p+"D", r - 1, c);
        }
        if(c!=1){
        Allpath(p+"R",r,c-1);
    }
    }

    static List<String> RetAllPath(String p ,int r , int c)
    {
        if(r ==1 && c== 1)
        {
            List<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }
        List<String> ans = new ArrayList<>();

        if (c != 1) {

            ans.addAll(RetAllPath(p+"R",r,c-1));
        }
        if(r!=1){
            ans.addAll(RetAllPath(p+"D",r-1,c));
        }


        return ans;

    }

    static List<String> MoveAlsoDiagonal(String p ,int r , int c)
    {
        if(r == 1 && c == 1)
        {
            List<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }
        List<String> ans = new ArrayList<>();
        if(r >1 && c > 1){
            ans.addAll(MoveAlsoDiagonal(p+'D',r-1,c-1));
        }
        if(r > 1){
            ans.addAll(MoveAlsoDiagonal(p+'H',r-1,c));
        }

        if (c > 1) {

            ans.addAll(MoveAlsoDiagonal(p+'V',r,c-1));
        }
        return ans;

    }
}
