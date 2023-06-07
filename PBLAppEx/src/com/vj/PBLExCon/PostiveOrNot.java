package com.vj.PBLExCon;

import java.util.Scanner;

public class PostiveOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		if(a>0)
			System.out.println("Positive");
		else if(a<0)
			System.out.println("Negitive");
		else
			System.out.println("Zero");
	}
}
