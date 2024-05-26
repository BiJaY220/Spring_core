package com.springcore.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> name;
	private Map<String, Integer> fees;
	private Properties properties;
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getFees() {
		return fees;
	}

	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", fees=" + fees + ", properties=" + properties + "]";
	}

	
	

}
