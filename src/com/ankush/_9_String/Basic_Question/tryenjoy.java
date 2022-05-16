package com.ankush._9_String.Basic_Question;

import java.util.ArrayList;

public class tryenjoy {
    public static void main(String[] args) {
       // SubSequence_string("","abaa");

       // Permutation("","abc");

        System.out.println("Permutation abc =  "+PermutationRet("","abc"));
        System.out.println("Combination abc = "+Combination("","abc"));
        System.out.println(Permutationcount("","abc"));
        System.out.println(CombinationCount("","abc"));
    }
    // combination  clone it and add[i] it
    // height of tree * 2^n total time complexity

    static  void SubSequence_string(String p , String up) // combination
    {
        if(up.isEmpty())
        {
            System.out.print("["+p+"] "); return;
        }

        char ch = up.charAt(0);

        SubSequence_string(p , up.substring(1));  // leave it
        SubSequence_string(p+ch ,up.substring(1));  // add it
    }

    static void Permutation(String p , String up) // N!
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return; // stop recursion
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
                 String f = p.substring(0,i);
                 String e = p.substring(i,p.length());
                 Permutation(f+ch+e,up.substring(1));
        }
    }

    static ArrayList<String> PermutationRet(String p , String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i =0; i <= p.length() ;i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
          ans.addAll(PermutationRet(f+ch+s , up.substring(1)));
        }
        return ans;
    }

    static ArrayList<String> Combination(String p , String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }

        char ch = up.charAt(0);
        //ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> left = Combination(p,up.substring(1));
         ArrayList<String> right =Combination(p+ch , up.substring(1));
         left.addAll(right);
         return left;
    }

    static int Permutationcount (String p ,String up)
    {
        if(up.isEmpty())
        {
            return 1;
        }
            int count=0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
           count = count + Permutationcount(f+ch+s ,up.substring(1));
        }
        return count;
    }

    static int CombinationCount(String p ,String up)
    {
        int count=0;
        if(up.isEmpty()) return 1;

        char ch = up.charAt(0);

        count += CombinationCount(p,up.substring(1));
        count += CombinationCount(p+ch , up.substring(1));

        return count;
    }

}
