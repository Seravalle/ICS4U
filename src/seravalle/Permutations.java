
package seravalle;

import java.util.Scanner;

/**
 * Permutations.java
 * 
 * @author Adam Seravalle
 * gets two numbers from the user and then gets the permutation 
 *  September 16 2016
 */

public class Permutations {
	/** 
	 * main method gets input from user and displays results 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);// scanner

		int n = scan.nextInt(), r = scan.nextInt();

		System.out.println(permut(n, r));

	}

	/**
	 * takes the factorial of the two numbers and divides them by each other to get the permute
	 * @param x
	 * @param y
	 * @return
	 */
	public static int permut(int x, int y) {
		return factorial(x) / factorial(y);
	}

	/**
	 * gets the factorial for the two numbers 
	 * @param a
	 * @return
	 */
	public static int factorial(int a) {
		if (a == 0) {
			return 1;
		} else
			return a * factorial(a - 1);

	}
}