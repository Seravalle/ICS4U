package seravalle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class FileTest {

	public static void main(String[] args) {
		saveFile();
	}

	public static void saveFile() {
		File f = new File("test.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(f);
			PrintStream fps = new PrintStream(fileOutputStream);

			fps.print("this is a test");

			try {
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
	//public static void loadStudent() throws IOException {

	//	try {
			//BufferedReader fbr = new BufferedReader(new FileReader(file));
			
			//String[] divideFile = line.split(",");
		//	for (String line; (line = fbr.readLine()) != null;) {
//				System.out.println(line);
				
	//		}

		//	fbr.close();

	//	} catch (FileNotFoundException e) {
			
	//		e.printStackTrace();
		//}
	//
/*	public static void loadStudent() throws IOException, InvalidInputException {
 
		ArrayList<Student> tempStudentInfo = null;
		try {
//			BufferedReader fbr = new BufferedReader(new FileReader(file));

			String line = fbr.readLine();
			String[] divideFile = line.split(",");
			tempStudentInfo = new ArrayList<Student>();
			for (int i = 0; i < studRecs.size() - 1; i++) {
				studRecs.remove(i);
			}
			for (int i = 0; i < Integer.parseInt(divideFile[0]); i++) {
				String[] line2 = fbr.readLine().split(",");
				tempStudentInfo.add(
						new Student(line2[0], line2[1], line2[8], line2[4], line2[7], line2[6], line2[5], line2[3]));

				tempStudentInfo.get(i).setStudentNumber(Long.parseLong(line2[2]));

			}

			fbr.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		studRecs = tempStudentInfo;
*/
}
