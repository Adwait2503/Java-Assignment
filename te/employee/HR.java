package com.te.employee;

public abstract class HR extends Employee {

	static int count;
	{
		System.out.println("Number of HR :" + count++);
	}

	abstract public void work();
}
