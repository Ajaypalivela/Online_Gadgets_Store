<%@page import="com.User_1.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.User_2.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

body {
    background-image: url('https://i.pinimg.com/736x/82/3e/55/823e55b8ad710f84f81fb6240b03e756.jpg'); /* Replace with your image path */
   background-repeat: no-repeat;
    background-position: center;
    background-attachment: fixed;
     background-size: cover; 
     
    
    font-family: Arial, sans-serif;
    color:white;/* Text color */
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
    
    ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("ProductList");
    int total=(int)request.getAttribute("total");
    ProductBean pb=(ProductBean)request.getAttribute("pbean");
    
    
    out.println("<br><br>Hello Miss."+cbean.getCfname()+"<br><br>");
    out.println("You Have Charged "+total+"/rs"+"<br><br>");
    out.println("Your Order is Placed Succesfully!!!<br><br>");
    
    
    
%>
 <a href="View2">View Product</a><br><br>
   <a href="logout">Logout</a>



</body>
</html>