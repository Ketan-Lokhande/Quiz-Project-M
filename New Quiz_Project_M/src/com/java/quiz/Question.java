package com.java.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Question {
	
	public static void question()
	{
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("JDBC:mysql://localhost:3306/studentdb","root","ketan1971998");
		Statement smt=con.createStatement();
		String q= "create table ques(No int primary key not null,question varchar (255) ,answer varchar(255))";
		smt.executeUpdate(q);
		System.out.println("Question table created");
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
public static void fillQuestion()
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("JDBC:mysql://localhost:3306/studentdb","root","Dream@54321");
		PreparedStatement psmt=con.prepareStatement("insert into ques (No,question,answer) values (?,?,?)");
		Scanner sce=new Scanner(System.in);
		
//		//Question 1
//		psmt.setInt(1,1);	
//		psmt.setString(2,"Java is a Successor to which programming language?"+"\n(a)B\n(b)7\n(c)C++\n(d)D\n" );	
//		psmt.setString(3,"c" );
//	    psmt.executeUpdate();
		
//System.out.println("Question 1 inserted");

//Question 2
//		psmt.setInt(1,2);	
//		psmt.setString(2,"Who invented Java language?\n" +"(a)Dennis Ritchie\n(b)James Gosling\n(c)Larry Page\n(d)Serge Page\n" );	
//		psmt.setString(3,"b" );
//	    psmt.executeUpdate();
				
//System.out.println("Question 2 inserted");
//
//Question 3
//	psmt.setInt(1,3);	
//	psmt.setString(2,"What is the original name of Java Programming language?\n"+"(a)J++\n(b)C++\n(c)OAK\n(d)TEAK\n" );	
//	psmt.setString(3,"c" );
//    psmt.executeUpdate();
//				
//System.out.println("Question 3 inserted");
		//Question 3
//		psmt.setInt(1,4);	
//		psmt.setString(2,"The name \"JAVA\" is known to the world as?\n" +"(a)A Tea Brand in India\n(b)A Coffee Brand in Africa\n(c)An Island in Indonesia\n(d)Ragi Malt Juice\n" );	
//		psmt.setString(3,"c" );
//	    psmt.executeUpdate();
//		System.out.println("Question 4 inserted");
		
//		psmt.setInt(1,5);	
//		psmt.setString(2,"A character literal in Java is enclosed within a pair of ___?\n" +"(a)Square brackets\n(b)Double Quotes\n(c)Single Quotes\n(d)Exclamations\n" );	
//		psmt.setString(3,"c" );
//	    psmt.executeUpdate();
//		System.out.println("Question 5 inserted");
		
//		psmt.setInt(1,6);	
//		psmt.setString(2,"An abstract class in Java usually contains one or more abstract ____.\n" +"(a)constructors\n(b)methods\n(c)variables\n(d)None\n" );	
//		psmt.setString(3,"b" );
//	    psmt.executeUpdate();
//		System.out.println("Question 6 inserted");
		
//		psmt.setInt(1,7);	
//		psmt.setString(2,"What is the default boolean literal assigned to a boolean variable in Java?\n" +"(a)true\n(b)false\n(c)undefined\n(d)None of the above\n" );	
//		psmt.setString(3,"b" );
//	    psmt.executeUpdate();
//		System.out.println("Question 7 inserted");
//		
//		psmt.setInt(1,8);	
//		psmt.setString(2,"An abstract class with 100% abstract methods is equivalent to ______.\n" +"(a)Interface\n(b)Concrete class\n(c)Virtual Class\n(d)All the above\n" );	
//		psmt.setString(3,"a" );
//	    psmt.executeUpdate();
//		System.out.println("Question 8 inserted");
		
//		psmt.setInt(1,9);	
//		psmt.setString(2,"Choose a correct statement about abstract classes?\n" +"(a)An abstract class can extend a concrete class\n(b)An abstract class can extend another abstract class\n(c)An abstract class can implement any number of interfaces.\n(d)All the above.\n" );	
//		psmt.setString(3,"d" );
//	    psmt.executeUpdate();
//		System.out.println("Question 9 inserted");
		
		psmt.setInt(1,10);	
		psmt.setString(2,"An abstract class can define ____ inside of it.\n" +"(a)Inner abstract class\n(b)Inner concrete class\n(c)static methods\n(d)All the above\n" );	
		psmt.setString(3,"d" );
	    psmt.executeUpdate();
		System.out.println("Question 10 inserted");
		
		psmt.close();
		con.close();
	}
	
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}


