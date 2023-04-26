package com.seong.prgApp4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Content {
	public static void main(String[] args) throws IOException {
		if (args.length < 2) {
			System.out.println("Usage: Content [-h | -t | -c] [filename]");
			return;
		}

		String option = args[0];
		String filename = args[1];
		/**
		 *     -h : 파일 첫 5줄 화면 출력	(예) Content -h 파일
		 *      -t: 파일 마지막 5줄 화면 출력	(예) Content -t 파일
		 *      -c: 파일의 라인 개수, 단어 개수, 문자 개수를 화면 출력 (예) Content -c 파일
		 **/
		switch (option) {
			case "-h":
				displayHead(filename);
				break;
			case "-t":
				displayTail(filename);
				break;
			case "-c":
				displayStats(filename);
				break;
			default:
				System.out.println("Invalid option");
				break;
		}
	}

	private static void displayStats(String filename) { // input -c
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
			int lines = 0;
			int words = 0;
			int chars = 0;
			String line = bufferedReader.readLine();
			while (line != null) {
				lines++;
				words += line.split("\\s").length;
				chars += line.length();
				line = bufferedReader.readLine();
			}
			System.out.println("Lines: " + lines);
			System.out.println("Words: " + words);
			System.out.println("Chars: " + chars);
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}

	private static void displayTail(String filename) { //input -t
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
			String line = bufferedReader.readLine();
			int numLine = 5;
			ArrayList<String> tail = new ArrayList<>();
			while (line != null) {
				tail.add(line);
				line = bufferedReader.readLine();
			}
			for (int i = tail.size() - numLine; i < tail.size(); i++) {
				System.out.println(tail.get(i));
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}

	private static void displayHead(String filename) { //input -h
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
			String line = bufferedReader.readLine();
			for (int i = 0; line != null && i < 5; i++) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

	}

}
