package com.DSA_v2._0_Basic;

import java.util.Scanner;

class PrimeNumber {


    public static void main(String[] args) {

        //
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter any number");

            Integer num = sc.nextInt();
            Integer c = 2;
            boolean isPrime = true;
            while(c < num){
                if((num / c) % 2 == 0){
                    isPrime = false;
                }
                c +=1;
            }

            if(isPrime){
                System.out.println("Prime number "+num);
            }else{
                System.out.println("Not a prime number "+num);
            }

    }

}