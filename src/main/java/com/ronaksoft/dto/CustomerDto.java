// To transfer data from one project to another or from one class to another in java, we take the help of DTO java bean class.

//Note: While we create DTO class, we have to take care o the data type which is accepting by both sides of the project or classes.

package com.ronaksoft.dto;

import java.io.Serializable;

public class CustomerDto implements Serializable {

	private String name;
	private String address;
	private float pAmt;
	private float rate;
	private float time;

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

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}
	
}
