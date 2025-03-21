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
background-image: url('https://i.pinimg.com/736x/4b/dd/bb/4bddbb708b695f22e4ae4f0e7d2bed85.jpg'); /* Replace with your image path */
   background-repeat: no-repeat;
    background-position: center;
    background-attachment: fixed;
     background-size: cover; 
     
    
    font-family: Arial, sans-serif;
    color:white; /* Text color */
    
   
}

h1 {
    color: deepink;
    text-align: center;
    margin-bottom: 20px;   

}

p {
    font-size: 16px;
    line-height: 1.5;
    margin-bottom: 10px;
}

form {
    background-color: deepink;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
}

label {
    display: block;   
    color:black;
    margin-bottom: 5px;
    font-weight: bold;
}

input[type="text"]   
 {
    padding: 10px;
    border: 1px solid #black;
    border-radius: 3px;
    width: 50%;
    box-sizing: border-box;
}

input[type="submit"] {
    background-color: deepink;   

    color: deepink;
    padding: 10px 20px;
    border: none;
    border-radius: 3px;
    cursor: pointer;
}

input[type="submit"]:hover {
    background-color: #551A8B;  
 
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>
   <%
   CustomerBean cbean=(CustomerBean)session.getAttribute("cbean");
  ArrayList<ProductBean>al=(ArrayList<ProductBean>)session.getAttribute("ProductList");

    ProductBean pb=(ProductBean)request.getAttribute("pbean");
    out.println("Miss. "+cbean.getCfname()+" Purches your Product!!!<br><br>");
    out.println("Product Code :"+pb.getpCode()+"<br><br>");
    out.println("Product Name :"+pb.getpName()+"<br><br>");
    out.println("Product Company :"+pb.getpCompany()+"<br><br>");
    out.println("Product Price :"+pb.getpPrice()+"<br><br>");
    out.println("Product Quantity :"+pb.getPqty()+"<br><br>");
%>
<form action="updatecus" method="post">
<label>Required No :</label>
<input type="text" name="reqNo" required><br><br>
 <input type="hidden" name=pcode value="<%=pb.getpCode() %>">
  <input type="submit" value="Buy">
</form>
   
   
</body>
</html>