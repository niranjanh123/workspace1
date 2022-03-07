package employee;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Empl {
  public static void main(String [] args) throws SQLException
  {
	  Connection con=null;
	  Statement stmt=null;
	  ResultSet resultSet=null;
	  try {
		  //1.Load the driver
		  try {
			  Class.forName("com.mysql.jdbc.Driver");
			  String dbur = "jdbc:mysql://localhost:3306/student_assist?user=root&password=admin";
					  con= DriverManager.getConnection(dbur);
					  String query="select * from student";
					  stmt=con.createStatement();
					  resultSet = stmt.executeQuery(query);
					  while(resultSet.next())
					  {
						  String empid= resultSet.getString("USN");
						  String empname=resultSet.getString("name");
						  String branch=resultSet.getString("sem");
						  System.out.println("Emploee id:"+empid);
						  System.out.println("Employee name:"+empname);
						  System.out.println("Employee branch:"+branch);
					  }
		  }
		  catch(ClassNotFoundException e) 
		  {
			  e.printStackTrace();
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		 
	  } 
	  finally {
		  try {
			  if(con!=null)
				  con.close();
			  if(stmt!=null)
				  stmt.close();
			  if(resultSet!=null)
				  resultSet.close();
		  }
		  catch(SQLException e)
		  {
			  e.printStackTrace();
		  }
	  }
	  
  }
}
  

