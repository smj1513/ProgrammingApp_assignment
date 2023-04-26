package com.seong.prgApp3;

import java.util.Arrays;
import java.util.Scanner;

public class Score {
	private final double average;
	private final int[] gradeHeadcount;
	private final Integer[] scores;
	private int averageUpperCount;
	private int averageLowerCount;
	private int max, low;

	public Score(int count) {
		Scanner sc = new Scanner(System.in);
		this.scores = new Integer[count];
		this.max = 0;
		this.low = 100;
		this.averageUpperCount = 0;
		this.averageLowerCount = 0;
		gradeHeadcount = new int[10];
		System.out.print("한 반의 국어 성적 입력:");
		for (int i = 0; i < count; i++) {
			this.scores[i] = sc.nextInt();
			if (scores[i] < 0 || scores[i] > 100) {
				System.out.println("잘못된 값입니다 다시 입력해주세요.");
				i--;
				continue;
			}
			if (this.max < this.scores[i]) {
				this.max = this.scores[i];
			}
			if (this.low > this.scores[i]) {
				this.low = this.scores[i];
			}
			switch (scores[i] / 10) {
				case 9, 10 -> gradeHeadcount[0]++;
				case 8 -> gradeHeadcount[1]++;
				case 7 -> gradeHeadcount[2]++;
				case 6 -> gradeHeadcount[3]++;
				case 5 -> gradeHeadcount[4]++;
				case 4 -> gradeHeadcount[5]++;
				case 3 -> gradeHeadcount[6]++;
				case 2 -> gradeHeadcount[7]++;
				case 1 -> gradeHeadcount[8]++;
				case 0 -> gradeHeadcount[9]++;
			}
		}
		int sum = 0;
		for (int num : scores) {
			sum += num;
		}
		average = (double) sum / count;
		for (int num : scores) {
			if (average < num) {
				averageUpperCount++;
			} else if (average > num) {
				averageLowerCount++;
			}
		}
		Arrays.sort(scores, (i1, i2) -> i2 - i1);
	}

	public void showMaxValue() {
		System.out.println("최고점:" + this.max);
	}

	public void showLowValue() {
		System.out.println("최하점:" + this.low);
	}

	public void showAverge() {
		System.out.println("평균:" + average);
	}

	public void showAvergeUpperCount() {
		System.out.println("평균보다 높은 인원수:" + averageUpperCount);
	}

	public void showAvergeLowerCount() {
		System.out.println("평균보다 낮은 인원수:" + averageLowerCount);
	}

	public void showGradeHeadcount() {
		System.out.println("등급은 높은 점수순으로 1등급~10등급입니다.");
		for (int i = 0; i < gradeHeadcount.length; i++) {
			System.out.printf("%d등급 학생수:%d\n", i + 1, gradeHeadcount[i]);
		}
	}

	public void showSearchGrade(int target) {
		int grade = decendingOrderBinarySearch(scores, target, 0, scores.length);
		if (grade == -1) {
			System.out.println("해당하는 점수가 없습니다.");
		} else {
			System.out.println("해당 하는 점수의 석차는:" + (grade + 1) + "입니다");
		}
	}

	private int decendingOrderBinarySearch(Integer[] arr, int target, int low, int high) {
		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (target == arr[mid]) {
			return mid;
		} else if (target < arr[mid]) {
			return decendingOrderBinarySearch(arr, target, mid + 1, high);
		} else {
			return decendingOrderBinarySearch(arr, target, low, mid - 1);
		}
	}

}
