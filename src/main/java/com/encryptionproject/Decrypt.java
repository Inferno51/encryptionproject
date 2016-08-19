package com.encryptionproject;

public class Decrypt {
	protected static String decryptor(String encrypted, int key){
		int stringLenght = encrypted.length();
		String decrypted = "";
		int newCharValue;
		char newChar;
		
		for (int character = 0; character < stringLenght; character++){
			char currentChar = encrypted.charAt(character);
			newCharValue = (int)currentChar - key;
			newChar = (char)newCharValue;
			decrypted += Character.toString(newChar);
		}
		
		return decrypted;
	} // Method
} // Class
