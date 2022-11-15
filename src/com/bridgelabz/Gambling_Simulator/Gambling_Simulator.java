package com.bridgelabz.Gambling_Simulator;

import java.util.Random;

public class Gambling_Simulator {

	public static int isWinOrLoose() {
		int n1 = (int) (Math.random() * 2);
		return n1;
	}

	public static void main(String[] args) {
		System.out.println("----Welcome to Gambling Simulator----");

		int everyDayStake = 100;
		int betOnEveryGame = 1;
		int maxWin = (int) (everyDayStake * 1.5);
		int maxLoose = (int) (everyDayStake * 0.5);

		while (everyDayStake > maxLoose && everyDayStake < maxWin) {

			isWinOrLoose();

			if (isWinOrLoose() == 0) {
				everyDayStake += betOnEveryGame;
				System.out.println("Gambler Win the bet of $1");

			} else {
				everyDayStake -= betOnEveryGame;
				System.out.println("Gambler Lost the bet of $1");

			}
		}
		
		System.out.println("After resign todays Stake is : " + everyDayStake);

	}

}
