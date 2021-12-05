package com.te.synchronisation.assignment;

public class Shop {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Printer printer = new Printer(0);
		Rakshit rakshit = new Rakshit(printer);
		Yashoda yashoda = new Yashoda(printer);
		rakshit.start();
		yashoda.start();
		rakshit.join();
		yashoda.join();
		System.out.println("Executed");
		printer.printed();
	}

}
