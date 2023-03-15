package com.seong.prgApp2;

import java.util.Arrays;

public class ch05 {
    public static void main(String[] args) {
        int[] arr = {1,5,2,3,1,7,8,9,20,14,30,21,52,23};
        System.out.println("Before InsertionSort:"+Arrays.toString(arr));
        System.out.print("After InsertionSort:");
        InsertionSort(arr);
    }

    public static void InsertionSort(int[] arr) {
        for (int idx = 1; idx < arr.length; idx++) {//배열의 첫번째 값 부터 시작.
            int temp = arr[idx]; //현재의 배열위치값을 저장
            int prev = idx - 1; //현재 배열위치의 바로앞 인덱스
            while ((prev > -1) && (arr[prev] > temp)) { //현재 인덱스의 바로 앞 인덱스가 0이상이며, 현재 인덱스의 값보다 바로앞 인덱스의 값이 클경우
                arr[prev+1] = arr[prev]; //prev 바로 뒤의 인덱스에 prev저장
                prev--; //prev의 값을 감소시켜 또 다시 두 인덱스를 비교
            } //이 반복문이 종료된 후에는 idx인덱스의 앞쪽에 해당하는 배열은 정렬이 된 상태임.
            arr[prev+1] = temp; //덮어씌워져 없어진 idx인덱스 값을 정렬된 배열 바로 뒤쪽에 재배치
        }// 위 과정을 반복
        System.out.println(Arrays.toString(arr));
    }
}
