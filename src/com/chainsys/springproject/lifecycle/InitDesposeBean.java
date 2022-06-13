package com.chainsys.springproject.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
// import org.springframework.beans.factory.config.BeanPostProcessor;  Refer App

public class InitDesposeBean implements DisposableBean, InitializingBean {

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	private String city;
	private long pinCode;
     // Called after setter method
	@Override
	public void afterPropertiesSet() throws Exception {
      System.out.println("afterPropertiesSet method is called");
	}
      
	@Override
	public void destroy() throws Exception {
     System.out.println("destroy method is called");
	}

	public InitDesposeBean() {
		System.out.println("InitDesposeBean object created " + hashCode());
	}

	// After constructor
	public void setUp() {
		System.out.println("Starting InitDesposeBean ");
	}

	public void close() {
		System.out.println("Closing InitDesposeBean");
	}
	public void print() {
		System.out.println("print called in InitDesposeBean");
	}
}
