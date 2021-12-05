package com.te.synchronisation.assignment;

public class Yashoda extends Thread {
	Printer printer;

	public Yashoda(Printer printer) {
		super();
		this.printer = printer;
	}

	@Override
	synchronized public void run() {
		for (int i = 1; i <= 2; i++) {
			System.out.println(i);
		}
		System.out.println("Idiot Your prints are done");
	}

}
