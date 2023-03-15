package com.seong.prgApp2;

import java.util.Scanner;

public class ch03 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 12, 15, 19, 23, 36, 46, 67};
        Scanner sc = new Scanner(System.in);
        System.out.print("Input target number:");
        int num = sc.nextInt();
        System.out.println("Target Index:"+BinarySearch(arr, num, 0, arr.length));
    }

    public static int BinarySearch(int[] arr, int target, int low, int high) {
        if (low > high) { //재귀 탈출 조건식
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return BinarySearch(arr, target, low, mid - 1);
        } else {
            return BinarySearch(arr, target, mid + 1, high);
        }
    }
}
