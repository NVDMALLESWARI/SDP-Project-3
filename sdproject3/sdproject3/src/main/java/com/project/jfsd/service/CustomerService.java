package com.project.jfsd.service;


import com.project.jfsd.model.Customer;

public interface CustomerService 
{
	public Customer addcustomer(Customer customer);
	public Customer checkcustlogin(String uname,String pwd);
	public Customer viewcustomer(String uname);

}
