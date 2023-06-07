package com.vj.PBLExArray;

import java.util.Scanner;

public class ArrayMiddleElements {
	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
		int arr[]=new int[3];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//int m = sc.nextInt();
		int arr1[]=new int[3];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		int arr2[]=new int[2];
		arr2[0]=arr[1];
		arr2[1]=arr1[1];
		
		for(int a:arr2) {
			System.out.print(a+" ");
		}
	}
}
