package com.User_1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/View1")
public class ViewProductServlet extends HttpServlet
{
  protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
  {
	 HttpSession session= req.getSession(false);
	  if(session==null)
	  {
		  req.setAttribute("msg", "Session Experied");
		  req.getRequestDispatcher("AdminLogin.html").forward(req, res);
		 
	  }
	  else
	  {
		  ArrayList<ProductBean>al=new ViewProductDAO().reteriveProducts();
		  session.setAttribute("ProductList", al);
		  req.setAttribute("msg", "Product Details!!!");
		  req.getRequestDispatcher("ViewProduct.jsp").forward(req, res);
	  }
  }
}
