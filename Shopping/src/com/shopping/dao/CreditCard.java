package com.shopping.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bankinfo")
public class CreditCard {

	@Id
	@Column(name="nameoncard")
	String name;
	@Column(name="cardnumber")
	String cnumber;
	@Column(name="month")
	String month;
	@Column(name="year")
	String year;
	@Column(name="cvv")
	String cvv;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCnumber() {
		return cnumber;
	}
	public void setCnumber(String cnumber) {
		this.cnumber = cnumber;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	
	public CreditCard(String nameoncard ,String cardnumber ,String month,String year,String cvv)
	{
		this.name=nameoncard;
		this.cnumber=cardnumber;
		this.month= month;
		this.year=year;
		this.cvv=cvv;
	}
	// uid is unqiue key in the table, need atleast a constructor with uid only.
	
	
	public CreditCard()
	{
	}
	
	

	public String toString()
	{
		return "NameOnCard:"+name+",CardNumber:"+cnumber+"Month:"+month+"Year"+year+"CVV NUMBER:"+cvv;
	}

}
