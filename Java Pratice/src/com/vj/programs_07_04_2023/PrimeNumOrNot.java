package com.vj.programs_07_04_2023;

import java.util.Scanner;

public class PrimeNumOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int c=0;
		
		for(int i = 2;i<=num;i++)
		{
			if(num%i == 0)
			{
			   c++;
			}
		}
		if(c==1){
			System.out.println("It is a prime num ");
		}
		else
		{
			System.out.println("it is a not a prime ");
		}
	}

}
