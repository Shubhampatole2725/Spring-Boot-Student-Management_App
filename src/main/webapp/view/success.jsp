<%@page import="com.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<script type="text/javascript">
	
		function editData(){
			alert('You are editing data')
			document.myForm.action="edit";
			document.myForm.submit();			
		}

		function deleteData(){
			alert('You are deleting data')
			document.myForm.action="delete";
			document.myForm.submit();			
		}
	
	</script>

</head>
<body style="background-color: ivory;" >

		<% 
			List<Student> list = (List<Student>)request.getAttribute("list");
		%>
		
	<div style="margin: 0px 230px 0px 230px" align="center">
		<h1>Welcome To Student Data</h1>
		
		<form name="myForm">
			<table border="2px">
			
				<thead>
					<tr>
						<th>Select</th>
						<th>Roll No</th>
						<th>Name</th>
						<th>Address</th>
						<th>Email Id</th>
						<th>Contact No</th>
						<th>Gender</th>
					</tr>
				</thead>
				
				<%
					for(Student stu : list){
				%>
				
				<tbody>
					<tr>
						<td><input type="radio" name="rollNo" value="<%=stu.getRollno()%>"></td>
						<td><%=stu.getRollno() %></td>
						<td><%=stu.getName() %></td>
						<td><%=stu.getAddress() %></td>
						<td><%=stu.getEmail() %></td>
						<td><%=stu.getContactNo() %></td>
						<td><%=stu.getGender() %></td>
					</tr>
					
				</tbody>
			
			<%
					}
			%>
			</table><br>
			<button onclick="editData()"  value="Edit"  style "background-color: red; color: white;">EDIT</button>
			<button onclick="deleteData()"  value="Delete" style="background-color: green; color: white;">DELETE</button>
		</form>	
	</div>
</body>
</html>