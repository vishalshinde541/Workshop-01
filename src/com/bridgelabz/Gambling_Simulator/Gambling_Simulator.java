package com.bridgelabz.Gambling_Simulator;

import java.util.Random;

public class Gambling_Simulator {
	
	public static int isWinOrLoose() {
		int n1 = (int) (Math.random()*2);
		return n1;
	}
	
	public static void main(String[] args) {
		System.out.println("----Welcome to Gambling Simulator----");
		
		int everyDayStake = 100;
		int betOnEveryGame = 1;
		
		isWinOrLoose();
		
		if (isWinOrLoose() == 0) {
			System.out.println("Gambler Win the bet of $1");
			
		}else {
			System.out.println("Gambler Lost the bet of $1");
			
		}
	}

}
