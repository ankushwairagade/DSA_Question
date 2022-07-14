package com.ankush._9_String.Basic_Question;

import java.util.ArrayList;
import java.util.List;

public class phonelogic {

    public static void main(String[] args) {

      //  phonepad("","129");

        System.out.println(phonepadret("","2"));
      //  System.out.println(PhonepadCount("","12"));
    }

    static void phonepad(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p); return;
        }
        int n = (int) up.charAt(0) -'0';
                for (int i = (n - 1) * 3; i < n * 3; i++) {
                    char ch = (char) ('a' + i);
                    if(ch == '{'){break;}
                    phonepad(p + ch, up.substring(1));
                }
    }



    static List<String> phonepadret(String p , String up)
    {
        if(up.isEmpty())
        {
            List<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
         }
        int n = (int) up.charAt(0) -'0';
        List<String > ans = new ArrayList<>();

        for (int i = (n - 1) * 3; i < n * 3; i++) {
            char ch = (char) ('a' + i);
            if(ch == '{'){break;}
            ans.addAll(phonepadret(p + ch, up.substring(1)));
        }

        return ans;
    }



    static int PhonepadCount(String p , String up)
    {
        if(up.isEmpty()) return 1;
        int count =0;

        int digit = up.charAt(0)-'0'; // range mil gya

        for (int i = (digit-1) *3; i <digit*3; i++) {
            char ch = (char)('a'+i);
            count += PhonepadCount(p+ch,up.substring(1));
        }
        return count;
    }
}
