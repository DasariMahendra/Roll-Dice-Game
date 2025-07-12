package com;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Dice {

	Scanner sc = new Scanner(System.in);
	int score =0;
	Random random = new Random();
	public void startGame() {
		while(true) {
			try {
				System.out.println("Enter '9' to roll the dice");
				int start = sc.nextInt();
				sc.nextLine();
				if(start==9) {
					int diceValue = random.nextInt(1,7);
					System.out.println(diceValue);
					if(diceValue!=1) {
						score += diceValue;
						System.out.println("Your Score :" +score);
					}
					else {
						System.out.println("Dice value is '1'");
						System.out.println("-----Game Over-----");
						System.out.println("Your Score :" +score);
						break;
					}
				}
			}
			catch(InputMismatchException e){
				System.out.println("Enter only '9'");
				sc.nextLine();
			}
		}
	}
	
}
