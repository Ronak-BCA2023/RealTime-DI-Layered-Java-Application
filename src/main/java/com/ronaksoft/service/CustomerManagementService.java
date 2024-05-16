package com.ronaksoft.service;

import com.ronaksoft.dto.CustomerDto;

public interface CustomerManagementService {
	
	public String calculateSi(CustomerDto dto) throws Exception;
	public String deleteSi(CustomerDto dto) throws Exception;
}
