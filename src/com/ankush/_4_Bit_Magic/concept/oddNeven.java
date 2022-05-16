package com.ankush._4_Bit_Magic.concept;

public class oddNeven {

    public static void main(String[] args) {
        // find odd and even
        // we known that
        //
           /*   0000    0  // even
                0001    1   // odd
                0010    2   //even
                0011    3   // odd*/
              //  you get the pattern  check last bit


            System.out.println(checkOR(52));



    }

            // Time Complexity T(n) = 0(1)

            static String checkOR(int n)
            {
                if((n | 1) == n ) return "Odd";
                else return "even";
            }

            static String checkAND(int n)
            {
                if(( n & 1) == 1) return "odd";
                else return "even";
            }

            static String checkXOR(int n)
            {
                if((n ^ 1) == n+1) return "even";
                else return "odd";
            }
}
