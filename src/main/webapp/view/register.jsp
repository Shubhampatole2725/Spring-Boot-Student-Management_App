<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: ivory">

		<div align="center">
			
			<h1>Welcome To Register Page</h1>
			<hr>
			
			<form action="register" method="post">
				
				<label>Name : </label>
				<input type="text" name="name" placeholder="Enter Name Here"><br><br>
			
				<label>Address : </label>
				<input type="text" name="address" placeholder="Enter Address Here"><br><br>
			
				<label>Email : </label>
				<input type="text" name="email" placeholder="Enter Email Here"><br><br>
			
				<label>ContactNo : </label>
				<input type="text" name="contactNo" placeholder="Enter Contact Here"><br><br>
			
				<label>Gender : </label>
				<input type="radio" name="gender" value="Male">Male 
				<input type="radio" name="gender" value="Female">Female <br><br>
			
				<input type="submit" value="SUBMIT">
			
			</form>
		</div>
		
</body>
</html>