package com.seong.prgApp1;

import java.util.Scanner;
public class ch04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        System.out.print("Number of words: " + count_Words(str) + "\n");
    }

    private static int count_Words(String str) {
        char[] ch_Arr = str.toCharArray();
        int count = 0;
        if (ch_Arr[ch_Arr.length - 1] == ' ') {
            ch_Arr[ch_Arr.length - 1] = '\0';
        }
        for (int i = 0; i < ch_Arr.length; i++) {
            if (ch_Arr[i] == ' ') {
                count++;
            }
        }
        return count + 1;
    }
}
