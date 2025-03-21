<%@page import="com.User_1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

body {
    background-image: url('https://i.pinimg.com/736x/d8/90/a7/d890a7b047083661a53ba873249f0580.jpg'); /* Replace with your image path */
   background-repeat: no-repeat;
    background-position: center;
    background-attachment: fixed;
     background-size: cover; 
     
    
    font-family: Arial, sans-serif;
    color:white /* Text color */
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
     String msg=(String)request.getAttribute("msg");
     out.println("<br><br>Hello Miss. "+abean.getFname()+"<br><br>");
     out.println(msg+"<br><br>");
     
     
     %>
    <a href="AddProduct.html">Add Product</a><br><br>
   <a href="View1">View Product</a><br><br>
   <a href="logout">Logout</a>
   </h1></center>
</body>
</html>