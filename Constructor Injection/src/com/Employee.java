package com;

import java.util.List;
import java.util.Set;

public class Employee {
	private String companyName;
	private List<String> names;
	private Set<Integer> ids;
	public Employee(String companyName, List<String> names, Set<Integer> ids) {
		super();
		this.companyName = companyName;
		this.names = names;
		this.ids = ids;
	}
	
	@Override
	public String toString() {
		
		return "The Employee with id nos "+ids+" and name "+names+" belongs to company "+companyName;
		
	}
}
