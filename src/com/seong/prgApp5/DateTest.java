package com.seong.prgApp5;

import java.util.Date;

public class DateTest {
	public static void main(String[] args){
		Date date =new Date();
		date.setTime(10000);
		System.out.println(date.toString());
		date.setTime(100000);
		System.out.println(date.toString());
		date.setTime(1000000);
		System.out.println(date.toString());
		date.setTime(10000000);
		System.out.println(date.toString());
		date.setTime(100000000);
		System.out.println(date.toString());
		date.setTime(1000000000);
		System.out.println(date);
		date.setTime(10000000000L);
		System.out.println(date);
		date.setTime(100000000000L);
		System.out.println(date);

	}
}
