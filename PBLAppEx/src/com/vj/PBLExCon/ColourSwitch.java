package com.vj.PBLExCon;

import java.util.Scanner;

public class ColourSwitch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		default :
			System.out.println("Invalid Code");
			
		}
		sc.close();
		
	}
}
