package com.tiankong.object;

import java.util.Date;

import com.tiankong.object.entity.Employee;

public class ObjectTest1 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e = new Employee("mike", 5000, 2015, 4, 15);
		e.clone();
		Date d = new Date();
		d.clone();
		
		int[] luckNumbers = {2, 3, 5, 7, 11, 13};
		int[] cloned = luckNumbers.clone();
		
		int[] ih = new int[5];
		ih[0] = 1;
		
	}

}
