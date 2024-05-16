package com.ronaksoft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;
import com.ronaksoft.bo.CustomerBo;

public class CustomerDaoImpl implements CustomerDao {

	private DataSource datasource;
	private static final String INSERT_CUSTOMER_QUERY = "insert into customer(name, address, pamt, interest) values (?, ?, ?, ?)";
	private static final String DELETE_CUSTOMER_QUERY = "delete from customer where  name = ? and pamt = ?";;
	
	public CustomerDaoImpl(DataSource datasource) {
		this.datasource = datasource;
	}
	
	
	//First method of register customer into database.....................
	@Override
	public int registerCustomer(CustomerBo bo) throws Exception {
		
		//create the connection
		Connection con = datasource.getConnection();
	
		//create the statement
		PreparedStatement ps = con.prepareStatement(INSERT_CUSTOMER_QUERY);
		ps.setString(1, bo.getName());
		ps.setString(2, bo.getAddress());
		ps.setFloat(3, bo.getpAmt());
		ps.setFloat(4, bo.getInterest());
		int numOfRowAffected = ps.executeUpdate();
		ps.close();
		con.close();
		return numOfRowAffected;
	}


	
	//Secont method of delete customer from database.....................
	@Override
	public int deleteCustomer(String name, float pamt) throws Exception {
		
		Connection con = datasource.getConnection();
		PreparedStatement ps = con.prepareStatement(DELETE_CUSTOMER_QUERY);
		ps.setString(1, name);
		ps.setFloat(2, pamt);
		int numOfRowAffected = ps.executeUpdate();
		ps.close();
		con.close();
		return numOfRowAffected;
	}
}
