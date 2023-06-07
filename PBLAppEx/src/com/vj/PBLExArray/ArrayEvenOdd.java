package com.vj.PBLExArray;

import java.util.Scanner;

public class ArrayEvenOdd {

	    public static void main(String[] args) 
	    {
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
			for(int ab:arr) {
				if(ab%2==0)
				{
					System.out.print(ab+" ");
				}
			}
			for(int ab:arr) {
				if(ab%2!=0)
				{
					System.out.print(ab+" ");
				}
			}
	}

}
