package com.shopping.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class UsersEntity {

	@Id
	@Column(name="username")
	String uname;
	@Column(name="firstname")
	String first;
	@Column(name="lastname")
	String last;
	@Column(name="Email")
	String email;
	@Column(name="pwd")
	String pwd;	
	@Column(name="confirmpwd")
	String cpwd;
	
	// data types : int->integer/long , string->varchar/clob, blob or byte[]->blob
	// constructor for register method
	public UsersEntity(String firstname,String lastname, String Email,String username,String pwd ,String confirmpwd)
	{
		this.first=firstname;
		this.last=lastname;
		this.email=Email;
		this.uname=username;
		this.pwd=pwd;
		this.cpwd=confirmpwd;
	}
	//constructor for insertion example
	public UsersEntity(String username,String pwd ,String confirmpwd)
	{
		this.uname=username;
		this.pwd=pwd;
		this.cpwd=confirmpwd;
	}
	// uid is unqiue key in the table, need atleast a constructor with uid only.
	
	public UsersEntity(String username)
	{
		this.uname=username;
	}
	public UsersEntity()
	{
	}
	
	
	public String getfirst() {
		return first;
	}

	public void setfirst(String firstname) {
		this.first = firstname;
	}
	public String getlast() {
		return last;
	}

	public void setlast(String lastname) {
		this.last = lastname;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String Email) {
		this.email = Email;
	}
	
	public String getuname() {
		return uname;
	}

	public void setuname(String username) {
		this.uname = username;
	}

	public String getpwd() {
		return pwd;
	}

	public void setpwd(String password) {
		this.pwd = password;
	}

	public String getcpwd() {
		return cpwd;
	}

	public void setcpwd(String confirmpassword) {
		this.cpwd = confirmpassword;
	}

	public String toString()
	{
		return "FirstName:"+first+",LastName:"+last+",Email:"+email+",UserName:"+uname+",Password:"+pwd+",Confrimpass:"+cpwd;
	}

}
