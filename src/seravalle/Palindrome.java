package seravalle;

import java.util.Scanner;

/* Adam Seravalle
 * Palindrome.java
 * user inputs a word and that word is checked to see if it is the same word spelled backwards 
 * September 16 2016
 */
public class Palindrome {
	/**
	 * main method gets user input and displays results
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please input a word .");

		String reverse = scan.nextLine();// gets user input
		String backwards;
		backwards = isReverse(reverse);

		if (backwards.equalsIgnoreCase(reverse))

		{
			System.out.println("This word is a palindrome.");
		} else {
			System.out.println("This is not a palindrome .");
		}

	}

	/**
	 * reverses the inputed word, so that it can be compared to itself and see if it is the same
	 * if it is the same
	 * 
	 * @param x
	 * @return
	 */

	public static String isReverse(String a) {
		char backwards = a.charAt(a.length() - 1);
		if (a.length() == 1)
			return Character.toString(backwards);

		return backwards + isReverse(a.substring(0, a.length() - 1));
	}

}
