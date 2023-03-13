package com.seong.prgApp1;

import java.util.Scanner;
public class ch06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine();
        System.out.print("The middle character in the string: " + middle(str) + "\n");
    }

    private static String middle(String str) {
        String temp;
        int mid = str.length() / 2;
        if (str.length() % 2 == 1) {
            temp = String.valueOf(str.charAt(mid));
        } else {
            temp = String.valueOf(str.charAt(mid - 1)) + str.charAt(mid);
        }
        return temp;
    }
}
