package com.vj.PBLExArray;


import java.util.Scanner;

public class Pratice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ab=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>ab) {
				ab=arr[i];
			}
		}
		
		System.out.println(ab);

	}
	

}
