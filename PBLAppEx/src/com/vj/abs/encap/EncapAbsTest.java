package com.vj.abs.encap;

import java.util.Scanner;

public class EncapAbsTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Author details :");
		System.out.println("Enter name of the author :");
		String authorName = sc.nextLine();
		System.out.println("Enter Email ID of the author :");
		String emailId = sc.nextLine();
		System.out.println("Enter Gender of the author :");
		char gender =  sc.next().charAt(0);
	
		Author author = new Author(authorName, emailId, gender);
		
		System.out.println("Enter name of the book :");
		sc.nextLine();
		String bookName = sc.nextLine();
		System.out.println("Enter price of the book :");
		double bookPrice = sc.nextDouble();
		System.out.println("Enter Quantity of the books :");
		int bookQuantity = sc.nextInt();
		Book book = new Book(bookName, author, bookPrice, bookQuantity);
		
		String S1 = author.toString();
		System.out.println("Author Details : "+S1);
		String S2 = book.toString();
		System.out.println("Book Details : "+S2);
	}

}
