package com.ronaksoft.service;

import com.ronaksoft.bo.CustomerBo;
import com.ronaksoft.dao.CustomerDao;
import com.ronaksoft.dto.CustomerDto;

// This service class will hold the method for business/service logics.
// Here we will write the method to calculate simple interest and then it will call the dao method to register the customer.
//Here CustomerManagementServiceImpl is a target class and CustomerDaoImpl is dependent class.

public class CustomerManagementServiceImpl implements CustomerManagementService {

	private CustomerDao customerdao;

	public CustomerManagementServiceImpl(CustomerDao customerdao) {
		this.customerdao  = customerdao;
	}

	// calculate simple interest.................
	@Override
	public String calculateSi(CustomerDto dto) throws Exception {
		String name = dto.getName();
		String address = dto.getAddress();
		float rate = dto.getRate();
		float time = dto.getTime();
		float pamt = dto.getpAmt();

		float si = 0.0f;
		si = (pamt * rate * time) / 100.0f;

		CustomerBo bo = new CustomerBo();
		bo.setName(name);
		bo.setAddress(address);
		bo.setpAmt(pamt);
		bo.setInterest(si);

		int registerCustomer = customerdao.registerCustomer(bo);
		if (registerCustomer > 0) {
			return "Customer Register Successfully: ";
		}
		return "Customer Not Register Successfully: ";
	}

	
	
	
	//Delete SI entry from database................
	@Override
	public String deleteSi(CustomerDto dto) throws Exception {
		String name = dto.getName();
		float pamt = dto.getpAmt();
		
		int deleteCustomer = customerdao.deleteCustomer(name, pamt);
		if(deleteCustomer > 0) {
			return "Customer deleted successfully";
		}
		return "Customer not deleted. Something went wrong";
	}
}
