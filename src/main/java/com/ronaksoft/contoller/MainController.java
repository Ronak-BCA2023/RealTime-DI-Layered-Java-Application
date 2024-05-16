package com.ronaksoft.contoller;

import com.ronaksoft.dto.CustomerDto;
import com.ronaksoft.service.CustomerManagementServiceImpl;
import com.ronaksoft.vo.CustomerVo;

//This class contains monitring logic for any user request.
//It will call the method of service class.

public class MainController {
	private CustomerManagementServiceImpl customerservice;
	
	public MainController(CustomerManagementServiceImpl customerservice) {
			this.customerservice = customerservice;
	}

	public String processCustomer(CustomerVo vo) throws Exception{
		CustomerDto dto = null;
		dto = new CustomerDto();
		dto.setName(vo.getName());
		dto.setAddress(vo.getAddress());
		dto.setpAmt(Float.parseFloat(vo.getpAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		
		//call the calculatiSi method............
		String status = customerservice.calculateSi(dto);
		return status;
	}
	
	
	public String deleteCustomerData(CustomerVo vo) throws Exception{
		CustomerDto dto = null;
		dto = new CustomerDto();
		dto.setName(vo.getName());
		dto.setpAmt(Float.parseFloat(vo.getpAmt()));
		
		//call the deleteSi method............
		String status = customerservice.deleteSi(dto);
		return status;
	}
}
