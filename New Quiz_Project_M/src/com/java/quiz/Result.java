package com.java.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Result {
	static int marks;
	public static void checkans()
	{
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("JDBC:mysql://localhost:3306/studentdb","root","ketan1971998");
		Statement smt=con.createStatement();
		
	ResultSet set=	smt.executeQuery("select * from ques order by rand()");

		 while(set.next())
		 {
			int no = set.getInt("No");
			String q=set.getString("question");
			String dans=set.getString("answer");
		    System.out.println(q);
		   
			System.out.println("Enter the correct option (a/b/c/d)");
			Scanner scq= new Scanner(System.in);
			String ans=scq.next();
			
			if(dans.equals(ans))
			{
				marks++;
			}
						
	}
		 System.out.println("Your Exam Is completed");
		 
		smt.close();
		con.close();
		resultEntry();
		
		if(marks>=8)
		{
			System.out.println("Congratulation you are pass!!! You have earn A grade"+"Your marks:"+marks);
		}
		else if(marks>=5&& marks<8)
		{
			System.out.println("Congratulation you are pass!!! You have earn B grade"+"Your marks:"+marks);
		}
		
		else
		{
			System.out.println("You are failed Better luck next time. You have earn c grade"+"Your marks:"+marks);
		}
		
		
	}
	
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void resultTable()
	{
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("JDBC:mysql://localhost:3306/studentdb","root","ketan1971998");
		Statement smt=con.createStatement();
		String q= "create table result(rid varchar(250) not null,marks int)";
		smt.executeUpdate(q);
		System.out.println("Result table created");
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	
	public static void resultEntry()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("JDBC:mysql://localhost:3306/studentdb","root","ketan1971998");
			PreparedStatement psmt=con.prepareStatement("insert into result (rid,marks) values (?,?)");
			System.out.println("To see result Enter Your ID");
			Scanner scr= new Scanner(System.in);
			String lid =scr.next();
			
			psmt.setString(1, lid);	
			psmt.setInt(2, Result.marks);		
			psmt.executeUpdate();
			
	psmt.close();
	con.close();
			
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
		
	}


