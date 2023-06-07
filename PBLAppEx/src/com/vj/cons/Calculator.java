package com.vj.cons;

public class Calculator {
	
	public static int powerInt(int num1,int num2) {
		
		int pow = (int)Math.pow(num1, num2);
	
		return pow;
	}
	public static double powerDouble(double num1,int num2) {
		double pow = Math.pow(num1, num2);
		return pow;
	}
	

	public static void main(String[] args) {
		
		int a = powerInt(2,4);
		double b = powerDouble(2,4);
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
