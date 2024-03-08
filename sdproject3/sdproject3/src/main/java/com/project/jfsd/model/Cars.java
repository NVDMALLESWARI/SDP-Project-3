package com.project.jfsd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Table(name="cars")
public class Cars 
{
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable = false,length = 200)
	private String name;
	@Column(nullable = false,unique = true,length = 200)
	private String email;
	@Column(nullable = false,length = 200)
	private String state;
	@Column(nullable = false,length = 200)
	private String city;
	@Column(nullable = false,length = 200)
	private String dealer;
	@Column(nullable = false,length = 200)
	private String buyertype;
	@Column(nullable = false,length = 200)
	private String model;
	@Column(nullable = false,length = 200,unique = true)
	private String mobileno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDealer() {
		return dealer;
	}
	public void setDealer(String dealer) {
		this.dealer = dealer;
	}
	public String getBuyertype() {
		return buyertype;
	}
	public void setBuyertype(String buyertype) {
		this.buyertype = buyertype;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	
	

}
