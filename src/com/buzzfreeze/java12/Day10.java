package com.buzzfreeze.java12;

public class Day10 {

	public static void main(String[] args) {

		Employee dang = new Employee("Dang", "Red", 5000, "tester");

		dang.hello();
		System.out.println(dang.getSalary());
		

//		Employee[] employees = new Employee[3];
//		for (int i = 0; i < employees.length; i++) {
//			employees[i] = new Employee("name" + i, "lastname" + i, i * 10000,"tester");
//		}
//		System.out.println(employees[1].firstname); // name1
//		System.out.println(employees[2].firstname); // name2
//		System.out.println(employees[1].getSalary()); // 10000
//		System.out.println(employees[2].getSalary()); // 20000
	}

}
