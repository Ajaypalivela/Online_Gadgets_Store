package com.User_2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@SuppressWarnings("serial")
@WebServlet("/cr")
public class CustomerRegistrationServlet extends HttpServlet
{
  protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
  {
	 CustomerBean cbean=new CustomerBean();
    cbean.setCname(req.getParameter("cname"));
   	cbean.setCpwd(req.getParameter("cpwd"));
   	cbean.setCfname(req.getParameter("cfname"));
   	cbean.setClname(req.getParameter("clname"));
   	cbean.setCaddr(req.getParameter("caddr"));
   	cbean.setCmail(req.getParameter("cmail"));
   	cbean.setCphn(req.getParameter("cphn"));
   	
   	CustomerRegisterDAO obj=new CustomerRegisterDAO();
   	int rowCount=obj.insertCustomer(cbean);
   	if(rowCount>0)
   	{
   		  req.setAttribute("msg", "Customer Registered Successfully!!! <br>");
   		  RequestDispatcher rd=req.getRequestDispatcher("CustomerLogin.jsp");
   		  rd.forward(req, res);
   	}
   	
   	else
   	{
   		req.setAttribute("msg", "Data Not Registerd <br>");
  		 RequestDispatcher rd=req.getRequestDispatcher("Register.jsp");
  		rd.forward(req, res);
   	}
   	
   }
}


