package com.te.employee;

public abstract class Tester extends Employee {

	static int count;
	{
		System.out.println("Number of Test Engeeners :" + count++);
	}

	abstract public void work();
}
