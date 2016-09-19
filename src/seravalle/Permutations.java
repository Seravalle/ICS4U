
package seravalle;

import java.util.Scanner;
/**
 * Permutations.java 
 * @author Adam Seravalle
 * 
 * September 16 2016 
 */

public class Permutations {
/**
 * main method 
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);// scanner 
		
		int n = scan.nextInt(), r = scan.nextInt();
		
		System.out.println(permut (n , r));
		
	}
	
	public static int permut (int x, int y)
	{
		return factorial(x)/factorial(y);
	}

	public static int factorial (int a)
	{
		if (a == 0)
		{
			return 1;
		}
		else
		 return a * factorial(a - 1);
	
	}
}