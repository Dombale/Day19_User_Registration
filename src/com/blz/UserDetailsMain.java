package com.blz;

import java.util.Scanner;

public class UserDetailsMain extends UserDetails {
	static Scanner scanner = new Scanner(System.in);
	static String firstName, lastName, email, mobileNumber, password;

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Problem");
		// calling method
		userFirstName();
		userLastName();
		userEmail();
		userMobileNumber();
		userPassword();

	}

	// UC1 Ability to add first name
	public static void userFirstName() {
		System.out.println("Enter your First Name");
		firstName = scanner.next();
		UserDetails.isValidFirstName(firstName);
	}

	// UC2 Ability to add last name
	public static void userLastName() {
		System.out.println("Enter your Last Name");
		lastName = scanner.next();
		UserDetails.isValidFirstName(lastName);
	}

	// UC3 Ability to add email
	public static void userEmail() {
		System.out.println("Enter your Email");
		email = scanner.next();
		UserDetails.isValidEmail(email);
	}

	// UC4 Ability to add mobile number
	public static void userMobileNumber() {
		System.out.println("Enter your mobile Number");
		mobileNumber = scanner.nextLine();
		UserDetails.isValidMobileNumber(mobileNumber);
	}

	/*
	 * UC5 Ability to add Password and UC6 must have at least one upper case, UC7
	 * have one number, UC8 with add special character.
	 */
	public static void userPassword() {
		System.out.println("Enter your password");
		password = scanner.next();
		UserDetails.isValidPassword(password);
	}
}