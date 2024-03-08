package com.project.jfsd.service;

import java.util.List;

import com.project.jfsd.model.Admin;
import com.project.jfsd.model.Cars;
import com.project.jfsd.model.Customer;

public interface AdminService {
	public Admin checkadminlogin(String uname,String pwd);

	public void deletecustomer(int id);

	List<Customer> viewallCustomer();
	List<Cars> viewallCars();

	public void deletecar(int id);

}
