package com.seong.prgApp3;

import java.util.Scanner;

public class ch07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count, grade;
		Score score;
		System.out.print("인원수 입력:");
		count = sc.nextInt();
		score = new Score(count);
		score.showMaxValue();
		score.showLowValue();
		score.showAverge();
		score.showGradeHeadcount();
		score.showAvergeUpperCount();
		score.showAvergeLowerCount();
		while(true) {
			System.out.print("석차 검색(종료는 -1):");
			grade=sc.nextInt();
			if(grade==-1){
				break;
			}
			score.showSearchGrade(grade);
		}
	}
}
