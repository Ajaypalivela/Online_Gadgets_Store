package com.User_1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProductDAO 
{
  public int UpdateProductDetails(ProductBean pb)
  {
	  int rowCount=0;
	  try
	  {
		  Connection con=DBConnect.getCon();
		  PreparedStatement pstm=con.prepareStatement("update product set pprice=? , pqty=? where pcode=?");
		  pstm.setString(1, pb.getpPrice());
		  pstm.setString(2, pb.getPqty());
		  pstm.setString(3, pb.getpCode());
		  rowCount =pstm.executeUpdate();
		  
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return rowCount;
  }

public int UpdateProductDetails(String pcode, String reqNo) {
	return 0;
}
}
