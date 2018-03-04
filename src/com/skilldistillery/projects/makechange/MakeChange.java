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
		// the many sysouts of values are for testing to make sure things are flowing
		// through properly, once they pass a sysout, i am commenting them out
		// System.out.println(wholePrice);

		int wholeMoney = (int) (money * 100);
		// System.out.println(wholeMoney);

		// set the initial change amount to the money tendered minus the money owed
		int change = wholeMoney - wholePrice;
		// System.out.println(change);

		// get the number of twenties by dividing by 2000
		int twenties = (change / 2000);
//		System.out.println("20s:" + twenties);
		// set the change to now equal the remainder of change when divided by the twenties value
		change = (change % 2000);
//		System.out.println("change:" + change);

		int tens = (change / 1000);
//		System.out.println("10s:" + tens);
		change = (change % 1000);
//		System.out.println("change:" + change);

		int fives = (change / 500);
//		System.out.println("5s:" + fives);
		change = (change % 500);
//		System.out.println("change:" + change);

		int ones = (change / 100);
//		System.out.println("1s:" + ones);
		change = (change % 100);
//		System.out.println("change:" + change);

		int quarters = (change / 25);
//		System.out.println("25cs:" + quarters);
		change = (change % 25);
//		System.out.println("change:" + change);

		int dimes = (change / 10);
//		System.out.println("10cs:" + dimes);
		change = (change % 10);
//		System.out.println("change:" + change);

		int nickels = (change / 5);
//		System.out.println("5cs:" + nickels);
		change = (change % 5);
//		System.out.println("change:" + change);

		int pennies = (change / 1);
//		System.out.println("1cs:" + pennies);
		change = (change % 1);
//		System.out.println("change:" + pennies);
		
	}

}
