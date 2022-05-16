package com.ankush.ImptopicRevision;

public class Concept_String_PnC {

    public static void main(String[] args) {

        combination("","abc");
        System.out.println();
        Permutation("","abc");
    }

    static void combination(String p , String up)
    {
            if(up.isEmpty())
            {
                System.out.print(p+"  "); return;
            }
            char ch = up.charAt(0);

            combination(p,up.substring(1));
            combination(p+ch,up.substring(1));
    }

    static void Permutation(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p+"  "); return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            Permutation(f+ch+s,up.substring(1));
        }

    }
}
