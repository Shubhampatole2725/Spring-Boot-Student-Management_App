<%@page import="com.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center; background-color: ivory;">
	
	<%
		Student stu = (Student)request.getAttribute("student");
	
	%>
		
		<div align="center">
			
		<h1>Welcome To Update Page</h1>
			<hr>
			
			<form action="update" method="post">
				
				<input type="hidden" name="rollno" value="<%=stu.getRollno()%>"><br><br>
				<label>Name : </label>
				<input type="text" name="name" value="<%=stu.getName()%>"><br><br>
			
				<label>Address : </label>
				<input type="text" name="address" value="<%=stu.getAddress()%>"><br><br>
			
				<label>Email : </label>
				<input type="text" name="email" value="<%=stu.getEmail()%>"><br><br>
			
				<label>ContactNo : </label>
				<input type="text" name="contactNo" value="<%=stu.getContactNo()%>"><br><br>
			
				<input type="hidden" name="gender" value="<%=stu.getGender()%>">

				<input type="submit" value="UPDATE">
			
			</form>
		</div>
		
</body>
</html>