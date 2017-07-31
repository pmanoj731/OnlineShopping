package com.shopping.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class ProductsEntity {

	@Id
	@Column(name="productName")
	String pname;
	@Column(name="productPrice")
	String pprice;
	@Column(name="quantity")
	String quantity;
	@Column(name="username")
	String uname;
	
	
	// data types : int->integer/long , string->varchar/clob, blob or byte[]->blob
	// constructor for register method
	
	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	//constructor for insertion example
	public ProductsEntity(String productName ,String productPrice ,String quantity,String username)
	{
		this.pname=productName;
		this.pprice=productPrice;
		this.quantity=quantity;
		this.uname=username;
	}
	// uid is unqiue key in the table, need atleast a constructor with uid only.
	
	
	public ProductsEntity()
	{
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPprice() {
		return pprice;
	}
	public void setPprice(String pprice) {
		this.pprice = pprice;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	public String toString()
	{
		return "ProductName:"+pname+",ProductPrice:"+pprice+",Quantity:"+quantity+",username:"+uname;
	}

}
