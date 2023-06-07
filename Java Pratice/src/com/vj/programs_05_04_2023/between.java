package com.vj.programs_05_04_2023;

public class between {

	public static void main(String[] args) {
		int a=5;
		int b=20;
	    int c=3;
	    
	    for(int i = a;i<=b;i++)
	    {
	    	if(i%c==0) {
	    		System.out.println("divisible by 3 "+i);
	    	}
	    	else
	    	{
	    		System.out.println("not divisible");
	    	}
	    }
	}
}
