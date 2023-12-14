<%@page import="org.apache.catalina.User"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
<%@ include file="header.jsp"%>
	
<from action="UserListCtl">
	<% List  list=(List)request.getAttribute("List"); 
Iterator it = list.iterator();%>
<table border="2">
		<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>LoginId</th>
			<th>Password</th>
			<th>dob</th>
			<th>address</th>
		</tr>
		<% while(it.hasNext()) {
           UserBean bean =(UserBean)it.next();%>
		<tr>
		<td><%=bean.getId()%></td>
			<td><%=bean.getFirst_name()%></td>
			<td><%=bean.getLast_Name()%></td>
			<td><%=bean.getLogin_Id()%></td>
			<td><%=bean.getPassword()%></td>
			<td><%=bean.getDob()%></td>
			<td><%=bean.getAddress()%></td>





		</tr>
<%} %>


	</table>