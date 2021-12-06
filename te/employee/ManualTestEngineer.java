package com.te.employee;

public class ManualTestEngineer extends Tester {
	private String designation;

	ManualTestEngineer(String ename, String designation, double sal) {
		super(ename, designation, sal);
	}

	public static int mcount = 0;

	public void test() {
		System.out.println("Do Manual testing");

	}

	public void experience() {
		System.out.println("Experience on manual testing");

	}

	{
		mcount++;
	}

}