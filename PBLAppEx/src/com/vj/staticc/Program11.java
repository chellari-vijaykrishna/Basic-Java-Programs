package com.vj.staticc;

public class Program11 {
	
	static int a=10;
	
	int b=20;

	public static void meth1() {
		System.out.println(a);
		
		Program11 pg= new Program11();
		System.out.println(pg.b);
	      
	     pg.meth2();
	      meth1();
		
	}
	public void meth2() {
		System.out.println(a);
		System.out.println(b);
		
		 Program11 pg= new Program11();
	      
	      pg.meth2();
	      meth1();
	}
	public static void main(String[] args) {
		
      meth1();
      Program11 pg= new Program11();
      
      pg.meth2();
	}

}
