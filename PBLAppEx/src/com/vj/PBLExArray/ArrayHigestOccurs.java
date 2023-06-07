package com.vj.PBLExArray;

import java.util.Scanner;

public class ArrayHigestOccurs {

	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max_count=0;
		int max_freq=0;
		for(int i=0;i<arr.length;i++)
		{
			int count =0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>max_count)
			{
				max_count = count;
				max_freq=arr[i];
			}
			
			
		}
		System.out.println(max_freq);
		
	}

}
