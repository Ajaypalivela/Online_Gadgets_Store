package com.User_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.User_1.ProductBean;

@SuppressWarnings("serial")
@WebServlet("/updatecus")
public class UpdateCusProductServlet  extends HttpServlet
{
		protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	 	 	{
	 	 		  HttpSession session=req.getSession(false);
	 	 		  if(session==null)
	 	 		  {
	 	 			  req.setAttribute("msg", "Session is Expired");
	 	 			  req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
	 	 		  }
	 	 		  else
	 	 		  {
	 	 			  String pcode=req.getParameter("pcode");
	 	 			  String reqNo=req.getParameter("reqNo");
	 	 			  
	 	 			  UpdateProductServletDAO obj=new UpdateProductServletDAO();
	 	 			  
	 	 			  ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("ProductList");
	 	 			  
	 	 			  ProductBean pb=null;
	 	 			  
	 	 			  Iterator<ProductBean> i=al.iterator();
	 	 			  while(i.hasNext())
	 	 			  {
	 	 				  pb=i.next();
	 	 				  
	 	 				  if(pcode.equals(pb.getpCode()))
	 	 				  {
	 	 					  break;
	 	 			  }
	 	 			  }
	 	 			  int rowCount=obj.UpdateCusProductDetails(pcode, reqNo);
	 	 			  
	 	 			  if(rowCount>0)
	 	 			  {
	 	 				 req.setAttribute("total", Integer.parseInt(reqNo)*Integer.parseInt(pb.getpPrice())); 
	 	 				 req.setAttribute("pbean", pb);
	 	 				 req.getRequestDispatcher("OderConfirmed.jsp").forward(req, res);
	 	 			  }
	 	 			  
	 	 		  }
	 	 			
	 	 	}
	 }

