package com.vj.programs_08_04_2023;

import java.util.Scanner;

public class Palindrome {
	
	public void meth1(int input1) {
		int rem=0,sum=0;
		while(input1!=0)
		{
			rem = input1%10;
			sum +=rem;
			input1=input1/10;
		}
		//System.out.println(sum);
		if(!(sum>=0 && sum<=9))
		{
			int remm=0,summ=0;
			while(sum!=0)
			{
				rem = sum%10;
				summ +=rem;
				sum=sum/10;
			}
			System.out.println(summ);
			
		}
	}
	
	public static void main(String[] args) {
		Palindrome pd = new Palindrome();
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		pd.meth1(input1);
	}

}
