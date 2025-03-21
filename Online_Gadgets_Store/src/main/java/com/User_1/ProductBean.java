package com.User_1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductBean  implements Serializable
{
  private String pCode,pName,pCompany,pPrice,pqty;

public String getpCode() {
	return pCode;
}

public void setpCode(String pCode) {
	this.pCode = pCode;
}

public String getpName() {
	return pName;
}

public void setpName(String pName) {
	this.pName = pName;
}

public String getpCompany() {
	return pCompany;
}

public void setpCompany(String pCompany) {
	this.pCompany = pCompany;
}

public String getpPrice() {
	return pPrice;
}

public void setpPrice(String pPrice) {
	this.pPrice = pPrice;
}

public String getPqty() {
	return pqty;
}

public void setPqty(String pqty) {
	this.pqty = pqty;
}
  public ProductBean() {}
}
