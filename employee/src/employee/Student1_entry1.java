package employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Student1_entry1 extends HttpServlet{
	   Connection con;
	   String  usn,dpt_name,name,sec,gender,sem,phone_no;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		System.out.println("Reached here");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		 try {
//	 	    	con=DatabaseConnection.intializeDatabase();
			    System.out.println("Reached to connection part");
			    Class.forName("com.mysql.jdbc.Driver");
			    System.out.println("Connection done");
			    String dbur = "jdbc:mysql://localhost:3306/student_assist?user=root&password=admin";
			    con= DriverManager.getConnection(dbur);
	 	    	usn=req.getParameter("usn").toString();	
	 	    	dpt_name=req.getParameter("dpt").toString();
	 	    	name=req.getParameter("name").toString();
	 	    	sem=req.getParameter("sem").toString();
	 	    	sec=req.getParameter("sec").toString();
	 	    	gender=req.getParameter("gender").toString();
	 	    	phone_no=req.getParameter("phone").toString();
	 	    	String query="insert into student values(?,?,?,?,?,?,?)";
			    PreparedStatement pstmt=con.prepareStatement(query);
				pstmt.setString(1,usn);
				pstmt.setString(2, dpt_name);
             pstmt.setString(3, name);
             pstmt.setString(4, sem);
             pstmt.setString(5, sec);
             pstmt.setString(6, gender);
             pstmt.setString(7, phone_no);
             int count=pstmt.executeUpdate();
             if(count==1)
          	 System.out.println("Profile Updated");
		 }catch(Exception e) {
	    	 e.printStackTrace();
	     }
		
	}
}
