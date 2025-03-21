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
@WebServlet("/buy")
public class BuyProductServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession session=req.getSession();
		if(session==null)
		{
			req.setAttribute("msg", "Session is Expired");
			req.getRequestDispatcher("AdminLogin.html").forward(req, res);
		}
		else
		{
			String pcode=req.getParameter("pcode");
		    ArrayList<ProductBean> al=(ArrayList<ProductBean> )session.getAttribute("ProductList");
		    ProductBean pb=null;
		    Iterator<ProductBean>i=al.iterator();
		    while(i.hasNext())
		    {
			    pb=i.next();
			  if(pcode.equals(pb.getpCode()))
			  {
                break;
			  }
		  }
		  req.setAttribute("pbean", pb);
		  req.getRequestDispatcher("BuyProduct.jsp").forward(req, res);
		  
		}
		
	}
}
