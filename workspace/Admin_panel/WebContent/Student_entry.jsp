<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Student Details Entry</title>
    <link rel="stylesheet" href="student_entry.css">
  </head>
  <body>
        <h1 align="center">Enter all the Student Details</h1>
        <form class="box" action="entrypage.jsp" method="get"> 
            <input type="text" name="usn" placeholder="USN" maxlength="10" title="USN" required> 
            <input type="text" name="dpt" placeholder="Department name" maxlength="3" required>
            <input type="text" name="name" placeholder="Name" title="Full name" required>
            <input type="text" name="sem" pattern="\d*" title="Only digit" placeholder="Sem" maxlength="1" required>
            <input type="text" name="sec" placeholder="Sec" pattern="[A-Za-z]" title="Only Alphabet" maxlength="1" required>
            <input type="text" name="gender" placeholder="Gender" maxlength="1" title="Enter M or F" required>
            <input type="text" name="phone" placeholder="phone_no" maxlength="10" title="10 digit phone number" required>
            <input type="submit" value="submit" >
          </form>

      </body>
</html>