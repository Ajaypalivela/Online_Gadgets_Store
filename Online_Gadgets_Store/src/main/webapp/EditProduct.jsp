<%@page import="com.User_1.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.User_1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

		body {
    background-image: url('https://i.pinimg.com/736x/93/d7/e1/93d7e18e546d92f743c710effd81340d.jpg'); /* Replace with your image path */
   background-repeat: no-repeat;
    background-position: center;
    background-attachment: fixed;
     background-size: cover; 
     font-family: Arial, sans-serif;
    color:white;/* Text color */
     }
     
    .form{
		display: flex;
		flex-direction:column ;
		height: 400px;
		width: 300px;
		border: 1px sold black;
		align-items: center;
		margin: auto;
		margin-top: 40px;
		background-color:deeppink;
		box-shadow: inset -5px -5px rgba(0,0,0,0.5) ;
		border-radius: 25px;
		 color:#551A8B;
		
		
	}
	
	.form h1{
		color:deeppink;
		font-size: 5rem;
		border-bottom: 4px solid rgba(255,255,255,0.5);
		margin: 50px;
	}
	
	.box{
		padding: 12px;
		margin: 20px;
		width: 50%;
		border: none;
		outline: none;
		border-radius: 30px;
		background-color: rgba(0,0,0,0.5);
		color: white;
		font-size: 2rem;
	}
	
	#submit{
		padding:10px 20px ;
		margin-top: 50px;
		width: 50%;
		background-color: rgba(0,0,0,0.5);
		box-shadow: inset -3px -3px rgba(0,0,0,0.5);
		color: white;
		border:none;
		outline: none;
		border-radius: 20px;
		font-size: 2rem;
	}
	#submit:hover{
		cursor: pointer;
		background-color: rgba(255,255,255,0.1);
		color: white;
		
	}
	::placeholder{
		color: white;
	}
     </style>
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <center><h1>
    <%

    AdminBean abean=(AdminBean)session.getAttribute("abean");
    ArrayList<ProductBean> al=( ArrayList<ProductBean> )session.getAttribute("ProductList");
    ProductBean pb=(ProductBean)request.getAttribute("pbean");
    out.println("<br><br>Miss. "+abean.getFname()+ " Please Edit"+"<br><br>");
    
    
    %>
    <form action="update"  class="form"  >
    Product Price<input type=text  name=pPrice  class="form" value="<%=pb.getpPrice() %>"><br><br>
   Product Quantity<input type=text name=pQty  class="form" value="<%=pb.getPqty() %>"><br><br>
    <input type="hidden" name=pcode value="<%=pb.getpCode() %>">
   <br><br><input type="submit" value="Update" id="submit">
    </form>
    </h1></center>
</body>
</html>