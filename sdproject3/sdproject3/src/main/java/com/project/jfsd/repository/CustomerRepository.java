package com.project.jfsd.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.project.jfsd.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer>
{
	@Query("select c from Customer c where username=?1 and password=?2")
	public Customer checkcustlogin(String uname,String pwd);

	@Query("select c from Customer c where username=?1")
	public Customer viewcustomer(String uname);
	
}
