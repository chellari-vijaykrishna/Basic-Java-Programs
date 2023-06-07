package com.vj.programs_07_04_2023;

import java.util.Scanner;

public class AmstrongNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum=0,rem=0;
		//String num = sc.next();
		int num1 =sc.nextInt();
		String S = String.valueOf(num1);
		int len = S.length();
		//int len = num.length();
		//System.out.println(len);
		//int num1 = Integer.parseInt(num);
		int dummy=0;
		dummy=num1;
		while(num1!=0)
		{
			rem = num1%10;
			sum += Math.pow(rem, len);
			num1=num1/10;
		}
		System.out.println(sum);
		if(dummy==sum)
		{
			System.out.println("It is an Amstrong Num");
		}
		else
		{
			System.out.println("It is not an Amstrong Num");
		}
		
		
		
	}
}
