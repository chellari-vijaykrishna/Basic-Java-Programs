package com.vj.programs.mettl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AsciiSumUniqu {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char []input1 = {'A','B','C'};
		char []input2 = {'B','C'};
		
//		for(int i=0;i<input1.length;i++) {
//			input1[i]=sc.next().charAt(0);
//		}
//		for(int i=0;i<input2.length;i++) {
//			input2[i]=sc.next().charAt(0);
//		}
		int a = input1.length;
		int b = input2.length;
		int c=a+b;
		System.out.println(c);
		int k=0;
		int x=a;
		
		char []arr=new char[a+b];
		
		for(int i=0;i<a;i++) {
			arr[k]=input1[i];
			k++;
		}
		for(int i=0;i<b;i++) {
			arr[x]=input2[i];
			x++;
		}
		int u=0;
		int arr1[]=new int[c];
		for(char d:arr) {
			arr1[u]=d;
			u++;
		}
		
		Set<Object> set = new HashSet<>();
		
		for(int i:arr1) {
			set.add(i);
		}
		
		ArrayList<Object> al = new ArrayList<>(set);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr));
		

		for(Object i:al)
		{
			System.out.print(i+" ");
		}
		
		System.out.println(al.get(0));
		
		
	}

}
