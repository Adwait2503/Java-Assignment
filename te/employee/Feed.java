package com.te.employee;

public class Feed {

	public static void main(String[] args) {
		Extract e = new Extract();
		Intern i = new Intern("Yash","Intern" , 15000);
		SeniorDeveloper sd = new SeniorDeveloper("Romen","Senior Developer" , 25000);
		ManualTestEngineer m = new ManualTestEngineer("Akshay", "Manual Test Engineer", 30000);
		AutomationTestEngineer a = new AutomationTestEngineer("Aayush", "Automation Engineer", 40000);
		Hr h = new Hr("Siddheshvar", "H.R", 45000);
		e.get(i);
		System.out.println("____________________________________");
		e.get(m);
		System.out.println("_____________________________________");
		e.get(sd);
		System.out.println("_____________________________________");
		e.get(a);
		System.out.println("_____________________________________");
		e.get(h);
		System.out.println("______________________________________");
		Employee ee = new Employee();

	}

}