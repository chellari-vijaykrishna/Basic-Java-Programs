package com.vj.programs_04_04_2023;

import java.util.Scanner;

public class Odd {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String opt = sc.nextLine().toUpperCase();
		int n = sc.nextInt();
		
		if(opt.equals("ODD")) {
			for(int i = 0;i<n;i++)
			{
				if(i%2!=0) {
					System.out.println("ODD :"+i);
				}
			}
		}
		
		else if(opt.equals("EVEN")){
			for(int i = 0;i<n;i++)
			{
				if(i%2 == 0) {
					System.out.println("EVEN :"+i);
				}
			}
		}
		else {
			System.out.println("Invaild Input");
		}
		
	}

}
