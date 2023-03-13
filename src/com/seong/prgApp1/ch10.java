package com.seong.prgApp1;

public class ch10 {
    public static void main(String[] args) {
        String str = "12340000";
        System.out.println("String    = " + str);
        str = removeTrailZ(str);
        System.out.println("Converted = " + str);
    }

    public static String removeTrailZ(String str) {
        char[] ch = str.toCharArray();
        int idx = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                idx = i;
                break;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = idx; i < ch.length; i++) {
            stringBuffer.append(ch[i]);
        }
        return stringBuffer.toString();
    }
}
