package com.vj.programs_07_04_2023;

import java.util.Scanner;

public class StrongNum {
	
	public static boolean meth(int n)
	{
        int rem=0;
		int num1=n;
		int factt=0;
		int dummy=0;
		dummy=num1;
			
			while(num1!=0)
			{
				int fact=1;
				
				rem = num1%10;
				for(int i=1;i<=rem;i++)
				{
					fact = fact*i;
				}
				factt+=fact;
				num1=num1/10;
			}
		return factt == dummy;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		      for(int i=1;i<=num1;i++)
		      {
		    	 if(meth(i))
		    	 {
		    		 System.out.println(" "+i);
		      }
		}
		
	}
}
