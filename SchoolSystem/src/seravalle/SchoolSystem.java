package seravalle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * School Database program that lets user input students and store them 
 * SchoolSystem.java
 * @author Adam Seravalle
 * October 24 2016
 */
public class SchoolSystem {
	static Scanner scan = new Scanner(System.in);

	static ArrayList<Student> studRecs = new ArrayList<Student>();
	public static File file = new File("students.txt");
	
	public static void main(String[] args) throws InterruptedException {
		
		String fliename = "students.txt";
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
				System.out.println(" 6. Open Flie");
				System.out.println(" 7. Sort Students");

				System.out.println(" 10. Quit ");
				num = scan.nextInt();
				scan.nextLine();

				if (num >= 11 || num <= 0) {
					System.out.println(" Please enter a number between 1-10 ");
					Thread.sleep(1000);
				}

				else if (num == 1) {
					studRecs.add(new Student());
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
					System.out.println(" Which student would you like to delete, 1-" + studRecs.size() + "?");
					delete = Integer.parseInt(scan.nextLine()) - 1;
					deleteStudent(delete);
				}

				else if (num == 10) {
					quit();
				}
			} catch (InputMismatchException m) {

				System.out.println(" Please enter a number between 1-10 ");
				Thread.sleep(1000);

				scan.nextLine();
			}
		}
	}

	public static void newStudent() throws InterruptedException {

		System.out.println("Please enter your first name ");
		studRecs.get(studRecs.size() - 1).setFirstName(scan.nextLine());
		System.out.println("Please enter your last name ");
		studRecs.get(studRecs.size() - 1).setLastName(scan.nextLine());
		System.out.println("Please enter your street address ");
		studRecs.get(studRecs.size() - 1).setStreetAddress(scan.nextLine());
		System.out.println("Please enter your city ");
		studRecs.get(studRecs.size() - 1).setCity(scan.nextLine());
		System.out.println("Please enter your province ");
		studRecs.get(studRecs.size() - 1).setProvince(scan.nextLine());
		System.out.println("Please enter your postal code (X1X 1X1) ");
		studRecs.get(studRecs.size() - 1).setPostalCode(scan.nextLine());
		System.out.println("Please enter your phone number (111-111-1111) ");
		studRecs.get(studRecs.size() - 1).setPhoneNumber(scan.nextLine());
		System.out.println("Please enter your birthday ");
		studRecs.get(studRecs.size() - 1).setBirthday(scan.nextLine());

	}

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

	public static void printAllStudents() {
		for (int i = 0; i < studRecs.size(); i++) {
			printStudent(studRecs.get(i));
		}
	}

	public static void deleteStudent(int i) {
		studRecs.remove(i);
	}
public static void saveStudent() throws IOException{
	
	FileOutputStream fos = new FileOutputStream(file);
	PrintStream write = new PrintStream(fos);
	
	file.createNewFile();
	
	if (studRecs.size() > 0 ){
		write.println(studRecs.size()+ "," + studRecs.get(studRecs.size()-1).getStudentNumber());
	}
	
}
	
	public static void loadStudent(){
		
		
		
	}
	
	
	
	
	public static void quit() {

		System.exit(0);

	}

}
