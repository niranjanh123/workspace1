package employee;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class demo21 {
	public static void main(String [] args) throws SQLException
	  {
		  Connection con=null;
		  Statement stmt=null;
		  ResultSet resultSet=null;
		  try {
			  //1.Load the driver
			  try {
				  Class.forName("com.mysql.jdbc.Driver");
				  String dbur = "jdbc:mysql://localhost:3306/employee?user=root&password=admin";
						  con= DriverManager.getConnection(dbur);
						  String query="insert into new_table values(?,?,?)";
						  PreparedStatement pstmt=con.prepareStatement(query);
						  int id=5;
						  String name="Manoj";
						  String branh="CSE";
						  pstmt.setInt(1, id);
						  pstmt.setString(2, name);
                           pstmt.setString(3, branh);		
                           int count=pstmt.executeUpdate();
                           if(count==1)
                        	   System.out.println("Profile Updated");
//						  while(resultSet.next())
//						  {
//							  int empid=resultSet.getInt("id");
//							  String empname=resultSet.getString("name");
//							  String branch=resultSet.getString("branch");
//							  System.out.println("Emploee id:"+empid);
//							  System.out.println("Employee name:"+empname);
//							  System.out.println("Employee branch:"+branch);
//						  }
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
	  


