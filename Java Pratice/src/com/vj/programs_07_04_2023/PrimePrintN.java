package com.vj.programs_07_04_2023;

import java.util.Scanner;

public class PrimePrintN 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		int co=0;
		for(int i=2;i<=n;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
				co++;
			}
			
		}
		System.out.println();
        System.out.println(co);
	}

}
