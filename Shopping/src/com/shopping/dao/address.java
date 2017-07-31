package com.shopping.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class address {


		@Id
		@Column(name="doornumber")
		String doornumber;
		@Column(name="city")
		String city;
		@Column(name="state")
		String state;
		@Column(name="zip")
		
		String zip;
		public String getDoornumber() {
			return doornumber;
		}
		public void setDoornumber(String doornumber) {
			this.doornumber = doornumber;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getZip() {
			return zip;
		}
		public void setZip(String zip) {
			this.zip = zip;
		}
	
	
}
