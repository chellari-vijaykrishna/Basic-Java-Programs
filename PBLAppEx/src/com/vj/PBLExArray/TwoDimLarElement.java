package com.vj.PBLExArray;

import java.util.Scanner;

public class TwoDimLarElement {
	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		Scanner sc = new Scanner(System.in);
//		arr[0][0] = Integer.parseInt(args[0]);//1
//		arr[0][1] = Integer.parseInt(args[1]);//2
//		arr[0][2] = Integer.parseInt(args[2]);//3
//		arr[1][0] = Integer.parseInt(args[3]);//4
//		arr[1][1] = Integer.parseInt(args[4]);//5
//		arr[1][2] = Integer.parseInt(args[5]);//6
//		arr[2][0] = Integer.parseInt(args[6]);//7
//		arr[2][1] = Integer.parseInt(args[7]);//8
//		arr[2][2] = Integer.parseInt(args[8]);//9
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		
		
		int max=arr[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		System.out.println(max);
		
	}

}
