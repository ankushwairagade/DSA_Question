package com.ankush._17_Hashing.Question;

import java.util.HashSet;

public class RemoveAllVowles {

    public static void main(String[] args) {

        System.out.println(RemoveAll("anksh wairagade"));

    }

    static String RemoveAll(String str)
    {
        HashSet<Character> set = new HashSet<>();
        set.add('a'); set.add('e'); set.add('i');
        set.add('o'); set.add('u');

        StringBuilder sb =new StringBuilder();

        for (int i = 0; i < str.length() ; i++) {

            char ch = str.charAt(i);

            if(!set.contains(ch))
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
