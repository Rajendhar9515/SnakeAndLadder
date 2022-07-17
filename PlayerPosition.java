package com.bridgelabz.java.learningproblem;

public class PlayerPosition {

	public static void main(String[] args) {
		int StartPosition = 0;
		int NoPlaye = 0;
		int IfLadder = 1;
		int IfSnake = 2;
		int CurrentPosition = 0;

		System.out.println("Welcome to Snake and ladder game");
		while (CurrentPosition < 100) {
			int dice = (int) (Math.random() * 10) % 6 + 1;
			int option = (int) (Math.random() * 10) % 3;

			if (option == IfLadder) {
				System.out.println("player position is Ladder");
				CurrentPosition += dice;

			} else if (option == IfSnake) {
				System.out.println("player position is Snake");
				CurrentPosition -= dice;

			} else {
				System.out.println("Player Is No Play");

			}
			if (CurrentPosition < StartPosition) {
				CurrentPosition = StartPosition;
			}

			System.out.println("currentposition: " + CurrentPosition);
		}

	}

}
