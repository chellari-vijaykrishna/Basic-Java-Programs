package com.vj.PBLExCon;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count =0;
	     for(int j=1;j<=n;j++)
			{
				if(n%j==0)
					count++;
			}
	     
	     if(count==2)
	     {
	     	System.out.println("prime");
	     }
	     else
	      System.out.println("not prime");
		}

}
