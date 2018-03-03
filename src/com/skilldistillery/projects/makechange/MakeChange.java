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
		} else if ( price == money) {
			System.out.println("You have given me exact change.");
		} else {
			makeChange();
		}	
	}
	
	public static double getPrice() {
		double price = 0;
		System.out.println("Hello. Please enter the price of the item you would like to purchase.");
		price = scanner.nextDouble();
//		System.out.println(price); testing to make sure we are capturing price
		return price;
	}
	
	public static double getMoney() {
		double money = 0;
		System.out.println("How much money will you be using to pay for this?");		
		money = scanner.nextDouble();
//		System.out.println(money); testing to make sure we are capturing money
		return money;
	}
	
	public static void makeChange() {
		
	}
	
}
