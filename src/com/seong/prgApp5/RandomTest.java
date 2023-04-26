package com.seong.prgApp5;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args){
		Random rand = new Random();
		rand.setSeed(1000);
		for(int i = 0 ; i < 2; i++){
			for (int j = 0 ; j<25;j++){
				System.out.print(rand.nextInt(100)+" ");
			}
			System.out.println();
		}
	}
}
