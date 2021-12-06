package com.te.employee;

public abstract class Developers extends Employee {
	Developers(String ename, String designation, double sal) {
		super(ename, designation, sal);

	}

	public abstract void code();

	public abstract void project();

	public abstract void experience();

}
