package com.vj.PBLExArray;

import java.util.Scanner;

public class ArrayCharAscii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		for(int a:arr)
		{
			System.out.println((char)a);
		}
	}

}
