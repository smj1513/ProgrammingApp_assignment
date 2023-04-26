package com.seong.prgApp5;

import java.util.GregorianCalendar;

public class Calendar {
	public static void main(String[] args){
		GregorianCalendar grc = new GregorianCalendar();
		System.out.println("Current year : "+grc.get(GregorianCalendar.YEAR));
		System.out.println("Current month : "+grc.get(GregorianCalendar.MONTH));
		System.out.println("Current day : "+grc.get(GregorianCalendar.DAY_OF_MONTH));
		grc.setTimeInMillis(1234567898765L);
		System.out.println("Get the time since 1234567898765L seconds since January 1, 1970 YEAR : "+grc.get(GregorianCalendar.YEAR));
		System.out.println("Get the time since 1234567898765L seconds since January 1, 1970 MONTH : "+grc.get(GregorianCalendar.MONTH));
		System.out.println("Get the time since 1234567898765L seconds since January 1, 1970 1970 DAY_OF_MONTH : "+grc.get(GregorianCalendar.DAY_OF_MONTH));
	}
}
