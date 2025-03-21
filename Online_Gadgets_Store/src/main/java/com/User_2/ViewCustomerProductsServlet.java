package com.User_2;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.User_1.ProductBean;

@SuppressWarnings("serial")
@WebServlet("/View2")
public class ViewCustomerProductsServlet extends HttpServlet
{
	@Override
	 protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	  {
		 HttpSession session= req.getSession(false);
		  if(session==null)
		  {
			  req.setAttribute("msg", "Session Experied");
			  req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
			 
		  }
		  else
		  {
			  ArrayList<ProductBean>al=new ViewCustomerProductDAO().reteriveProducts();
			  session.setAttribute("ProductList", al);
			 
			  req.getRequestDispatcher("ViewCustomerProduct.jsp").forward(req, res);
		 }
	  }
}
