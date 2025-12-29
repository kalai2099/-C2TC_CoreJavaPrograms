package com.tnsif.oops.inheritance.hierarchicalinheritance;

public class Hierarchicalnhdemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person p;
		p = new Person("kalai", "pondicherry");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		p = new Employee("vendhan", "chennai", 101, 67000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student("vedha", "chennai", "FE", 88);
		if (p instanceof Student)
			System.out.println("Student Details "+p);

	}

}
