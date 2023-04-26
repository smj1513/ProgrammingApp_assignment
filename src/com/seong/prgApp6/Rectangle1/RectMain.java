package com.seong.prgApp6.Rectangle1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class RectMain {
	public static final int SIZE = 5;
	public static final String ObjectFile = "RectangleObject.txt";
	public static void main(String[] args) throws FileNotFoundException {
		if(args.length<1){
			System.out.println("잘못된 입력입니다.");
			System.exit(0);
		}
		String filename = args[0];
		Rectangle[] rect = new Rectangle[SIZE];
		try(Scanner sc = new Scanner(new File(filename))){
			sc.useDelimiter(":");
			for(int i = 0 ; sc.hasNext() || i<SIZE; i++){
				String[] rectInfo = sc.next().strip().split(" ");
				rect[i] = new Rectangle(Double.parseDouble(rectInfo[0]), Double.parseDouble(rectInfo[1]), Double.parseDouble(rectInfo[2]),Double.parseDouble(rectInfo[3]));
			}
			Arrays.sort(rect);

		}catch (IOException e){
			e.printStackTrace();
		}
		for(int i = 0 ; i < rect.length;i++){
			System.out.println(rect[i].toString());
		}
		double totalOverlapArea = 0 ;
		for(int i = 0 ; i < rect.length;i++){
			for(int j = i+1;j< rect.length;j++){
				Rectangle rect1 = rect[i];
				Rectangle rect2 = rect[j];
				if(rect1.isOverlap(rect2)){
					double OverlapSize = rect1.OverlapSize(rect2);
					totalOverlapArea+=OverlapSize;
					double smallRectSize = Math.min(rect1.getSize(), rect2.getSize());
					double largeRectSize = Math.max(rect1.getSize(), rect2.getSize());
					System.out.printf("(작은 사각형:%.1f, 큰 사각형: %.1f, 겹치는 부분 면적: %.1f)\n", smallRectSize, largeRectSize, OverlapSize);
				}
			}
		}
		System.out.println("겹치는 부분 면적의 총합:"+totalOverlapArea);
		try(ObjectInputStream objectInputStream =new ObjectInputStream(new FileInputStream(ObjectFile))
		    ;ObjectOutputStream objectOutputStream =new ObjectOutputStream(new FileOutputStream(ObjectFile))) {
			for(int i = 0 ; i<rect.length;i++){
				Rectangle temp = rect[i];
				objectOutputStream.writeObject(temp);
			}
			Rectangle obj;
			while ((obj = (Rectangle)  objectInputStream.readObject()) != null) {
				System.out.println(obj);
			}
		}catch (EOFException e) {
			System.out.println("파일의 끝에 도달하였습니다.");

		}
		catch (IOException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
