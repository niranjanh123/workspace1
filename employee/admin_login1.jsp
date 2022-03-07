<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="utf-8">
<title>ADMIN ŽLOGIN</title>
<link rel="stylesheet" href="admin.css">
</head>
<body>

	<form class="box" action="loginpage" method="post">
		<h1>Login</h1>
		<input type="text" name="usn" placeholder="USN"> 
		<input type="password" name="pass" placeholder="Password">
		<div>
			<input type="submit" id="myButton" class="loginbutton" value="LOGIN">
		</div>
	</form>
	
	
</body>
</html>