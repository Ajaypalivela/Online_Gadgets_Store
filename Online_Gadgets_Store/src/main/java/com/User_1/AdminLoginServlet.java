package com.User_1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
@WebServlet("/alog")
public class AdminLoginServlet extends HttpServlet
{
  @Override
  protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
  {
	  AdminBean abean=new AdminLoginDAO().checkAdminLogin(req.getParameter("ausername"),req.getParameter("apwd"));
	  if(abean==null)
	  {
		  req.setAttribute("msg", "Invalid Admin Crdentials!!!");
		  RequestDispatcher rd=req.getRequestDispatcher("AdminLogin.html");
		  rd.forward(req, res);
	  }
	  else
	  {
		  HttpSession session=req.getSession();
		  session.setAttribute("abean", abean);
		  RequestDispatcher rd=req.getRequestDispatcher("AdminHome.jsp");
		  rd.forward(req, res);
		  
	  }
  }
}
