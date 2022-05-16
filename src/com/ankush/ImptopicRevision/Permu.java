package com.ankush.ImptopicRevision;

public class Permu
{
    public static void main(String[] args) {

        Combination("","abc");
        System.out.println();
        Permutation("","abc");
    }

    static void Combination(String p ,String up)
    {
        if(up.isEmpty())
        {
            System.out.print("  "+p);
            return;
        }

        char ch = up.charAt(0);

         Combination(p+ch,up.substring(1));
         Combination(p,up.substring(1));
    }

    static void Permutation(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p+"  ");
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {

            String s=p.substring(0,i);
            String f=p.substring(i,p.length());
            Permutation(s+ch+f , up.substring(1));

        }



    }
}


