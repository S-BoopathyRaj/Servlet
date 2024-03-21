<%@ page import="in.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Student s = (Student) request.getAttribute("Student");
	%>
	<table border="2px">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Mark</th>
			<th>Age</th>
		</tr>


		<tr>
			<td><%=s.getId()%></td>
			<td><%=s.getName()%></td>
			<td><%=s.getMark()%></td>
			<td><%=s.getAge()%></td>

		</tr>

	</table>
</body>
</html>