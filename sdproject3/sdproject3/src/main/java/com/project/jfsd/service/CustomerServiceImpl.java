package com.project.jfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.jfsd.repository.CustomerRepository;
import com.project.jfsd.model.Customer;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer addcustomer(Customer customer) 
	{

			return customerRepository.save(customer);
     }		

	@Override
	public Customer checkcustlogin(String uname, String pwd) 
	{
		return customerRepository.checkcustlogin(uname, pwd);
	}



	@Override
	public Customer viewcustomer(String uname) {
		return customerRepository.viewcustomer(uname);

	}

}
