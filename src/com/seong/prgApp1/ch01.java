package com.seong.prgApp1;

import java.util.Scanner;
public class ch01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int daf_ASCII = 97;
        int number = 0;
        char alpha = '\0';
        System.out.print("정수입력:");
        number = sc.nextInt();
        if (number > 25 || number < 0) {
            System.out.print("0~25사이의 정수를 입력해주세요.");
            System.exit(0);
        } else {
            alpha = (char) (daf_ASCII + number);
            System.out.println("알파벳 출력= " + alpha);
        }
    }
}
