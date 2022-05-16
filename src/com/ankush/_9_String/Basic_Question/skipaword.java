package com.ankush._9_String.Basic_Question;

public class skipaword {
    public static void main(String[] args) {

        System.out.println(removechar("ankushwairagade","",'a'));

      System.out.println(skipwords("helloworld my name is ankush wairagade i am from ankush chanadrapur","kush"));
    }


  static String removechar(String in , String nu , char x)
  {
      if(in.isEmpty())// stop condition
      {
          return nu;
      }

      char ch = in.charAt(0);
      if(x == ch)
      { // remove ch
          return removechar(in.substring(1),nu,x);
      }else {
          return removechar(in.substring(1),nu+ch,x);
      }

  }

static String skipwords(String in,String word)
{
    if(in.isEmpty())
    {
        return "";
    }

    if(in.startsWith(word))
    {
        return skipwords(in.substring(word.length()),word);
    }else {
        return in.charAt(0)+skipwords(in.substring(1),word);
    }

}
}
