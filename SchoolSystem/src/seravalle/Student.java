package seravalle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 
 * @author Adam Seravalle student database progrgam
 */
public class Student implements Comparable<Student> {

	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private Provinces province;
	private String postalCode;
	private String phoneNum;
	private String birthday;

	public static long studentIDMaker = 323000000;
	private long studentID = studentIDMaker;

	public Student() {

		setFirstName("");
		setLastName("");
		setStreetAddress("");
		setCity("");
		setProvince("");
		setPostalCode("");
		setPhoneNumber("");
		setBirthday("");
		setStudentNumber(studentID);
		studentID++;
	}

	public Student(String firstName) {
		setFirstName(firstName);
		setLastName("");
		setStreetAddress("");
		setCity("");
		setProvince("");
		setPostalCode("");
		setPhoneNumber("");
		setBirthday("");
		setStudentNumber(studentID);
		studentID++;

	}

	public Student(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress("");
		setCity("");
		setProvince("");
		setPostalCode("");
		setPhoneNumber("");
		setBirthday("");
		setStudentNumber(studentID);
		studentID++;
	}

	public Student(String firstName, String lastName, String streetAddress) {
		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress(streetAddress);
		setCity("");
		setProvince("");
		setPostalCode("");
		setPhoneNumber("");
		setBirthday("");
		setStudentNumber(studentID);
		studentID++;
	}

	public Student(String firstName, String lastName, String streetAddress, String city) {

		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress(streetAddress);
		setCity(city);
		setProvince("");
		setPostalCode("");
		setPhoneNumber("");
		setBirthday("");
		setStudentNumber(studentID);
		studentID++;
	}

	public Student(String firstName, String lastName, String streetAddress, String city, String province) {
		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress(streetAddress);
		setCity(city);
		setProvince(province);
		setPostalCode("");
		setPhoneNumber("");
		setBirthday("");
		setStudentNumber(studentID);
		studentID++;
	}

	public Student(String firstName, String lastName, String streetAddress, String city, String province,
			String postalCode) throws InvalidInputException {
		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress(streetAddress);
		setCity(city);
		setProvince(province);
		setPostalCode(postalCode);
		setPhoneNumber("");
		setBirthday("");
		setStudentNumber(studentID);
		studentID++;
	}

	public Student(String firstName, String lastName, String streetAddress, String city, String province,
			String postalCode, String phoneNum) throws InvalidInputException {
		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress(streetAddress);
		setCity(city);
		setProvince(province);
		setPostalCode(postalCode);
		setPhoneNumber(phoneNum);
		setBirthday("");
		setStudentNumber(studentID);
		studentID++;
	}

	public Student(String firstName, String lastName, String streetAddress, String city, String province,
			String postalCode, String phoneNum, String birthday) throws InvalidInputException {

		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress(streetAddress);
		setCity(city);
		setProvince(province);
		setPostalCode(postalCode);
		setPhoneNumber(phoneNum);
		setBirthday(birthday);
		setStudentNumber(studentID);
		studentID++;

	}

	public void setFirstName(String fName) {
		this.firstName = fName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String lName) {
		this.lastName = lName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setStreetAddress(String address) {
		this.streetAddress = address;
	}

	public String getStreetAddress() {
		return this.streetAddress;
	}

	public void setCity(String cityName) {
		this.city = cityName;
	}

	public String getCity() {
		return this.city;
	}

	public void setProvince(String provinceName) {
		this.province = parseProvince(provinceName) ;
	}

	public Provinces getProvince() {
		return this.province;
	}

	public void setPostalCode(String pCode) {
		this.postalCode = pCode;
		boolean valid = false;
		//while (valid == false) {
			//if (!(Character.isLetter(postalCode.charAt(0)) && Character.isDigit(postalCode.charAt(1))
				//	&& Character.isLetter(postalCode.charAt(2)) && (postalCode.charAt(3) == ' ')
					//&& Character.isDigit(postalCode.charAt(4)) && Character.isLetter(postalCode.charAt(5))
					//&& Character.isDigit(postalCode.charAt(6)))) {
				//System.out.println(" Please enter a valid postal code ");
				//valid = true;
			//}
		//}
		
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPhoneNumber(String phone) {
		this.phoneNum = phone;
	}

	public String getPhoneNumber() {
		return this.phoneNum;
	}

	public void setBirthday(String bDay) {
		this.birthday = bDay;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setStudentNumber(long studentNum) {
		this.studentID = studentNum;
		studentIDMaker++;

	}

	public long getStudentNumber() {
		return this.studentID;
	}

	public String toString() {

		return firstName + "," + lastName + "," + studentID + "," + province + "," + city + "," + streetAddress + ","
				+ phoneNum + "," + postalCode + "," + birthday;
	}

	@Override
	public int compareTo(Student arg0) {
		if (this.getLastName().compareTo(arg0.getLastName()) == 0) {
			return (this.getFirstName().compareTo(arg0.getFirstName()));
		}
		return (this.getLastName().compareTo(arg0.getLastName()));
	}

	public void save() {

		File f = new File("");
		try {
			BufferedReader fbr = new BufferedReader(new FileReader("students.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileOutputStream fos = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// PrintStream fps = new PrintStream(fileOutputStream);

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static Provinces parseProvince(String string) {
		string = string.toLowerCase();
		switch (string) {
		case "yt":
		case "yukon":
		case "yukon territories":
			return Provinces.YT;
		case "nt":
		case "nwt":
		case "northwest territories":
			return Provinces.NT;
		case "nu":
		case "nunavut":
			return Provinces.NU;
		case "bc":
		case "british columbia":
			return Provinces.BC;
		case "ab":
		case "alberta":
			return Provinces.AB;
		case "sk":
		case "saskatchewan":
			return Provinces.SK;
		case "mb":
		case "manitoba":
			return Provinces.MB;
		case "on":
		case "ontario":
			return Provinces.BC;
		case "qc":
		case "quebec":
			return Provinces.AB;
		case "nl":
		case "newfoundland and labrador":
		case "newfoundland":
		case "labrador":
			return Provinces.NL;
		case "ns":
		case "nova scotia":
			return Provinces.NS;
		case "pe":
		case "pei":
		case "prince edward island":
			return Provinces.PE;
		case "nb":
		case "new brunswick":
			return Provinces.NB;

		default:
			return null;
		}

	}

}
