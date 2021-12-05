package com.te.synchronisation.assignment;

public class Rakshit extends Thread {

	Printer printer;

	public Rakshit(Printer printer) {
		super();
		this.printer = printer;
	}

	@Override
	synchronized public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println("Raksit Your prints are done");
	}
}