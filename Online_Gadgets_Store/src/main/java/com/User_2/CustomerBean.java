package com.User_2;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CustomerBean implements Serializable
{
   private String cname,cpwd,cfname,clname,caddr,cmail,cphn;

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public String getCpwd() {
	return cpwd;
}

public void setCpwd(String cpwd) {
	this.cpwd = cpwd;
}

public String getCfname() {
	return cfname;
}

public void setCfname(String cfname) {
	this.cfname = cfname;
}

public String getClname() {
	return clname;
}

public void setClname(String clname) {
	this.clname = clname;
}

public String getCaddr() {
	return caddr;
}

public void setCaddr(String caddr) {
	this.caddr = caddr;
}

public String getCmail() {
	return cmail;
}

public void setCmail(String cmail) {
	this.cmail = cmail;
}

public String getCphn() {
	return cphn;
}

public void setCphn(String cphn) {
	this.cphn = cphn;
}
   
public CustomerBean() {}
   
}
