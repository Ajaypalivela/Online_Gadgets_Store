<%@page import="java.util.Iterator"%>
<%@page import="com.User_1.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.User_2.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
 background-image: url('https://i.pinimg.com/736x/ff/35/21/ff3521cfb466b9b8eec2aa45b5d0fa33.jpg'); 
   background-repeat: no-repeat;
    background-position: center;
    background-attachment: fixed;
     background-size: cover; 
     
    
    font-family: Arial, sans-serif;
    color:white;
}
.product-container {
  border: 1px solid #ddd;
  padding: 15px;
  margin-bottom: 20px;
  background-color: deepink; 
  border-radius: 5px; 
  display: inline-block; 
  width: 300px; 
  text-align: center; 
}

a{

 text-align: center;
    margin-top: 100px;
    color:deeppink;
    text-decoration: none;
    padding: 10px 20px;
    border-radius: 5px;
    background-color:#551A8B; 
}
.product-container a {
 background-color:green;
}
.product-container b {
  font-weight: bold; 
  color:deeppink;
}

.product-container {
  border: 1px solid #ddd; 
  padding: 10px; 
  margin-bottom: 15px; 
}


.product-container h2 {
  color:yellow;
  margin-bottom: 5px; 
 
}


}

 </style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <center><h1>
   <%
        CustomerBean cbean = (CustomerBean) session.getAttribute("cbean");
        ArrayList<ProductBean> al = (ArrayList<ProductBean>) session.getAttribute("ProductList");
        out.println(" <br><br>Hello " + cbean.getCfname() + " <br><br>");

        if (al.size() == 0) {
          out.println("There are NO Products Available!!!<br><br>");
        } else {
      %>
      <%
        Iterator<ProductBean> i = al.iterator();
        while (i.hasNext()) {
          ProductBean pb = i.next();
      %>
      <div class="product-container">  <h2>Product: <%= pb.getpName() %></h2>
        <p>
          <b>Product Code:</b> <%= pb.getpCode() %><br>
          <b>Company:</b> <%= pb.getpCompany() %><br>
          <b>Price:</b> <%= pb.getpPrice() %><br>
          <b>Quantity:</b> <%= pb.getPqty() %>
        </p>
        <a href='buy?pcode=<%= pb.getpCode() %>'>Buy</a>
      </div>
      <%
        }
      %>
      <%
        }
      %>
   <br><br> <a href="logout">Logout</a>
   
  
</body>
</html>