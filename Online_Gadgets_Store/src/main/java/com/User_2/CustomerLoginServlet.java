package com.User_2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/clog")
public class CustomerLoginServlet extends HttpServlet
{
   protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
   {
	    CustomerBean cbean=new CustomerLoginDAO().checkCustomerLogin(req.getParameter("cusername"),req.getParameter("cpwd"));
	  if(cbean==null)
		  
		  {
			  req.setAttribute("msg", "Invalid Admin Crdentials!!!");
			  RequestDispatcher rd=req.getRequestDispatcher("CustomerLogin.html");
			  rd.forward(req, res);
		  }
		  else
		  {
			  HttpSession session=req.getSession();
			  session.setAttribute("cbean", cbean);
			  RequestDispatcher rd=req.getRequestDispatcher("CustomerHome.jsp");
			  rd.forward(req, res);
			  
		  }
	  }
	}
  
   

