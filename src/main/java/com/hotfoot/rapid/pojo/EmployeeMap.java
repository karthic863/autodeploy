package com.hotfoot.rapid.pojo;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	private Map<String, Object> properties = new HashMap<>();

	
    public Map<String, Object> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}

	public void set(String fieldName, Object value){
        this.properties.put(fieldName, value);
    }

    public Object get(String fieldName){
        return this.properties.get(fieldName);
    }
}
