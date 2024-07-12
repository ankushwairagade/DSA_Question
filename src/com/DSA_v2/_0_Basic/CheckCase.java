package com.DSA_v2._0_Basic;

import java.util.Scanner;

public class CheckCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().trim().charAt(0);;

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("LOWER CASE");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UPPER CASE");
        }
    }
}
