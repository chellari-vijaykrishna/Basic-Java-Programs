package com.vj.PBLExArray;

import java.util.Scanner;

public class ArraySum6_7 {
	
	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!(arr[i]==6 || arr[i]==7))
			{
				sum=sum+arr[i];
				System.out.println(arr[i]+" ");
			}
		}
		System.out.println(sum);
	}

}
