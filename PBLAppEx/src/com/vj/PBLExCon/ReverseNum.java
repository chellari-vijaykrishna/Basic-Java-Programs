package com.vj.PBLExCon;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int rem=0,rev=0;
		while(num!=0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}
}
