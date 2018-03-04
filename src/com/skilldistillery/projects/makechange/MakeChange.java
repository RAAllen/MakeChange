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
			System.out.println("You have given me exact change.");
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
		// System.out.println(price); testing to make sure we are capturing price
		return price;
	}

	public static double getMoney() {
		double money = 0;
		System.out.println("How much money will you be using to pay for this?");
		money = scanner.nextDouble();
		// System.out.println(money); testing to make sure we are capturing money
		return money;
	}

	public static void makeChange(double price, double money) {
		// first we should make multiply by 100 and everything an integer to make math
		// easier and more precise.
		int wholePrice = (int) (price * 100);
		int wholeMoney = (int) (money * 100);
		

		// set the initial change amount to the money tendered minus the money owed
		int change = wholeMoney - wholePrice;

		// get the number of twenties by dividing by 2000
		int twenties = (change / 2000);
		// set the change to now equal the remainder of change when divided by the twenties value
		change = (change % 2000);

		int tens = (change / 1000);
		change = (change % 1000);]

		int fives = (change / 500);
		change = (change % 500);

		int ones = (change / 100);
		change = (change % 100);

		int quarters = (change / 25);
		change = (change % 25);

		int dimes = (change / 10);
		change = (change % 10);

		int nickels = (change / 5);
		change = (change % 5);

		int pennies = (change / 1);
		change = (change % 1);
		
	}

}
