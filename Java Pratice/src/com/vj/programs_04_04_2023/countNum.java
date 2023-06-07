package com.vj.programs_04_04_2023;

import java.util.Scanner;


public class countNum {
	
	public static void main(String[] args)
	{
		int lettercount=0; 
		int Digitcount=0;
		int Spacecount=0;
		Scanner sc =new Scanner(System.in);		
		String scc = sc.nextLine();
		char []sccc = scc.toCharArray();
		for(int i=0;i<scc.length();i++)
		{
			if(Character.isLetter(sccc[i])) {
			lettercount++;
			}
			else if(Character.isDigit(sccc[i])) {
				Digitcount++;
			}
			else if(Character.isSpaceChar(sccc[i])) {
				Spacecount++;
			}
			else {
				System.out.println("Empty input");
			}
			
		}
		System.out.println(lettercount);
		System.out.println(Digitcount);
		System.out.println(Spacecount);
	}

}
