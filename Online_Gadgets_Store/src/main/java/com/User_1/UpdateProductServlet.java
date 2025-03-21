package com.User_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet
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
    		 String pcode=req.getParameter("pcode");
    		 ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("ProductList");
    		 ProductBean pb=null;
    		 Iterator<ProductBean> i=al.iterator();
    		 while(i.hasNext())
    		 {
    			 pb=i.next();
    			 if(pcode.equals(pb.getpCode()))
    				 break;
    		 }   
    		 pb.setpPrice(req.getParameter("pPrice"));
    		 pb.setPqty(req.getParameter("pQty"));
    		 
    		 int rowCount=new UpdateProductDAO().UpdateProductDetails(pb);
    		 if(rowCount>0)
    		 {
    			 req.setAttribute("msg", "Product Details Update!!");
    			 req.getRequestDispatcher("UpdateProduct.jsp").forward(req, res);
    		 }
    	  }
    }
}
