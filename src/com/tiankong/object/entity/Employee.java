package com.tiankong.object.entity;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable {
	
	private String name;
	
	private double salary;
	
	private Date hireDay;
	
	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		this.hireDay = calendar.getTime();
	}
	
	public Employee clone() throws CloneNotSupportedException {
		Employee cloned = (Employee) super.clone();
		cloned.hireDay = (Date) hireDay.clone();
		
		return cloned;
	}
	
	public void raiseSalary(double byPercent){
		double raise = this.salary * byPercent / 100;
		this.salary+= raise;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}
	
}
