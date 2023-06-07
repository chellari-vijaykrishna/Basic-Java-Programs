package com.vj.programs_05_04_2023;

public class ProgramLeft {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 15;
		
		if(a%10==b%10 || b%10 == c%10 || c%10== a%10) {
			System.out.println("True");
		}
		else
		{
			System.out.println("Flase");
		}
	}
}
