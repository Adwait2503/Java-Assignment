package com.te.employee;

public class AutomationTestEngineer extends Tester {
	private String designation;

	AutomationTestEngineer(String ename, String designation, double sal) {
		super(ename, designation, sal);
	}

	public void test() {
		System.out.println("Do Automation in selenium");

	}

	public void experience() {
		System.out.println("Experience on manual testing as well as Automation");

	}

}
