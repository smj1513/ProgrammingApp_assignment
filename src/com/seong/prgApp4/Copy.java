package com.seong.prgApp4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Copy {
	public static void main(String[] args) throws IOException {
		if (args.length < 2) {
			System.out.println("Usage: Copy [source_file] [destination_file]");
			return;
		}
		Path from = Paths.get(args[0]);
		Path to = Paths.get(args[1]);
		File originFile = new File(from.toUri()); //원본파일
		File copedFile = new File(to.toUri()); //목적 파일
		Scanner sc = new Scanner(System.in);
		if (!originFile.exists()) {
			System.out.println("The source file does not exist.");
			System.exit(1);
		}
		if (copedFile.exists()) {
			copedFile.setReadOnly();//테스팅 용 읽기전용으로 변경
			System.out.print("복사할 파일이 이미 존재합니다. 덮어쓰기를 원하십니까? (Y/N) ");
			char answer = sc.nextLine().charAt(0);
			if (answer == 'Y' || answer == 'y') { //덮어 쓰기를 원할경우 쓰기로 변경
				copedFile.setWritable(true);
			} else {
				System.out.println("복사가 거부되었습니다.");
				System.exit(1);
			}

		}

		Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("복사가 완료되었습니다.");

	}
}
