package com.te.thread.assignment;

public class AlphabeticalThread extends Thread{
@Override
public void run() {
	for(char ch='a';ch<='j';ch++) {
		System.out.println(ch);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
