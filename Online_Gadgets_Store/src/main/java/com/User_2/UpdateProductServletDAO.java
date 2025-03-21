package com.User_2;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.User_1.DBConnect;

public class UpdateProductServletDAO 
{
	
	public int UpdateCusProductDetails(String ProductId,String Quantity)
	{
		int rowCount=0;
		
		try
		
		{
			Connection con=DBConnect.getCon();
			PreparedStatement pstm=con.prepareStatement("update product set pqty=pqty-? where pcode=? and pqty>=?");
			pstm.setInt(1, Integer.parseInt(Quantity));
			pstm.setString(2, ProductId);
			pstm.setInt(3, Integer.parseInt(Quantity));
			rowCount=pstm.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowCount;
	}
}