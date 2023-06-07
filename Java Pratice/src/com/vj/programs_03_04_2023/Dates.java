package com.vj.programs_03_04_2023;

import java.time.LocalDateTime;
import java.util.Date;

public class Dates {

	public static void main(String[] args) {
		Date d = new Date();
		d.getTime();
		System.out.println(d);
		
		LocalDateTime ns = LocalDateTime.now();
		System.out.println(ns);
		
	}
}
