package com.encryptionproject;

import java.util.Scanner;

public class Encrypt {
	
	public static void main(String[] args) {
		userInputMethod();
	}

	public static void userInputMethod() {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String userInput = null;
		int userKey = 0;
		
		System.out.println("Welcome to the Encryption App!");
		System.out.println("Please enter a word to encrypt:\n");
		userInput = sc.nextLine();
		
		System.out.println("Please enter a number key for your encryption:");
		userKey = sc2.nextInt();
		
		System.out.println(encryptor(userInput, userKey));
		
		System.out.println("Do you want to decrypt a word? Enter yes or no:");
		userInput = sc.nextLine();
		
		if (userInput.equalsIgnoreCase("yes")){
			System.out.println("Please enter a word to decrypt:\n");
			userInput = sc.nextLine();
			
			System.out.println("Enter the key you used to encrypt your word: Enter a number between 1 and 5.");
			userKey = sc2.nextInt();
			
			System.out.println(Decrypt.decryptor(userInput, userKey));
		} else if (userInput.equalsIgnoreCase("no")) {
			System.exit(0);
		}
		
		sc.close();
		sc2.close();
	}
	
	protected static String encryptor(String encryptThis, int key) {
		int stringLength = encryptThis.length();
		String encrypted = "";
		int newCharValue;
		char newChar;

		for (int character = 0; character < stringLength; character++) {
			char currentChar = encryptThis.charAt(character);
			newCharValue = (int) currentChar + key;
			newChar = (char) newCharValue;
			encrypted += Character.toString(newChar);
		}//for loop iterating through characters in string
		return encrypted;
	}// method
}
