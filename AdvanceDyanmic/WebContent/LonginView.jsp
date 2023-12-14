
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginCtl" method="post">
	<%@ include file = "header.jsp" %>
		<div align="center">
			<table>
				<h2><%String  msg=(String)request.getAttribute("msg"); %></h2>
				<%if(msg!=null){ %>
				<%= msg %>
				<%} %>
				<tr>
				<th>loginId</th>
				<td><input input type="text" name="loginid"></td>
				</tr>
				
				<tr>
				<th>password</th>
				<td><input input type="text" name="password"></td>
				</tr>
				<td><button>submit</button></td>
				
			</table>
		</div>
	</form>
</body>
</html>
