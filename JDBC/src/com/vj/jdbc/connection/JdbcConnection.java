package com.vj.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection {
	static String qurey="Select * from details"; 
	
	public static void main(String[] args) throws Exception {
		
	
		String url="jdbc:mysql://@localhost:3306/my_database";
		String username="root";
		String password="Vijay268";
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//Road
			Connection c = DriverManager.getConnection(url, username, password);
			//Vehicle
			Statement st = c.createStatement();
			
			ResultSet rs = st.executeQuery(qurey);
		
			while(rs.next()!=false) {
				//System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
				
				//System.out.println(rs.getString(1)+" "+ rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));

				//System.out.println(rs.getString("ID_Details")+" "+ rs.getString("Name")+" "+rs.getString("Location")+" "+rs.getDouble("Salary"));

				System.out.println(rs.getInt("ID_Details")+" "+ rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));

			}
			
			c.close();
			st.close();
			rs.close();
	}

}
