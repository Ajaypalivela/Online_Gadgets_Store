package com.User_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.User_1.DBConnect;
import com.User_1.ProductBean;

public class ViewCustomerProductDAO 
{
	 ArrayList<ProductBean>al=new ArrayList<ProductBean>();
	    
	    public ArrayList<ProductBean>reteriveProducts()
	    {
	    	try
	    	{
	    		Connection con=DBConnect.getCon();
	    		PreparedStatement pstm=con.prepareStatement("Select * from product");
	    		ResultSet rs=pstm.executeQuery();
	    		while(rs.next())
	    		{
	    			ProductBean pb=new ProductBean();
	    			pb.setpCode(rs.getString(1));
	    			pb.setpName(rs.getString(2));
	    			pb.setpCompany(rs.getString(3));
	    			pb.setpPrice(rs.getString(4));
	    			pb.setPqty(rs.getString(5));
	    			al.add(pb);
	    		}
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    	return al;
	    }

}
