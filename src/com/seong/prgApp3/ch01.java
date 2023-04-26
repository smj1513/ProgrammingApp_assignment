package com.seong.prgApp3;

import java.util.Scanner;

public class ch01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name:");
		String name = sc.next();
		System.out.print("Enter age:");
		int age = sc.nextInt();
		System.out.print("Enter gender:");
		char gender = sc.next().charAt(0);
		System.out.print("Enter truth:");
		boolean truth = sc.nextBoolean();

		System.out.println("My name is " + name + "(" + gender + ")" + ", age is " + age + ".\n" + "This statement is " + truth + ".");
		System.out.printf("My name is %s(%c), age is %d.\n", name, gender, age);
		System.out.printf("This statement is %b.\n", truth);

	}
}
