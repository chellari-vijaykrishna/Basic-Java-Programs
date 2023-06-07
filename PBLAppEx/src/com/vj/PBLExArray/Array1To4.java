package com.vj.PBLExArray;

import java.util.Scanner;

public class Array1To4 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			int count =0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=1 && arr[i]!=4)
				{
					count ++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
	
		}
}


