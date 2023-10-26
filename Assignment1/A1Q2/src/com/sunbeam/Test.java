package com.sunbeam;

import java.util.Scanner;

public class Test {
	public static int findByEmpid(Employee[] e, int id) {
		int c1 = 0;
		for (int i = 0; i < e.length; i++) {
			c1++;
			if (id == e[i].getEmpid()) {
				System.out.println(e[i]);
				System.out.println("Employee found at index " + i);
				System.out.println("Number of comparisons:" + c1);
			}
		}
		return -1;
	}

	public static int findByEmpName(Employee[] e, String name) {
		int c2 = 0;
		for (int i = 0; i < e.length; i++) {
			c2++;
			if (name.equals(e[i].getEname())) {
				System.out.println(e[i]);
				System.out.println("Employee found at index " + i);
				System.out.println("Number of comparisons:" + c2);
			}
		}
		return -1;
	}

	public static int findBySalary(Employee[] e, double salary) {
		int c3 = 0;
		for (int i = 0; i < e.length; i++) {
			c3++;
			if (salary == e[i].getSalary()) {
				System.out.println(e[i]);
				System.out.println("Employee found at index " + i);
				System.out.println("Number of comparisons:" + c3);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] e = new Employee[5];
		e[0] = new Employee(1, "Pavan", 50000.0);
		e[1] = new Employee(2, "Akash", 55000.0);
		e[2] = new Employee(3, "Suyash", 45000.0);
		e[3] = new Employee(4, "Prasann", 60000.0);
		e[4] = new Employee(5, "Akhilesh", 40000.0);
		int choice;
		do {
			System.out.println("Press 0 to EXIT");
			System.out.println("1. Search employee by employee id");
			System.out.println("2. Search employee by employee name");
			System.out.println("3. Search employee by employee salary");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter employee id to find details:");
				int id = sc.nextInt();
				int a=findByEmpid(e, id);
				if (a==-1) {
					System.out.println("Employee not found.");
				}
				break;
			case 2:
				System.out.println("Enter employee name to find details:");
				String name = sc.next();
				int b=findByEmpName(e, name);
				if (b==-1) {
					System.out.println("Employee not found.");
				}
				break;
			case 3:
				System.out.println("Enter employee salary to find details:");
				double salary = sc.nextDouble();
				int c=findBySalary(e, salary);
				if (c==-1) {
					System.out.println("Employee not found.");
				}
				break;
			default:
				break;
			}

		} while (choice != 0);
		System.out.println("Thank you..!");
	}
}
