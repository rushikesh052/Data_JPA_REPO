package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.repository.ICustomerRepository;


@Component
public class CustomerMgmtRunnerTest implements CommandLineRunner {
	
	@Autowired
	private ICustomerRepository custRepo;

	@Override
	public void run(String... args) throws Exception {
			
		custRepo.getByCnameEquals("raja").forEach(System.out::println);
		System.out.println("...............................................");
		List<Customer> cust=custRepo.readByCnameIs("rushi");
		System.out.println(cust);
		System.out.println("................................................");
		custRepo.findByCname("KUMAR").forEach(System.out::println);
		System.out.println(".................................................");
		custRepo.findBycnameStartingWith("k").forEach(System.out::println);
		System.out.println("................................................ ");
		custRepo.findByCnameEndingWith('i').forEach(System.out::println);
		System.out.println("................................................");
		custRepo.findBycnameContaining("hu").forEach(System.out::println);
		
		System.out.println("...............................................");
		custRepo.findBycnameLike("%A").forEach(System.out::println);
	}

}
