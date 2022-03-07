<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>STUDENT DETAILS ENTRY</title>
    <link rel="stylesheet" href="student_entry.css">
  </head>
  <body>
        <form class="box" action="entrypage" method="post"> 
            Enter USN<input type="text" name="usn" placeholder="USN">
            Enter Department name<input type="text" name="dpt" placeholder="Department name">
            Enter Name<input type="text" name="name" placeholder="Name">
            Enter Semester<input type="text" name="sem" placeholder="Sem">
            Enter Section<input type="text" name="sec" placeholder="Sec">
            Enter Gender<input type="text" name="gender" placeholder="Gender">
            Enter Phone Number<input type="text" name="phone" placeholder="phone_no">
            <input type="submit" value="submit">
          </form>

      </body>
</html>