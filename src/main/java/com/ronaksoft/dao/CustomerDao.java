package com.ronaksoft.dao;

import com.ronaksoft.bo.CustomerBo;

public interface CustomerDao {
		
	public int registerCustomer(CustomerBo bo) throws Exception;
	public int deleteCustomer(String name, float pamt) throws Exception;
}
