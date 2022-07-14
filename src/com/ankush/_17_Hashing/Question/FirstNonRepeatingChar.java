package com.ankush._17_Hashing.Question;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        System.out.println(NonRepeatingChar("abapbccia"));
    }

    public static int NonRepeatingChar(String str)
    {
        Map<Character,Integer>  map = new HashMap<>();
        char[] chararr= str.toCharArray();

        for (char i:chararr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for (int i = 0; i < chararr.length; i++) {
            if(map.get(chararr[i])==1)
            {
                return i;
            }

        }
        return -1;
    }
}
