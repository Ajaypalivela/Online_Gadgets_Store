<%@page import="com.User_2.CustomerBean"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

body {
    background-image: url('https://i.pinimg.com/736x/f7/d6/6a/f7d66a41282e4f2cffe0bb8947083523.jpg'); /* Replace with your image path */
   background-repeat: no-repeat;
    background-position: center;
    background-attachment: fixed;
     background-size: cover; 
     
    
    font-family: Arial, sans-serif;
    color:white; /* Text color */
}
a {
 text-align: center;
    margin-top: 100px;
    color:deeppink;
    text-decoration: none;
    padding: 10px 20px;
    border-radius: 5px;
    background-color:#551A8B; 
}
   </style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <center><h1>
  
  <%
  CustomerBean cbean=(CustomerBean)session.getAttribute("cbean");
  out.println("<br><br><br><br>Welcome "+cbean.getCfname()+"!!!"+"<br><br><br><br>");
  
  
  %>
  
  <a href="View2">View Products</a><br><br>
   <a href="logout">Logout</a>
</body>
</html>