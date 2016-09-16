package seravalle;

import java.util.Scanner;
/**
 * StarRecursion.java 
 * @author Adam Seravalle 
 * gets a integer from the user and prints stars for 2 to the power of that number 
 * September 15 2016
 */
public class StarRecursion {
/**
 * main method 
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // scanner  
		int input = scan.nextInt();
		starString(input);// calls the method 
	}
/**
 * does 2 to the power of the user's number and prints the stars for the answers 
 * @param x
 *  
 */
	public static void starString (int x)
	{
		if (x == 0)
			System.out.println("*");
		else
		{
			starString (x-1);
			
			for (int i = 0; i < Math.pow(2 , x); i ++)
				System.out.print("*");
			
			System.out.println(""); 
		}
	}
}