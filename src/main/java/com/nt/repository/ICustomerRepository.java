package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer,Integer>, CrudRepository<Customer, Integer>{
	public List<Customer> getByCnameEquals(String name);
	public List<Customer> readByCnameIs(String  name);
	public List<Customer> findByCname(String name);
	
	public List<Customer> findBycnameStartingWith(String character);
	
	public List<Customer> findByCnameEndingWith(Character character);
	
	public List<Customer> findBycnameContaining(String character);
	
	public Iterable<Customer> findBycnameLike(String cname);
	
	

}
