package com.bank.model;

import java.io.Serializable;

public class User implements Serializable{
private String firstname,lastname,accounttype,pancardNo,address;
private long aadharcard,accountNo,phoneNo;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getAccounttype() {
	return accounttype;
}
public void setAccounttype(String accounttype) {
	this.accounttype = accounttype;
}
public String getPancardNo() {
	return pancardNo;
}
public void setPancardNo(String pancardNo) {
	this.pancardNo = pancardNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getAadharcard() {
	return aadharcard;
}
public void setAadharcard(long aadharcard) {
	this.aadharcard = aadharcard;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
}
