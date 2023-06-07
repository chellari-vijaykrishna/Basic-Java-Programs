package com.vj.cons;

public class Box {
	
	private int length=0;
	private int height=0;
	private int depth=0;
	
	
	public Box(int length, int height, int depth) {
		this.length = length;
		this.height = height;
		this.depth = depth;
	}
	
	
	public static void main(String[] args) {
		Box box ;
		
		box = new Box(10,20,30);
		
		int result = box.length*box.height*box.depth;
		System.out.println(result+" cm^2");
	}
	
	
	

}
