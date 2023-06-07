package com.vj.PBLExArray;

import java.util.Scanner;

public class ArrayElementSearch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Num to be search :");
		int searchNum=sc.nextInt();
		int flag=0;
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(searchNum==arr[i])
			{
				flag=1;
				index=i;
				break;
			}
			else {
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println("Element found at index :"+index);
		}
		else
		{
			System.out.println("-1");
		}
	}

}
