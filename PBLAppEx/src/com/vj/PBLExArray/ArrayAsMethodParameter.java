package com.vj.PBLExArray;

import java.util.Scanner;

public class ArrayAsMethodParameter {
	
	public static void meth1(int arr[]) {
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static int [] meth2(int arr[]) {
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		return arr;
	}
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//meth1(arr);
		
		int arr1[]=meth2(arr);
		for(int i=arr1.length-1;i>=0;i--)
			{
				System.out.print(arr1[i]+" ");
			}
			System.out.println();
		
	}
}
