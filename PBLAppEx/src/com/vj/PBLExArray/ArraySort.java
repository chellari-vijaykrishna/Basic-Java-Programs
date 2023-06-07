package com.vj.PBLExArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Orginial Array is :");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Sorted Array is :");
		Arrays.sort(arr);
		
		for(int b:arr) {
			System.out.print(b+" ");
		}
		System.out.println();
		sc.close();
	}

}
