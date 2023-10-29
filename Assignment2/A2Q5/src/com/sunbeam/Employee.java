package com.sunbeam;

public class Employee {
	private String ename;
	private int eid;
	private double sal;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, double sal) {
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee: ename=" + ename + ", eid=" + eid + ", sal=" + sal ;
	}
}
