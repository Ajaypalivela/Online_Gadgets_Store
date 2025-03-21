package com.User_2;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.User_1.DBConnect;

public class CustomerRegisterDAO 
{
   public int insertCustomer(CustomerBean cbean)
   {
	   int rowCount=0;
	   
	   try
	   {

			Connection con=DBConnect.getCon() ;
			PreparedStatement pstm=con.prepareStatement("insert into customer values (?,?,?,?,?,?,?)");
			pstm.setString(1, cbean.getCname());
			pstm.setString(2, cbean.getCpwd());
			pstm.setString(3, cbean.getCfname());
			pstm.setString(4, cbean.getClname());
			pstm.setString(5, cbean.getCaddr());
			pstm.setString(6, cbean.getCmail());
			pstm.setString(7, cbean.getCphn());
			
			rowCount=pstm.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return rowCount;
	}
	   
   }

