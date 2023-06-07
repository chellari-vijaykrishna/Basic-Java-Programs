package com.vj.programs_07_04_2023;

import java.util.Scanner;

public class ReverseOfNum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int rem = 0;
		int rev=0;
		int sum=0;
		while(num!=0)
		{
			rem = num%10;
			rev = rev*10+rem;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(rev);
		System.out.println(sum);
		
	}

}
