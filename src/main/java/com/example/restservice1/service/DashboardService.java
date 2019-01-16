package com.example.restservice1.service;

import java.util.List;

import com.example.restservice1.entity.CompanyRevenue;
import com.example.restservice1.entity.EmployeeInformation;
import com.example.restservice1.entity.OrderCollectionStatus;
import com.example.restservice1.entity.OrderReceived;
import com.example.restservice1.entity.ProductCategory;


public interface DashboardService {

	List<CompanyRevenue> getAllRevenue();
	
	List<EmployeeInformation> getAllEmployee();
	
	List<OrderCollectionStatus> getAllOrderStatus();
	
	List<OrderReceived> getAllOrderReceived();
	
	//get the ProductCategory where bestCategory = true
	List<ProductCategory> getBeseCategory();
	
	EmployeeInformation addEmployee(EmployeeInformation empInfo);
	
	void deleteEmployee(Long id);
	
	EmployeeInformation updateEmployee (EmployeeInformation empInfo);
	
}
