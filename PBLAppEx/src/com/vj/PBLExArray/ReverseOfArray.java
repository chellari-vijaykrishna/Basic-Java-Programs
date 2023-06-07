package com.vj.PBLExArray;

import java.util.Scanner;

public class ReverseOfArray {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
