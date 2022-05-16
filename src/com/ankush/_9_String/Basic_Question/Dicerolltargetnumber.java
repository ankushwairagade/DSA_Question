package com.ankush._9_String.Basic_Question;

import java.util.ArrayList;
import java.util.List;

public class Dicerolltargetnumber {
    public static void main(String[] args) {

       // Dice("",4);
        System.out.println(Diceret("",4));
        System.out.println(customDiceFace("",7,8));
    }

    static void Dice(String p , int target)
    {
        if(target == 0 )
        {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i<=target ; i++) {
            Dice(p+i , target-i);
        }
    }

    static List<String> Diceret (String p ,int target)  // Dice face By default is 6
    {
        if(target == 0 )
        {
            List<String> ls = new ArrayList<>();
            ls.add(p);
            return  ls;
        }
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <=6  && i<=target; i++) {
            ans.addAll(Diceret(p+i,target-i));
        }
        return ans;
    }

    static List<String> customDiceFace(String p , int target , int face)
    {
        if(target == 0)
        {
            List<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }
            List<String> ans = new ArrayList<>();
        for (int i = 1; i < face && i<=target; i++) {
            ans.addAll(customDiceFace(p+i,target-i,face));
        }
        return ans;
    }
 }
