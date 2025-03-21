<%@page import="com.User_1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

body {
    background-image: url('https://i.pinimg.com/564x/92/97/f6/9297f6af92dcce2cc6d630e32395551f.jpg'); /* Replace with your image path */
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
    color:#551A8B;
    text-decoration: none;
    padding: 10px 20px;
    border-radius: 5px;
    background-color:deeppink; 
}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<center><h1>
   <%
   AdminBean abean=(AdminBean)session.getAttribute("abean");
   out.println("<br><br>Welcome Miss."+abean.getFname()+"!!!"+"<br><br><br><br>");
   
   
   %>
   
   <a href="AddProduct.html">Add Product</a><br><br>
   <a href="View1">View Product</a><br><br>
   <a href="logout">Logout</a>
   
   </h1></center>
</body>
</html>
