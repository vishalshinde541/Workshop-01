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
		int daysToPlay = 20;
		int totalAmountAtLastDay = 0;
		
		
		for (int j = 0; j < daysToPlay; j++) {
			int temp =everyDayStake;
			while (temp > maxLoose && temp < maxWin) {

				isWinOrLoose();

				if (isWinOrLoose() == 0) {
					temp += betOnEveryGame;	
				} else {
					temp -= betOnEveryGame;
				}
			}
			System.out.println("After resign for day "+ j +" Stake is : " + temp);
			totalAmountAtLastDay +=temp;
		}
		
		if ((daysToPlay*everyDayStake) > totalAmountAtLastDay) {
			System.out.println("Total amount lost is : " + ((daysToPlay*everyDayStake) - totalAmountAtLastDay));
		}else {
			System.out.println("Total amount won is :" + (totalAmountAtLastDay - (daysToPlay*everyDayStake)));
		}
	}

}
