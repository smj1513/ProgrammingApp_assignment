package com.seong.prgApp2;

import java.util.Scanner;

public class ch01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 5 digit number > ");
        String num = sc.nextLine();
        barcodeGen(num);
        sc.close();
    }

    public static void barcodeGen(String s) {
        String[] pattern = {"11000", "00011", "00101", "00110", "01001", "01010", "01100", "10001", "10010", "10100"};
        String[] bar_pattern = new String[10];

        for (int i = 0; i < 10; i++) { //숫자 패턴을 바코드로 변환하는 과정
            String cs = pattern[i];
            cs = cs.replaceAll("0", " ");
            cs = cs.replaceAll("1", "|");
            bar_pattern[i] = cs;
        }
        char[] check_code;
        check_code = s.toCharArray();
        int sum = 0;
        for (char c : check_code) {
            sum += Character.getNumericValue(c); //check code를 숫자로 변환후 하나로 합쳐서 이후에 check digit을 생성할때 사용
        }
        int digit = sum % 10; //check digit을 생성하는 과정
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(bar_pattern[Character.getNumericValue(s.charAt(j))]); //바코드 패턴에 해당하는 문자열 출력
            }
            System.out.print(bar_pattern[digit]);
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("|||||");
            }
            System.out.println();
        }

    }
}
