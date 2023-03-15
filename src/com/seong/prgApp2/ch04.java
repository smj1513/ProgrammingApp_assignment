package com.seong.prgApp2;

import java.util.Arrays;

public class ch04 {
    public static void main(String[] args) {
        int[] arr = {1,5,2,3,1,7,8,9,20,14,30,21,52,23};
        System.out.println("Before SelectionSort:"+Arrays.toString(arr));
        System.out.print("After SelectionSort:");
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        int indexMin, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            indexMin = i; //배열의 시작 값 부터 순회
            for (int j = i + 1; j < arr.length; j++) { //남아있는 배열중
                if (arr[j] < arr[indexMin]) { //가장 작은 값이 있는 인덱스를 찾는다
                    indexMin = j;
                }
            }
            temp = arr[indexMin]; //가장 작은값이 있는 인덱스와 현재 인덱스를 swap시킨다.
            arr[indexMin] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
