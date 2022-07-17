package com.bridgelabz.java.learningproblem;

public class CheckOption {

	public static void main(String[] args) {
		int StartPosition = 0;
		int NoPlay = 0;
		int IfLadder = 1;
		int IfSnake = 2;
		int PlayerPosition = 0;

		System.out.println("Welcome to Snake and ladder game");
		int dice = (int) (Math.random() * 10) % 5 + 1;
		int option = (int) (Math.random() * 10) % 3;

		if (option == IfLadder) {
			System.out.println("Dice Number is " + dice);
			System.out.println("Player Position is Ladder");
			PlayerPosition += dice;

		} else if (option == IfSnake) {
			System.out.println("Dice Number is " + dice);
			System.out.println("Player Position is Snake");
			PlayerPosition -= dice;

		} else {
			System.out.println("Player Is N0 Play");
		}

	}

}
