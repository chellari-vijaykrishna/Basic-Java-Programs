package com.vj.PBLExCon;

import java.util.Scanner;

public class CharProg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		
		if(Character.isAlphabetic(ch)) {
			System.out.println("alphabet");
		}
		
		
		else if(Character.isDigit(ch))
			System.out.println("digit");
		
		
		else 
			System.out.println("special Charcter");

	}

}
