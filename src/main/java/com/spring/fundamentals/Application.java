package com.spring.fundamentals;

import com.spring.fundamentals.service.CustomerService;
import com.spring.fundamentals.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		//Hard-coded Object Creation
		CustomerService customerService = new CustomerServiceImpl();	

		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
