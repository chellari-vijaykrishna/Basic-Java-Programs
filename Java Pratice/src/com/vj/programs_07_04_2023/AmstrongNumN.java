package com.vj.programs_07_04_2023;

import java.util.Scanner;

public class AmstrongNumN {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 =sc.nextInt();
		String S = String.valueOf(num1);
		int len = S.length();
		
		
		int dummy=0;
		dummy=num1;

		int sum=0,rem=0;
		
		for(int num=1;num<=num1;num++) {
			
			while(num!=0)
			{
				rem = num%10;
				System.out.println(rem);
				sum += Math.pow(rem, len);
				System.out.println(sum);
				num=num/10;
			}
			if(dummy==sum)
			{
				System.out.println("Amstrong Num :"+num);
			}
			
		}
		
		
		
	}
}
