package seravalle;

import java.util.Scanner;
/**
 * TowerOfHanoi.java
 * @author Adam Seravalle
 *solves the tower of Hanoi puzzle for the different amounts of disks entered by the user 
 *September 19 2016
 */
public class TowerOfHanoi {
/**
 * main method for displaying and input 
 * @param args
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//scanner 
		
		System.out.println("How many disks are on the original tower?");// asks the user for the number of disks on the tower
		int	input = scan.nextInt();
		
		answer(input, "scr", "aux", "dst");// calls the method and displays the moves 

	}
/**
 * figures out where to move each disk and display it to the user 
 * @param x
 * @param a
 * @param b
 * @param c
 */
	public static void answer(int x, String a, String b, String c) {
		if (x == 0) {

		} else {
			answer(x - 1, a, c, b);
			System.out.println("Move from " + a + " to " + c);
			answer(x - 1, b, a, c);
		}

	}
}
