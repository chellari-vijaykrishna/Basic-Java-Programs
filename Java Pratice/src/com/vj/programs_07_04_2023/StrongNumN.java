package com.vj.programs_07_04_2023;

import java.util.Scanner;

public class StrongNumN {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int rem=0;
		int dummy=num;
		int factt=0;
		
		
		
		while(num!=0)
		{
			int fact=1;
			
			rem = num%10;
			for(int i=1;i<=rem;i++)
			{
				fact = fact*i;
			}
			factt+=fact;
			num=num/10;
		}
	      if(factt==dummy)
	      {
	    	  System.out.println("Strong Number :"+dummy);
	      }
	      else {
	    	  System.out.println("Not a Strong Number :"+dummy);
	      }
		
		
	}
}
