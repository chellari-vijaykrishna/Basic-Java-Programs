package com.vj.Strings;

import java.util.Scanner;

public class StringLastRepeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		int a = sc.nextInt();
		int n = s1.length();
		String s2 = s1.substring(n-a).repeat(a);
		System.out.println(s2);
		sc.close();
	}

}
