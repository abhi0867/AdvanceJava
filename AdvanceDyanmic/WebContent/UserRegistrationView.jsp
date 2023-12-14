<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UserRegistrationctl" method="post">
<table>
<tr>
<th>FirstName</th>
<td><input type="text" name="FirstName"></td>
</tr>
<tr>
<th>LastName</th>
<td><input type="text" name="LastName"></td>
</tr>
<tr>
<th>LoginId</th>
<td><input type="text" name="LoginId"></td>
</tr>
<tr>
<th>password</th>
<td><input type="text" name="password"></td>
</tr>
<tr>
<th>dob</th>
<td><input type="date" name="dob"></td>
</tr>

<tr>
<th>address</th>
<td><input type="text" name="address"></td>
</tr>

<tr>
<th></th>
<td> <button>submit</button></td>
</tr>

</table>
</form>
</body>
</html>