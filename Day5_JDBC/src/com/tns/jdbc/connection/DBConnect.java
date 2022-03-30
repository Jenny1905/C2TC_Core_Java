package com.tns.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect
{
	 public static void main(String args[])throws SQLException
	 {
		 String dbDriver="com.mysql.cj.jdbc.Driver";//
		 
		 String dbURL="jdbc:mysql://localhost:3306/Capgemini"; //(Mysql (tab)- database-manage connection
		 //where Capgemini is the DB name in mYSQL server
		 String dbUsername="root";
		 String dbPassword="root";
		 String query="select * from EnggStudent";
		 try 
		 {
			 Class.forName(dbDriver);
		 }
		 catch(ClassNotFoundException e)
		 {
			 e.printStackTrace();
			 
		 }
		 try
		 {
			 Connection con=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
			 Statement st=con.createStatement();
			 ResultSet rs=st.executeQuery(query);
			 
			 while(rs.next())
			 {
				 String EmployeesData="";
				 for(int i=1;i<=2;i++)// i belongs to column of SQL table  here
				 {
					 EmployeesData=EmployeesData+" "+rs.getString(i);
					 
				 }
				 System.out.println(EmployeesData);
			 }
			 
		 }
		 catch(SQLException e)
		 {
			 System.out.println("An error occurred. Maybe user/password is invalid");
			 e.printStackTrace();
			 
		 }
		
		 
	 }

}
