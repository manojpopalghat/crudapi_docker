package com.manoj.crud;

//POJO having User Schema
public class User 
{
	private int id;
	private String Name;
	private int age;
	private String department;
	private String subject;
	
	
	public User() 
	{
		super();
		id = 0;
		Name = "";
		age = 0;
		department = "";
		subject = "";
	}
	//getters&setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + ", age=" + age + ", department=" + department + ", subject="
				+ subject + "]";
	}
	
	
}
