package com.bridgelabz.Gambling_Simulator;

import java.util.Random;

public class Gambling_Simulator {

	static int everyDayStake = 100;
	static int betOnEveryGame = 1;
	static int maxWin = (int) (everyDayStake * 1.5);
	static int maxLoose = (int) (everyDayStake * 0.5);
	static int daysOfEachMonth = 30;

	public static int isWinOrLoose() {
		int n1 = (int) (Math.random() * 2);
		return n1;
	}

	public static boolean isGambling() {

		int totalAmountAtLastDay = 0;
		int winDays = 0;
		int looseDays = 0;

		for (int j = 1; j <= daysOfEachMonth; j++) {
			int temp = everyDayStake;
			while (temp > maxLoose && temp < maxWin) {

				isWinOrLoose();

				if (isWinOrLoose() == 0) {
					temp += betOnEveryGame;
				} else {
					temp -= betOnEveryGame;
				}
			}

			if (temp == maxWin) {
//				System.out.println("For day " + j + " Gamblor win : " + temp);
				winDays++;
			} else {
//				System.out.println("For day " + j + " Gamblor loose : " + temp);
				looseDays++;
			}

			totalAmountAtLastDay += temp;
		}
		System.out.println();

		System.out.println("No of Luckiest days of month is : " + winDays);
		System.out.println("No of Unluckiest days of month is : " + looseDays);

		System.out.println();

		if ((daysOfEachMonth * everyDayStake) > totalAmountAtLastDay) {
			System.out.println(
					"Total amount lost after month is : " + ((daysOfEachMonth * everyDayStake) - totalAmountAtLastDay));
			return false;
		} else {
			System.out.println(
					"Total amount won after month is :" + (totalAmountAtLastDay - (daysOfEachMonth * everyDayStake)));
			return true;
		}

	}

	public static void main(String[] args) {
		System.out.println("----Welcome to Gambling Simulator----");

		if (isGambling() == true) {
			System.out.println();
			System.out.println("Won in last month so Playing for second month");
			isGambling();
		}else {
			System.out.println("Stop playing due to lost in last month");
		}
	}

}
