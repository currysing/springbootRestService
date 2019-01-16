package com.example.restservice1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice1.entity.CompanyRevenue;
import com.example.restservice1.entity.EmployeeInformation;
import com.example.restservice1.entity.OrderCollectionStatus;
import com.example.restservice1.entity.OrderReceived;
import com.example.restservice1.entity.ProductCategory;
import com.example.restservice1.repository.CompanyRevenueRepository;
import com.example.restservice1.repository.EmployeeInformationRepository;
import com.example.restservice1.repository.OrderCollectionStatusRepository;
import com.example.restservice1.repository.OrderReceivedRepository;
import com.example.restservice1.repository.ProductCategoryRepository;
import com.example.restservice1.service.DashboardService;

@Service
public class DashboardServiceImpl implements DashboardService {

	@Autowired
	private CompanyRevenueRepository companyRevenueRepositoy;

	@Autowired
	private EmployeeInformationRepository employeeInformationRepository;

	@Autowired
	private OrderCollectionStatusRepository orderCollectionStatusRepository;

	@Autowired
	private OrderReceivedRepository orderReceivedRepository;

	@Autowired
	private ProductCategoryRepository productCategoryRepository;

	@Override
	public List<CompanyRevenue> getAllRevenue() {
		return companyRevenueRepositoy.findAll();
	}

	@Override
	public List<EmployeeInformation> getAllEmployee() {
		return employeeInformationRepository.findAll();
	}

	@Override
	public List<OrderCollectionStatus> getAllOrderStatus() {
		return orderCollectionStatusRepository.findAll();
	}

	@Override
	public List<OrderReceived> getAllOrderReceived() {
		return orderReceivedRepository.findAll();
	}

	@Override
	public List<ProductCategory> getBeseCategory() {
		return productCategoryRepository.findByBestCategory(true);
	}



	@Override
	public void deleteEmployee(Long id) {
		employeeInformationRepository.deleteById(id);;
	}

	@Override
	public EmployeeInformation updateEmployee(EmployeeInformation empInfo) {
		employeeInformationRepository.save(empInfo);
		return empInfo;
	}

	@Override
	public EmployeeInformation addEmployee(EmployeeInformation empInfo) {
		employeeInformationRepository.save(empInfo);
		return empInfo;
	}

}
