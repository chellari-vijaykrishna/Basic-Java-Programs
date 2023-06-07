package com.vj.programs.mettl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Program {
	public static void main(String[] args) {
		char []input1 = {'G','Q','R'};
		char []input2 = {'R','T','U'};
		
        ArrayList<Object> set1 = new ArrayList<>();
        ArrayList<Object> set2 = new ArrayList<>();
		
		for(int i:input1) {
			set1.add((int)i);
		}
		
		for(int i :input2) {
			set2.add((int)i);
		}
		

//		for(int i :input2) {
//			System.out.println(i);
//		}
	
		
		Iterator<Object> ll = set1.iterator();
		while(ll.hasNext()) {
			if(set2.contains(ll.next())) {
				ll.remove();
			}
		}
		
		for(Object o:set1) {
			System.out.println(o);
		}
		
		int sum=0;
		for(Object o:set1) {
			sum=sum+(int)o;
		}
		System.out.println(sum);
	}
}
