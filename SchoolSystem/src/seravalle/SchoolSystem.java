package seravalle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * School Database program that lets user input students and store them
 * SchoolSystem.java
 * 
 * @author Adam Seravalle
 * @version October 24 2016
 */
public class SchoolSystem {

	static Scanner scan = new Scanner(System.in);// scanner

	static ArrayList<Student> studRecs = new ArrayList<Student>();// object
																	// array
	public static File file = new File("src/students.txt");// creates file

	/**
	 * main method that prints the display can calls the methods
	 * 
	 * @param args
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static void main(String[] args) throws InterruptedException, IOException {

		String fliename = "src/students.txt";
		int num = 0;
		boolean choice = false;
		while (choice == false) {
			try {

				System.out.println(" Please chose one of the folling choices by entering the number ");
				System.out.println(" 1. Enter a new student ");
				System.out.println(" 2. Print student");
				System.out.println(" 3. Print all students");
				System.out.println(" 4. Delete Student");
				System.out.println(" 5. Save");
				System.out.println(" 6. Open flie");
				System.out.println(" 7. Sort students");
				System.out.println(" 8. Find student by student number");
				System.out.println(" 10. Quit ");
				num = scan.nextInt();
				scan.nextLine();

				if (num >= 11 || num <= 0) {
					System.out.println(" Please enter a number between 1-10 ");
					Thread.sleep(1000);
				}

				else if (num == 1) {

					newStudent();

				} else if (num == 2) {
					int stuPick = 0;

					System.out.println(" Which student would you like to print? 1-" + studRecs.size());
					stuPick = scan.nextInt();
					printStudent(studRecs.get(stuPick - 1));
				} else if (num == 3) {
					printAllStudents();
				} else if (num == 4) {
					int delete;
					if (studRecs.size() > 1) {
						System.out.println(" Which student would you like to delete, 1-" + studRecs.size() + "?");
						delete = Integer.parseInt(scan.nextLine()) - 1;
						deleteStudent(delete);
					} else {
						System.out.println(" There are no students to delete");
					}

				} else if (num == 5) {
					System.out.println("saving");
					saveStudent();
				} else if (num == 6) {
					System.out.println("loading");
					loadStudent();

				} else if (num == 7) {
					System.out.println("sorting");
					sortStudents();
				}
				// else if (num == 8) {
				// System.out.println(" Please enter the studets's ID number");
				// long userInput = scan.nextLong();
				// findStudent(userInput);
				// }

				else if (num == 10) {
					saveStudent();
					quit();
				}
			} catch (InputMismatchException m) {

				System.out.println(" Please enter a number between 1-10 ");
				Thread.sleep(1000);

				scan.nextLine();
			}
		}

	}

	/**
	 * creates a new student
	 */
	public static void newStudent() {
		Scanner scan = new Scanner(System.in);
		String input = "";
		studRecs.trimToSize();
		studRecs.add(new Student());
		
			
				try {
					System.out.println("Please enter your first name ");
					studRecs.get(studRecs.size() - 1).setFirstName(scan.nextLine());
					System.out.println("Please enter your last name ");
					studRecs.get(studRecs.size() - 1).setLastName(scan.nextLine());
					System.out.println("Please enter your street address ");
					try {
						studRecs.get(studRecs.size() - 1).setStreetAddress(scan.nextLine());
					} catch (InvalidInputException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("Please enter your city ");
					studRecs.get(studRecs.size() - 1).setCity(scan.nextLine());
					System.out.println("Please enter your province ");
					studRecs.get(studRecs.size() - 1).setProvince(scan.nextLine());
				
				} catch (NullPointerException e) {
					System.out.println("Invalid input");
				}
			
		
		while (true) {
			System.out.println("Please enter your postal code (X1X 1X1) ");
			input = scan.nextLine();
			if (studRecs.get(studRecs.size() - 1).checkPostalCode(input)) {

				try {
					studRecs.get(studRecs.size() - 1).setPostalCode(input);
					break;
				} catch (InvalidInputException e) {

				}

			} else {

				System.out.println(" Invalid postal code");

			}
		}
		while (true) {
			System.out.println("Please enter your phone number (111-111-1111) ");

			input = scan.nextLine();
			if (studRecs.get(studRecs.size() - 1).checkPhoneNumber(input)) {
				try {
					studRecs.get(studRecs.size() - 1).setPhoneNumber(input);
					break;
				} catch (InvalidInputException e) {

					e.printStackTrace();
				}
			} else {
				System.out.println("Invalid phone number");
			}
		}
		while (true) {

			System.out.println("Please enter your birthday (MM/DD/YYYY)");
			input = scan.nextLine();
			if (studRecs.get(studRecs.size() - 1).checkBirthday(input)) {
				try {
					studRecs.get(studRecs.size() - 1).setBirthday(input);
					break;
				} catch (InvalidInputException e) {

					e.printStackTrace();
				}
			} else {
				System.out.println("Invalid birthday");
			}
		}
	}

	/**
	 * prints the selected students information
	 * 
	 * @param student
	 */
	public static void printStudent(Student student) {

		System.out.println(" First Name: " + student.getFirstName());
		System.out.println(" Last Name: " + student.getLastName());
		System.out.println(" Street Address: " + student.getStreetAddress());
		System.out.println(" City: " + student.getCity());
		System.out.println(" Province: " + student.getProvince());
		System.out.println(" Postal Code: " + student.getPostalCode());
		System.out.println(" Phone Number: " + student.getPhoneNumber());
		System.out.println(" Birthday: " + student.getBirthday());
		System.out.println(" Student ID: " + student.getStudentNumber());

	}

	/**
	 * prints all the students in the array
	 */
	public static void printAllStudents() {
		for (int i = 0; i < studRecs.size(); i++) {
			printStudent(studRecs.get(i));
			if (studRecs.size() > 1) {
				System.out.println("___________________________________");
			}
		}
	}

	/**
	 * removes a student
	 * 
	 * @param i
	 */
	public static void deleteStudent(int i) {
		studRecs.remove(i);
	}

	/**
	 * creates a file and saves the students to it
	 * 
	 * @throws IOException
	 */
	public static void saveStudent() throws IOException {

		FileOutputStream fos = new FileOutputStream(file);
		PrintStream write = new PrintStream(fos);

		if (!file.exists()) {
			file.createNewFile();
		}

		if (studRecs.size() > 0) {
			write.println(studRecs.size() + "," + studRecs.get(studRecs.size() - 1).getStudentNumber());
			for (int i = 0; i < studRecs.size(); i++) {
				write.println(studRecs.get(i).toString());
			}
		}

	}

	/**
	 * loads the file that the students were saved in
	 * 
	 * @throws IOException
	 */
	public static void loadStudent() throws IOException {
		ArrayList<Student> fileInfo = null;
		try {
			BufferedReader fbr = new BufferedReader(new FileReader(file));

			for (String line; (line = fbr.readLine()) != null;) {
				System.out.println(line);

			}

			fbr.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

	/**
	 * sorts the students by last name
	 */
	public static void sortStudents() {
		Collections.sort(studRecs);
	}

	/**
	 * searches for a student by student number
	 * 
	 * @return
	 */
	public static Student findStudent(long studentNum) {

		for (int i = 0; i < studRecs.size(); i++) {
			if (studRecs.get(i).getStudentNumber() == studentNum) {
				return studRecs.get(i);
			}
		}
		return null;
	}

	/**
	 * quits the program
	 */
	public static void quit() {

		System.exit(0);

	}

}
