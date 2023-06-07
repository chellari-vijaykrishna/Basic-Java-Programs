package com.vj.programs_03_04_2023;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s1,s2,s3;
		s1=a+"";
		s2=a+""+a;
		s3=a+""+a+""+a;
		System.out.println(s1+"+"+s2+"+"+s3);
   }

}
