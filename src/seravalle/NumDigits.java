package seravalle;

import java.util.Scanner;

/* Adam Seravalle
 * NumDigits 
 * gets number from user and tells user how many digits it has
 * September 13 2016
 */
public class NumDigits {
	public static int counter = 0;// Counter to count the number of digits in
									// the input

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);// Scanner
		int num = scan.nextInt();

		System.out.println(NumDigit(num));// Prints what the method returns
	}

	/**
	 * checks how many digits are in the number that is inputed
	 * 
	 * @param x
	 * @return counter
	 */
	public static int NumDigit(int x) {
		if (x == 0) {
			return 1;
		} else {
			counter++; // Counts the number of digits in the number
			NumDigit(x / 10);
		}
		return counter; // Return the to main method
	}

}
