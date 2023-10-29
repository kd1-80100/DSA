package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

// sorting employees by their salary using Bubble sort.

public class Test {
	public static void employeeSort(Employee e[], int n) {
		for (int i = 1; i < e.length; i++) {
			for (int j = 0; j < e.length - 1; j++) {
				if (e[j].getSal() > e[j + 1].getSal()) {
					Employee temp = e[j];
					e[j] = e[j + 1];
					e[j + 1] = temp;
				}
			}
		}
		System.out.println("After sort:" + Arrays.toString(e));
	}

	public static void main(String[] args) {
		Employee e[] = new Employee[5];
		Scanner sc = new Scanner(System.in);
		e[0] = new Employee(1, "Pavan", 50000.0);
		e[1] = new Employee(2, "Akash", 55000.0);
		e[2] = new Employee(3, "Suyash", 45000.0);
		e[3] = new Employee(4, "Prasann", 60000.0);
		e[4] = new Employee(5, "Akhilesh", 40000.0);
		System.out.println("Before sort:" + Arrays.toString(e));
		employeeSort(e, e.length);
	}

}
