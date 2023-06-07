package com.vj.programs_03_04_2023;

import java.util.Scanner;

public class StringReverse2 
{
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
	     
	     String na = sc.next();
	     
	     for(int i=na.length()-1;i>=0;i--)
	     {
	    	 System.out.print(na.charAt(i));
	     }
	}
	
     
}