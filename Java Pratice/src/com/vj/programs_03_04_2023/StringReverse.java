package com.vj.programs_03_04_2023;

import java.util.Scanner;

public class StringReverse 
{
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
	     
	     String na = sc.next();
	     StringBuffer ad = new StringBuffer(na);
	     ad.reverse();
	     System.out.println(ad);
	}
	
     
}