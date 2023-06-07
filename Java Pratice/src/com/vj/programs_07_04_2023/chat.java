package com.vj.programs_07_04_2023;

import java.util.Scanner;

public class chat {
	
	public static boolean isAmStrong(int num)
	{
		int original = num;
		int rem=0,sum=0;
		int len = String.valueOf(num).length();
		while(num!=0)
		{
			rem =num%10;
			sum+=Math.pow(rem, len);
			num=num/10;
		}
		return sum == original;
	}

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int n =1000000;
 
    		for(int i=1;i<=n;i++)
    		{
    			if(isAmStrong(i))
    	    	{
    				System.out.print(" "+i);
    	    	}
    		}
    	}
}

