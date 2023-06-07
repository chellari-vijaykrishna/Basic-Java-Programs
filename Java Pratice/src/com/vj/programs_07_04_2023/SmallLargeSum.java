package com.vj.programs_07_04_2023;

import java.util.Arrays;
import java.util.Scanner;

public class SmallLargeSum {
	public static int[] arrayform(int n1) {
		int arr1[]=new int[4];
		int rem1=0,i=0;
		while(n1>0) {
			rem1 = n1%10;
			arr1[i]=rem1;
			i++;
			n1=n1/10;
		}
		return arr1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int a[]=arrayform(n1);
		int b[]=arrayform(n2);
		int c[]=arrayform(n3);
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		int res = a[0]+b[0]+c[0]+a[a.length-1]+b[b.length-1]+c[c.length-1];
		System.out.println(res);
		
		sc.close();
	}
}

