package com.seong.prgApp1;

/**
 * 문제 1.2 a-z 알파벳 출력
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인함수
 **/
public class ch02 {
    public static void main(String[] args) {
        final int daf_ASCII = 97;

        final int loop_num = 26;
        char ch = daf_ASCII;
        StringBuffer Alpha = new StringBuffer();
        for (int i = 0; i < loop_num; i++) {
            Alpha.append(ch++);
        }
        System.out.printf(String.valueOf(Alpha));
    }
}