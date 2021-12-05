package com.te.arraylist.assignment;

import java.util.ArrayList;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employees> list = new ArrayList<Employees>();
		list.add(new Employees(1, "Aayush", 1000000));
		list.add(new Employees(2, "Rakshit", 25400000));
		for (Employees e : list) {
			System.out.println(e);
		}
		list.add(new Employees(1, "Dracula", 2000000000));
		for (Employees e : list) {
			System.out.println(e);
		}
	}

}
