package com;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class College {
	
	private String name;
	private List<String> depts;
	private Set<String> hods;
	private Map<String,Integer> details;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setDepts(List<String> depts) {
		this.depts=depts;
	}
	public List<String> getDepts(){
		return depts;
	}
	
	public void setHods(Set<String> hods) {
		this.hods=hods;
	}
	public Set<String> getHods(){
		return hods;
	}
	
	public void setDetails(Map<String,Integer> details) {
		this.details=details;
	}
	public Map<String,Integer> getDetails(){
		return details;
	}
}
