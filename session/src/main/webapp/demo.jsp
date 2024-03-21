<%@page import="org.w3c.dom.html.HTMLQuoteElement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import= "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FIRST JSP FILE</title>
</head>
<body>
<% Date d=new Date(); %>
<h1><%=d %></h1>

<%!  public void jspInit()
{
System.out.println("jspInit method Invoked");  
}
public void  jspDestroy()
{
	System.out.println("HI i am Service Method");
}
%>
<%= "Welcome"%>
</body>
</html>