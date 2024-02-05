package com.jdbcDemo;

import java.sql.*;

public class ConnectionDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//Define variables -->
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "721135";
		
		// Write a query -->
		// String sql = "CREATE TABLE cricketers(jersey NUMBER, name VARCHAR2(20))";
		//String sql = "INSERT INTO cricketers VALUES(7,'DHONI')";
		//String sql = "UPDATE cricketers SET name='ROHIT' WHERE jersey = 23";
		//String sql = "DELETE FROM cricketers WHERE jersey = 23";
		String sql = "SELECT * FROM cricketers";
		
		//load the driver
		Class.forName(driver);
		
		//establish Connection--->
		Connection con = DriverManager.getConnection(url,user,pass);
		System.out.println("Connection established successfully !");
		
		// Create the statement -->
		Statement st = con.createStatement();
		//st.execute(sql); // Both are same.
		//st.executeUpdate(sql); //this methods are used to execute create,insert,update queries.
		ResultSet rs = st.executeQuery(sql);
		
		//System.out.println("Table created successfully !");
		//System.out.println("1 ROW INSERTED SUCCESSFULLY !");
		System.out.println("Datas are fetched successfully");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" : "+rs.getString(2));
		}
	}

}
