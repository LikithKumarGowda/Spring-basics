package com;

import java.util.List;

public class Student {
	private int id;
	private List<String> subjects;
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setSubjects(List<String> subjects){
		this.subjects=subjects;
	}
	public List<String> getSubjects(){
		return subjects;
	}
}
