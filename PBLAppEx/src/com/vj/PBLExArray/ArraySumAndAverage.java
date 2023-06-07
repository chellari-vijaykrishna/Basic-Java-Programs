package com.vj.PBLExArray;

import java.util.Scanner;

public class ArraySumAndAverage {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//int arrlen=arr.length-1;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		double averageArray = sum/n;
		System.out.println(sum);
		System.out.println(averageArray);
		//System.out.println(n);
		//System.out.println(arrlen);
		sc.close();
	}

}
