package com.User_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.User_1.DBConnect;

public class CustomerLoginDAO 
{
	public CustomerBean checkCustomerLogin(String username, String password)
	{
		CustomerBean cbean=null;
		
		try
		{
			Connection con=DBConnect.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from customer where uname=? and pword=?");
			pstm.setString(1, username);
			pstm.setString(2, password);
			ResultSet rs=pstm.executeQuery();
			if(rs.next())
			{
				cbean =new CustomerBean();
				cbean.setCname(rs.getString(1));
				cbean.setCpwd(rs.getString(2));
				cbean.setCfname(rs.getString(3));
				cbean.setClname(rs.getString(4));
				cbean.setCaddr(rs.getString(5));
				cbean.setCmail(rs.getString(6));
				cbean.setCphn(rs.getString(7));
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return cbean;
	}

}


