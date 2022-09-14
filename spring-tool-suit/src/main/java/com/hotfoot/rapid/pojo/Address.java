package com.hotfoot.rapid.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@JsonIgnoreType
public class Address {

	private String line1;

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}
	
	
}
