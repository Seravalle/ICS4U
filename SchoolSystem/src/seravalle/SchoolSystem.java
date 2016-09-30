package seravalle;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SchoolSystem {
	static Scanner scan = new Scanner(System.in);
	static Student student1 = new Student();
	ArrayList<Student> studRecs = new ArrayList<Student>();

	public static void main(String[] args) throws InterruptedException {
		int num = 0;
		boolean choice = false;
		while (choice == false) {
			try {

				System.out.println(" Please chose one of the folling choices by entering the number ");
				System.out.println(" 1. Enter a new student ");
				System.out.println(" 2. Print student");
				System.out.println(" 3. Print all students");

				System.out.println(" 10. Quit ");
				num = scan.nextInt();
				scan.nextLine();

				if (num >= 11 || num <= 0) {
					System.out.println(" Please enter a number between 1-10 ");
					Thread.sleep(500);
				}

				else if (num == 1) {

					newStudent();

				} else if (num == 2) {
					printStudent(student1);
				} else if (num == 3) {
					printAllStudents();
				}

				else if (num == 10) {
					quit();
				}

			} catch (InputMismatchException m) {// Infinite loop needs to be fixed
				System.out.println(" Please enter a number between 1-10 ");
				
				
			}
		}
	}

	public static void newStudent() throws InterruptedException {

		System.out.println("Please enter your first name ");
		student1.setFirstName(scan.nextLine());
		System.out.println("Please enter your last name ");
		student1.setLastName(scan.nextLine());
		System.out.println("Please enter your street address ");
		student1.setStreetAddress(scan.nextLine());
		System.out.println("Please enter your city ");
		student1.setCity(scan.nextLine());
		System.out.println("Please enter your province ");
		student1.setProvince(scan.nextLine());
		System.out.println("Please enter your postal code ");
		student1.setPostalCode(scan.nextLine());
		System.out.println("Please enter your phone number  ");
		student1.setPostalCode(scan.nextLine());
		System.out.println("Please enter your birthday ");
		student1.setBirthday(scan.nextLine());

	}

	public static void printStudent(Student student) {

		System.out.println(" First Name: " + student1.getFirstName());
		System.out.println(" Last Name: " + student1.getLastName());
		System.out.println(" Street Address: " + student1.getStreetAddress());
		System.out.println(" City: " + student1.getCity());
		System.out.println(" Province: " + student1.getProvince());
		System.out.println(" Postal Code: " + student1.getPostalCode());
		System.out.println(" Phone Number: " + student1.getPhoneNumber());
		System.out.println(" Birthday: " + student1.getBirthday());

	}

	public static void printAllStudents() {

	}

	public static void quit() {

		System.exit(0);

	}

}
