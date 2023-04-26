package com.seong.prgApp5;

import java.util.Random;

public class StopwatchTest {
	public static void main(String[] args){
		StopWatch sw = new StopWatch();
		int[] tempArr = new int[100000];
		Random rand = new Random(System.currentTimeMillis());

		for(int i = 0 ; i < tempArr.length;i++){
			tempArr[i] = rand.nextInt(100000);
		}
		sw.start();
		selectionSort(tempArr);
		sw.stop();
		System.out.println("Selection Sort Elapsed time: "+sw.getElapsedTime()+"/ms");
	}
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}
}
