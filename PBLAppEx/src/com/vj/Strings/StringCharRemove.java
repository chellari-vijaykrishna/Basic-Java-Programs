package com.vj.Strings;

import java.util.Scanner;

public class StringCharRemove {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		int index=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='*'){
				index=i;
				//System.out.println(i);
			}
		}
		System.out.println(s1.substring(0,index));
		sc.close();
	}
}
