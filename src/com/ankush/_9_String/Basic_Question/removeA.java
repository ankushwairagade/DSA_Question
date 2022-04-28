package com.ankush._9_String.Basic_Question;

public class removeA {
    //  str = baccad  o/p = bccd

    public static void main(String[] args) {
        String str="baccad";
     //   removevoid("",str);  // without returning String
       // System.out.print(remove("",str));  // with returning String

       System.out.println( removeAppNotApple("applo"));
    }

    static String remove(String ans , String in)
    {
        if(in.isEmpty()) return ans;

        char ch =in.charAt(0);
        if(ch == 'a')
        {
            return  remove(ans,in.substring(1));

        }else{
            return remove(ans+ch,in.substring(1));
        }

    }

    static void removevoid( String p ,String in)
    {
        if(in.isEmpty()){
            System.out.print(p);
            return ;
        }

        char ch =in.charAt(0);
        if(ch == 'a')
        {
            removevoid(p,in.substring(1));

        }else{
            removevoid(p+ch,in.substring(1));
        }

    }


    // skip some string

    static String removestr( String in)  //complexity t(n) = 0(str.length)
    {
        if(in.isEmpty()){
            return "";
        }


        if(in.startsWith("apple"))
        {
           return removestr(in.substring(5));

        }else{
            return in.charAt(0)+ removestr(in.substring(1));
        }

    }

    static String removeAppNotApple( String in)
    {
        if(in.isEmpty()){
            return "";
        }


        if(in.startsWith("app") && !in.startsWith("apple") )
        {
            return removeAppNotApple(in.substring(3));

        }else{
            return in.charAt(0)+ removeAppNotApple(in.substring(1));
        }

    }

}
