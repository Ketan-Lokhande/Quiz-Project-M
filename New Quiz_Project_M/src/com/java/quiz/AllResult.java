package com.java.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AllResult {
	
	public static void allResult()
	{
		try
		{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("JDBC:mysql://localhost:3306/studentdb","root","ketan1971998");
		Statement smtt=conn.createStatement();
	ResultSet set1=	smtt.executeQuery("select id,Fname,Lname,marks from studentinfo,result where studentinfo.id=result.rid order by Fname");
	
	System.out.print("ID");
	System.out.print("\t\t\t First Name");
	System.out.print("\t\t\t Last Name");
	System.out.println("\t\t\t Marks");
	
	while(set1.next())
		 {
			 
			String idr = set1.getString("id");
			int m= set1.getInt("Marks");
			String fname=set1.getString("Fname");
			String Lname=set1.getString("Lname");
			System.out.print(idr);
			System.out.print("\t\t\t"+fname);
			System.out.print("\t\t\t\t"+Lname);
			System.out.println("\t\t\t " +m);
			}
		 smtt.close();
		 conn.close();
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		(Ak boss)
	}

}
