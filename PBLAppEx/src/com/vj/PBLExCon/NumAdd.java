package com.vj.PBLExCon;

import java.util.Scanner;

public class NumAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int rem=0,sum=0;
		while(num!=0)
		{
			rem = num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}

}
