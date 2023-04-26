package com.seong.prgApp3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ch03 {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("a.dat");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		Scanner sc= new Scanner(bufferedReader);
		double sum=0;

		while(sc.hasNext()){
			if(sc.hasNextDouble()){
				sum+=sc.nextDouble();
			}else{
				sc.next();//버퍼 비우기
			}
		}
		System.out.println(sum);
	}
}
