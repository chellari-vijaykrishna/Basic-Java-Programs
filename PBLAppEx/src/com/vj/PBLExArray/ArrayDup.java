package com.vj.PBLExArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDup {
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
		
		int element = arr[0];
		
		System.out.print(element+" ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=element)
			{
				System.out.print(arr[i]+" ");
			}
			element=arr[i];
		}
		sc.close();
		 
	}

}
