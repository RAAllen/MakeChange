package com.skilldistillery.projects.makechange;

import java.util.Scanner;

public class MakeChange {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		double price = getPrice();
		double money = getMoney();
		if (price > money) {
			System.out.println("Sorry you do not have enough money to pay for this.");
		} else if (price == money) {
			System.out.println("You have given me exact change. Enjoy your item and have a nice day.");
		} else if (price < money) {
			makeChange(price, money);
		} else {
			System.err.println("Hmmm....something appears to have gone wrong...");
		}
	}

	public static double getPrice() {
		double price = 0;
		System.out.println("Hello. Please enter the price of the item you would like to purchase.");
		price = scanner.nextDouble();
		return price;
	}

	public static double getMoney() {
		double money = 0;
		System.out.println("How much money will you be using to pay for this?");
		money = scanner.nextDouble();
		return money;
	}

	public static void makeChange(double price, double money) {
		// print out the total change due without delving into bills and coins, remembering to display it as a positive, this will make it easier to check and test later
		System.out.println("Your total change will be: $" + ((price - money) * -1));
		
		// first we should make multiply by 100 and everything an integer to make math
		// easier and more precise.
		int wholePrice = (int) (price * 100);
		int wholeMoney = (int) (money * 100);
		int change = wholeMoney - wholePrice;
		
		// get the number of twenties, tens, etc by dividing by 2000, 1000, etc
		// set the change to now equal the remainder of change when divided by the twenties value
		int twentiesValue = (change / 2000);
		change = (change % 2000);
		int tensValue = (change / 1000);
		change = (change % 1000);
		int fivesValue = (change / 500);
		change = (change % 500);
		int onesValue = (change / 100);
		change = (change % 100);
		int quartersValue = (change / 25);
		change = (change % 25);
		int dimesValue = (change / 10);
		change = (change % 10);
		int nickelsValue = (change / 5);
		change = (change % 5);
		int penniesValue = (change / 1);
		change = (change % 1);
		
		// if statements to control whether change amounts display
		if (twentiesValue != 0) {
			System.out.println("We owe you " + twentiesValue + " twenties.");
		}
		if (tensValue != 0) {
			System.out.println("We owe you " + tensValue + " tens.");
		}
		if (fivesValue != 0) {
			System.out.println("We owe you " + fivesValue + " fives.");			
		}
		if (onesValue != 0) {
			System.out.println("We owe you " + onesValue + " ones.");			
		}
		if (quartersValue != 0) {
			System.out.println("We owe you " + quartersValue + " quarters.");			
		}
		if (dimesValue != 0) {
			System.out.println("We owe you " + dimesValue + " dimes.");			
		}
		if (nickelsValue != 0) {
			System.out.println("We owe you " + nickelsValue + " nickels.");		
		}
		if (penniesValue != 0) {
			System.out.println("We owe you " + penniesValue + " pennies.");			
		}
	}

}
