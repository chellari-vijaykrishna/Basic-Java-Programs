package com.vj.programs_05_04_2023;

public class ThreeAndFive {
	public static void main(String[] args) {
		for(int i=0;i<100;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
			else
			{
				System.out.println("not divisible by 3 and 5 "+i);
			}
		}
	}
}
