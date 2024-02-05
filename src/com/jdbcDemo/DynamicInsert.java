package com.jdbcDemo;
import java.sql.*;
import java.util.Scanner;
public class DynamicInsert {
	public static boolean Insert(String uname,String mail,String password,String gender,String address)throws Exception {
		// Define variables -->
				String Driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "system";
				String pass = "721135";
				
		//sql statement -->
				String sql = "INSERT INTO customers values(?,?,?,?,?)";
				
		// Load Driver --->
				Class.forName(Driver);
				
		//Establish Connection --->
				Connection con = DriverManager.getConnection(url,user,pass);
				
		//Preparing the statement -->
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, uname);
				ps.setString(2, mail);
				ps.setString(3, password);
				ps.setString(4, gender);
				ps.setString(5, address);
				
				ps.executeUpdate();
				
		return true;
	}

}
