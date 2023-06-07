package com.vj.Strings;

import java.util.Scanner;

public class StringCommonRemove {
	
	public static String meth1(String s1)
	{
		//xHix = Hi
		//America = America
		
		char firstLetter = s1.charAt(0);
		char lastLetter = s1.charAt(s1.length()-1);
		
		if(firstLetter==lastLetter) {
			return s1.substring(1,s1.length()-1);
		}
		else
		{
			return s1;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String res = meth1(s1);
		System.out.println(res);
		sc.close();
	}

}
