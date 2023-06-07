package com.vj.PBLExArray;

public class TwoDim2_2Rev {
	public static void main(String[] args) {
		
		
		int arr[][]=new int[2][2];
		arr[0][0] = Integer.parseInt(args[0]);//1
		arr[0][1] = Integer.parseInt(args[1]);//2
		arr[1][0] = Integer.parseInt(args[2]);//3
		arr[1][1] = Integer.parseInt(args[3]);//4
		
		System.out.println("Original Array of array :");
		System.out.println(arr[0][0]+" "+arr[0][1]);
		System.out.println(arr[1][0]+" "+arr[1][1]);
		
		System.out.println("Reserved Array of array :");
		System.out.println(arr[1][1]+" "+arr[1][0]);
		System.out.println(arr[0][1]+" "+arr[0][0]);
	}

}
