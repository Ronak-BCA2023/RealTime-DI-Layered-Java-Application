package com.ronaksoft.bo;

/**
 * This is also known as entity class/ model class/ persistence class/ Bo class
 **/

public class CustomerBo {

	private String name;
	private String address;
	private float pAmt;
	private float interest;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getpAmt() {
		return pAmt;
	}

	public void setpAmt(float pAmt) {
		this.pAmt = pAmt;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}
}
