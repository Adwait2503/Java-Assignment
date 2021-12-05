package com.te.set.assignment;

import java.util.HashSet;

public class Cricket {
	public static void main(String[] args) {
		HashSet<Team> set1 = new HashSet();
		set1.add(new Team(1, "Shoaib Aktar", 20));
		set1.add(new Team(2, "Matthew Hayden", 29));
		set1.add(new Team(3, "Shaun Pollock", 30));
		set1.add(new Team(4, "Jonty Rhodes", 40));
		set1.add(new Team(5, "Andrew Symonds", 45));
		set1.add(new Team(6, "Graeme Swann", 35));
		set1.add(new Team(7, "Curtly Ambrose",56));
		set1.add(new Team(8, "Carl Hooper", 60));
		set1.add(new Team(9, "Moin Khan", 68));
		set1.add(new Team(10, "Lance Klusener", 40));
		set1.add(new Team(11, "Sachin Tendulkar", 39));
		for (Team t : set1) {
			System.out.println(t);
		}
		set1.add(new Team(12, "Shane Warne", 20));
		for (Team t : set1) {
			System.out.println(t);
		}
	}
}
