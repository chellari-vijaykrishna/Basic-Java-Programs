package com.vj.programs_04_04_2023;

import java.util.Scanner;

public class NumberSum {
	
	public void meth1() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>0 && num<9) {
			System.out.println(num);
		}
		else
		{
			int rev = 0;
			while(num!=0) {
				int lastdigit = num%10;
				rev = rev*10+lastdigit;
				num = num/10;
			}
			System.out.println(rev);
		}
		sc.close();
	}
	public static void meth2() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int rev = 0;
		while(num!=0) {
			int lastdigit = num%10;
			//rev = rev*10+lastdigit;
			rev=rev+lastdigit;
			num = num/10;
		}
		System.out.println(rev);
		
	}
	public static void main(String[] args)
	{
		meth2();
	}

}
