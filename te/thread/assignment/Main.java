package com.te.thread.assignment;

public class Main {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		NumberThread numberThread = new NumberThread();
		AlphabeticalThread alphabeticalThread = new AlphabeticalThread();
		alphabeticalThread.start();
		Thread.currentThread().sleep(500);
		//System.out.println(Thread.currentThread().getName());
		numberThread.start();
		
	}

}
