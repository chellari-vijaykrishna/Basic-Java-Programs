package com.vj.Strings;

import java.util.Scanner;

public class StringXProgram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//inputs "Wipro",'X', and 3
		//output WiproXWiproXWipro
		
		String s1 = sc.next();
		char ch = sc.next().charAt(0);
		int a = sc.nextInt();
		String s2 = "";
		for(int i=1;i<=a;i++) {
			s2+=s1+ch;
		}
		System.out.println(s2.substring(0,s2.length()-1));
		
		sc.close();
		
	}

}
