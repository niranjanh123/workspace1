<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    String usn=request.getParameter("usn").toString();	
	String dpt_name=request.getParameter("dpt").toString();
	String name=request.getParameter("name").toString();
	String sem=request.getParameter("sem").toString();
	String sec=request.getParameter("sec").toString();
	String gender=request.getParameter("gender").toString();
	String phone_no=request.getParameter("phone").toString();
	System.out.println(usn+"\n"+dpt_name+"\n"+name+"\n"+sem+"\n"+sec+"\n"+gender+"\n"+phone_no);
	Connection con=null;
	try{
		   Class.forName("com.mysql.jdbc.Driver");
		   String dbur = "jdbc:MYSQL://localhost:3306/student_assist";//user=root&password=admin";
		   con= DriverManager.getConnection(dbur,"root","admin");
		   String query="insert into student values(?,?,?,?,?,?,?)";
		   PreparedStatement pstmt=con.prepareStatement(query);
		   pstmt.setString(1, usn);
		   pstmt.setString(2, dpt_name);
           pstmt.setString(3, name);
           pstmt.setString(4, sem);
           pstmt.setString(5, sec);
           pstmt.setString(6, gender);
           pstmt.setString(7, phone_no);
           pstmt.executeUpdate();
           out.print("Data entered successfully");
	}catch(Exception e){
		out.print(e+"<Br>");
		out.print("Data entery failed");
	}



%>
</body>
</html>