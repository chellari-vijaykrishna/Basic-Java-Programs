package com.vj.programs_08_04_2023;

import java.util.Scanner;

public class Palindrome1 {
	
	public void meth1(String input1) {
		String S1=input1.toLowerCase();
		System.out.println(S1);
		String S2="";
		for(int i=S1.length()-1;i>=0;i--)
		{
			S2+=S1.charAt(i);
		}
		
		String S3=S2.toLowerCase();
		System.out.println(S3);
		
		if(S1.equals(S3))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}
	
	public static void main(String[] args) {
		Palindrome1 pd = new Palindrome1();
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		pd.meth1(input1);
	}

}
