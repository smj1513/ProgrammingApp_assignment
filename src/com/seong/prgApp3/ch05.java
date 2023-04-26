package com.seong.prgApp3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ch05 {
	public static void main(String[] args) throws IOException {
		String name;
		int age;
		int ageSum = 0;
		int count = 0;
		float height, heightSum = 0.0F;

		Scanner s = new Scanner(new File("p4.in")); // file input

		while (s.hasNext()) {
			if (!s.nextBoolean()) {
				s.nextLine(); //Line = token+enter
				continue;
			}
			name = s.next();
			age = s.nextInt();
			height = s.nextFloat();
			ageSum += age;
			heightSum += height;
			++count;
			System.out.printf("%5s%5d%10.1f\n", name, age, height);
		}

		System.out.println();
		System.out.println("total number: " + count);
		System.out.println("average age: " + ageSum / count);
		System.out.printf("average height: %10.3f", heightSum / count);
	}
}
