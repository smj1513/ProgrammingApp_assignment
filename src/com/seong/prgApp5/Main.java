package com.seong.prgApp5;

public class Main {
	public static void main(String[] args){
		Rectangle rect0 = new Rectangle();
		System.out.println("이 사각형의 가로는:"+rect0.getWidth()+" 세로는:"+rect0.getHeight()+" 넓이는:"+ rect0.getArea()+" 둘레는:"+rect0.getPerimeter());
		Rectangle rect1 = new Rectangle(4,40);
		System.out.printf("이 사각형의 가로는:%.1f 세로는:%.1f 넓이는:%.1f 둘레는:%.1f\n",rect1.getWidth(),rect1.getHeight(),rect1.getArea(),rect1.getPerimeter());
		Rectangle rect2 = new Rectangle(3.5,35.9);
		System.out.printf("이 사각형의 가로는:%.1f 세로는:%.1f 넓이는:%.1f 둘레는:%.1f\n",rect2.getWidth(),rect2.getHeight(),rect2.getArea(),rect2.getPerimeter());

	}
}
