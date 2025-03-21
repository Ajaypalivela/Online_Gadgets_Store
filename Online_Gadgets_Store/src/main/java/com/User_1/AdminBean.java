package com.User_1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminBean implements Serializable
{
  private String userName,upwd,fname,lname,address,mail_id,mobile;

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getUpwd() {
	return upwd;
}

public void setUpwd(String upwd) {
	this.upwd = upwd;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getMail_id() {
	return mail_id;
}

public void setMail_id(String mail_id) {
	this.mail_id = mail_id;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}
  public AdminBean() {}
}
