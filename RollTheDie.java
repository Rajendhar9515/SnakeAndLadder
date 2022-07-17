package com.bridgelabz.java.learningproblem;

public class RollTheDie {

	public static void main(String[] args) {
		int StartPosition = 0;
		int die = (int) (Math.random() * 10) % 5 + 1;
		System.out.println("Start The Snake and Ladeder Game");
		System.out.println("Rolling of the Die Number: " + die);

	}

}
