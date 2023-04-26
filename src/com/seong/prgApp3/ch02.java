package com.seong.prgApp3;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ch02 {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(new File("IO3.txt"));
		String name = sc.next();
		int age = sc.nextInt();
		char gender = sc.next().charAt(0);
		boolean truth = sc.nextBoolean();

		PrintStream outputFile = new PrintStream("IO4.txt");
		outputFile.printf("My name is %s(%c), age is %d.\n", name, gender, age);
		outputFile.printf("This statement is %b.\n", truth);
	}
}
