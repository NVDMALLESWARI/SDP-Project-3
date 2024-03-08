package com.project.jfsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.jfsd.model.Admin;
import com.project.jfsd.model.Cars;
import com.project.jfsd.model.Customer;
import com.project.jfsd.repository.AdminRepository;
import com.project.jfsd.repository.CarRepository;
import com.project.jfsd.repository.CustomerRepository;


@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminRepository adminRespository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CarRepository carrepository;
	@Override
	public Admin checkadminlogin(String uname,String pwd)
	{
		return adminRespository.checkadminlogin(uname, pwd);
	}
	@Override
	public List<Customer> viewallCustomer()
	{
		
		return (List<Customer>) customerRepository.findAll();
	}
	@Override
	public void deletecustomer(int id)
	{
		
	 customerRepository.deleteById(id);
		
	}
	@Override
	public List<Cars> viewallCars() {
		return (List<Cars>) carrepository.findAll();	
	}
	@Override
	public void deletecar(int id) 
	{
		carrepository.deleteById(id);
		
	}
}
