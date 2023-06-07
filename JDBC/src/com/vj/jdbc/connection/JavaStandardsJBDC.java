package com.vj.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JavaStandardsJBDC {
	public static void main(String[] args) {
		Scanner sc = null;
		String dsng1=null,dsng2=null,dsng3=null;
		Connection con = null;
		ResultSet rs = null;
		Statement st =null;
		sc = new Scanner(System.in);
		
	try {	
		if(sc!=null) {
			System.out.println("First Dsng : ");
			dsng1=sc.next().toUpperCase();
			System.out.println("Second Dsng : ");
			dsng2=sc.next().toUpperCase();
			System.out.println("Third Dsng : ");
			dsng3=sc.next().toUpperCase();
			
			dsng1 = "'"+dsng1+"'";
			dsng2 = "'"+dsng2+"'";
			dsng3 = "'"+dsng3+"'";	
		}
			String url="jdbc:mysql://@localhost:3306/my_database";
			String username="root";
			String password="Vijay268";
			con = DriverManager.getConnection(url, username, password);		
			
			if(con!=null) {
			st=con.createStatement();
			}
			if(st!=null) {
				
				//prepare query
				String qurey="SELECT EMP_ID,EMP_NAME,EMP_LOCATION,EMP_SALARY FROM EMP WHERE EMP_DESIGINATION IN ("+dsng1+","+dsng2+","+dsng3+") ORDER BY EMP_ID";
				System.out.println(qurey);
				if(st!=null) {
					rs=st.executeQuery(qurey);
				}
				Boolean check=false;
				while(rs.next()!=false) {
					check = true;
					System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				}
				if(check==false) {
					System.out.println("Records not found");
				}
			}
			
		} 
	     catch (SQLException e)
	    {
		    e.printStackTrace();
	    }
	    catch (Exception e)
	     {
		e.printStackTrace();
	    }
	finally {
		
		try {
		if(con!=null) {
			con.close();
		}}catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(st!=null) {
				st.close();
			}}catch (SQLException e) {
				e.printStackTrace();
			}
		
		try {
			if(st!=null) {
				st.close();
			}}catch (SQLException e) {
				e.printStackTrace();
			}
		
		try {
			if(sc!=null) {
				sc.close();
			}}catch (Exception e) {
				e.printStackTrace();
			}
	}
		
	}

}
