package com.seong.prgApp1;

import java.util.Scanner;

public class ch13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int size = 0;
            System.out.print("Input Shape Size:");
            size = sc.nextInt();
            if (size == -1) {
                break;
            } else {
                for (int i = 0; i < size; i++) {
                    if (i == 0 || i == size - 1) {
                        for (int j = 0; j < size; j++) {
                            System.out.print("*");
                        }
                    } else {
                        System.out.print("*");
                        for (int j = 1; j < size - 1; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}
