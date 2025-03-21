<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
font-family: Arial, sans-serif;
color:white;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <center><h1>
  <%
  
  session.invalidate();
  out.println("Logged Out Successfully!!!"+"<br><br>");
  
  
  %>
  
  <jsp:include page="index.html"></jsp:include>
  
  </h1></center>
</body>
</html>