package com.seong.prgApp1;

public class ch05 {
    public static void main(String[] args) {
        System.out.println(sTimes("Hi", 3));
        System.out.println(sTimes("Hello", 2));
        System.out.println(sTimes("My Java", 2));
    }

    private static String sTimes(String str, int num) {
        StringBuffer strb = new StringBuffer(str);
        for (int i = 0; i < num - 1; i++) {
            strb.append(str);
        }
        return strb.toString();
    }
}
