package com.ankush._9_String.Basic_Question;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();

        System.out.println(SubsetString("","wxyz"));
       // SubSeq("","abc");
     //   SubsetASCII("","abc");
        int [] arr ={1,2,2};
        System.out.println(subset(arr));
    }
            // two string first is processing , second one is Unprocessing which has data inside
    static void SubSeq(String p , String up)
    {
        // base condition
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        SubSeq(p+ch,up.substring(1));
        SubSeq(p,up.substring(1));

    }
    static ArrayList<String> SubSeqret(String pro , String unpro)
    {
        if(unpro.isEmpty())
        {
            ArrayList<String> ls = new ArrayList<>();
            ls.add(pro);
            return ls;
        }

        char ch = unpro.charAt(0);

        ArrayList<String> left =  SubSeqret(pro+ch,unpro.substring(1));
        ArrayList<String> right = SubSeqret(pro,unpro.substring(1));
        left.addAll(right);
        return left;
    }

    static ArrayList<String> SubsetString(String p , String up)
    {
        if(up.isEmpty())
        {// base condition hit hue hai return p string
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = SubsetString(p+ch,up.substring(1));  // take it
        ArrayList<String> right = SubsetString(p,up.substring(1));      // leave it

        right.addAll(left);
        return right;
    }

    // printing ASCII Subseq
    static void SubsetASCII(String p ,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p); return;
        }
        char ch = up.charAt(0);
        SubsetASCII(p+(ch+0),up.substring(1));
        SubsetASCII(p,up.substring(1));
    }

    //  Iterative

    static List<List<Integer>> subset(int [] arr)
    {
        List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());
        for (int num:arr) {
            int n = outer.size();
            for (int j = 0; j < n; j++) {
                List<Integer>internal = new ArrayList<>(outer.get(j));
                    internal.add(num);
                    outer.add(internal);
            }
        }
        return outer;
    }

}
