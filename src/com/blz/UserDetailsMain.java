package com.blz;

import java.util.Scanner;

public class UserDetailsMain extends UserDetails {
	static Scanner scanner = new Scanner(System.in);
	static String firstName;

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Problem");
		// calling method
		userFirstName();
	}

	// UC1 Ability to add first name
	public static void userFirstName() {
		System.out.println("Enter your First Name");
		firstName = scanner.next();
		UserDetails.isValidFirstName(firstName);
	}
}