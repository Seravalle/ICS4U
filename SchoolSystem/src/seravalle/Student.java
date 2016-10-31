package seravalle;

/**
 * 
 * Student.java
 * @author Adam Seravalle
 * October 31 2016 
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

	/**
	 *  empty constructor 
	 */
	public Student() {

		setFirstName("");
		setLastName("");

		try {
			setStreetAddress("");
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setCity("");

		setProvince("");
		try {
			setPostalCode("");
		} catch (InvalidInputException e1) {
			e1.printStackTrace();
		}
		try {
			setPhoneNumber("");
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			setBirthday("");
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setStudentNumber(studentID);
		studentID++;
	}
/**
 * Constructor that sets the first name   
 * @param firstName
 */
	public Student(String firstName) {
		setFirstName(firstName);
		setLastName("");
		try {
			setStreetAddress("");
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setCity("");
		setProvince("");
		try {
			setPostalCode("");
		} catch (InvalidInputException e1) {
			e1.printStackTrace();
		}
		try {
			setPhoneNumber("");
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			setBirthday("");
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setStudentNumber(studentID);
		studentID++;

	}
/**
 * constructor that sets the first name and last name
 * @param firstName
 * @param lastName
 */
	public Student(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
		try {
			setStreetAddress("");
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block

		}
		setCity("");
		setProvince("");
		try {
			setPostalCode("");
		} catch (InvalidInputException e1) {
			e1.printStackTrace();
		}
		try {
			setPhoneNumber("");
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			setBirthday("");
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setStudentNumber(studentID);
		studentID++;
	}
/**
 * constructor that sets the first name, last name, street address 
 * @param firstName
 * @param lastName
 * @param streetAddress
 * @throws InvalidInputException
 */
	public Student(String firstName, String lastName, String streetAddress) throws InvalidInputException {
		setFirstName(firstName);
		setLastName(lastName);

		setStreetAddress(streetAddress);
		setCity("");
		setProvince("");
		try {
			setPostalCode("");
		} catch (InvalidInputException e1) {
			e1.printStackTrace();
		}
		setPhoneNumber("");
		setBirthday("");
		setStudentNumber(studentID);
		studentID++;
	}
/**
 *  constructor that sets the first name, last name, street address, city 
 * @param firstName
 * @param lastName
 * @param streetAddress
 * @param city
 * @throws InvalidInputException
 */
	public Student(String firstName, String lastName, String streetAddress, String city) throws InvalidInputException {

		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress(streetAddress);
		setCity(city);
		setProvince("");
		try {
			setPostalCode("");
		} catch (InvalidInputException e1) {
			e1.printStackTrace();
		}
		setPhoneNumber("");
		setBirthday("");
		setStudentNumber(studentID);
		studentID++;
	}
/**
 *  constructor that sets the first name, last name, street address, city, province
 * @param firstName
 * @param lastName
 * @param streetAddress
 * @param city
 * @param province
 * @throws InvalidInputException
 */
	public Student(String firstName, String lastName, String streetAddress, String city, String province)
			throws InvalidInputException {
		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress(streetAddress);
		setCity(city);
		setProvince(province);
		try {
			setPostalCode("");
		} catch (InvalidInputException e1) {
			e1.printStackTrace();
		}
		setPhoneNumber("");
		setBirthday("");
		setStudentNumber(studentID);
		studentID++;
	}
/**
 *  constructor that sets the first name, last name, street address, city, province, postal code 
 * @param firstName
 * @param lastName
 * @param streetAddress
 * @param city
 * @param province
 * @param postalCode
 * @throws InvalidInputException
 */
	public Student(String firstName, String lastName, String streetAddress, String city, String province,
			String postalCode) throws InvalidInputException {
		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress(streetAddress);
		setCity(city);
		setProvince(province);
		try {
			setPostalCode(postalCode);
		} catch (InvalidInputException e1) {
			e1.printStackTrace();
		}
		setPhoneNumber("");
		setBirthday("");
		setStudentNumber(studentID);
		studentID++;
	}
/**
 *  constructor that sets the first name, last name, street address, city, province, postal code, phone number  
 * @param firstName
 * @param lastName
 * @param streetAddress
 * @param city
 * @param province
 * @param postalCode
 * @param phoneNum
 * @throws InvalidInputException
 */
	public Student(String firstName, String lastName, String streetAddress, String city, String province,
			String postalCode, String phoneNum) throws InvalidInputException {
		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress(streetAddress);
		setCity(city);
		setProvince(province);
		try {
			setPostalCode(postalCode);
		} catch (InvalidInputException e1) {
			e1.printStackTrace();
		}
		setPhoneNumber(phoneNum);
		setBirthday("");
		setStudentNumber(studentID);
		studentID++;
	}
/**
 *  constructor that sets the first name, last name, street address, city, province, postal code, phone number, birthday 
 * @param firstName
 * @param lastName
 * @param streetAddress
 * @param city
 * @param province
 * @param postalCode
 * @param phoneNum
 * @param birthday
 * @throws InvalidInputException
 */
	public Student(String firstName, String lastName, String streetAddress, String city, String province,
			String postalCode, String phoneNum, String birthday) throws InvalidInputException {

		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress(streetAddress);
		setCity(city);
		setProvince(province);
		try {
			setPostalCode(postalCode);
		} catch (InvalidInputException e1) {
			e1.printStackTrace();
		}
		setPhoneNumber(phoneNum);
		setBirthday(birthday);
		setStudentNumber(studentID);
		studentID++;

	}
/**
 * sets the students first name 
 * @param fName
 */
	public void setFirstName(String fName) {
		this.firstName = fName;
	}
/**
 * gets the students first name 
 * @return
 */
	public String getFirstName() {
		return this.firstName;
	}
/**
 * sets the students last name 
 * @param lName
 */
	public void setLastName(String lName) {
		this.lastName = lName;
	}
/**
 * gets the students last name 
 * @return
 */
	public String getLastName() {
		return this.lastName;
	}
/**
 * sets the students street address 
 * @param address
 * @throws InvalidInputException
 */
	public void setStreetAddress(String address) throws InvalidInputException {
		this.streetAddress = address;
	}
/**
 * gets the students street address 
 * @return
 */
	public String getStreetAddress() {
		return this.streetAddress;
	}
/**
 * sets the students city
 * @param cityName
 */
	public void setCity(String cityName) {

		this.city = cityName;
	}
/**
 * gets the students city
 * @return
 */
	public String getCity() {
		return this.city;
	}
/**
 * sets the students province
 * @param provinceName
 */
	public void setProvince(String provinceName) {
		provinceName.toLowerCase();
		this.province = parseProvince(provinceName);
	}
/**
 * gets the students province 
 * @return
 */
	public Provinces getProvince() {
		return this.province;
	}
/**
 * gets the students postal code
 * @return
 */
	public String getPostalCode() {
		return this.postalCode;
	}
/**
 * sets the students postal code
 * @param pCode
 * @throws InvalidInputException
 */
	public void setPostalCode(String pCode) throws InvalidInputException {

		pCode = pCode.toUpperCase();
		this.postalCode = pCode;

	}
/**
 * checks if the postal code is in the correct format 
 * @param pCode
 * @return
 */
	public boolean checkPostalCode(String pCode) {

		if ((pCode.length() < 7 || pCode.length() > 7) || (!Character.isLetter(pCode.charAt(0))
				|| !Character.isDigit(pCode.charAt(1)) || !Character.isLetter(pCode.charAt(2))
				|| (pCode.charAt(3) != ' ') || !Character.isDigit(pCode.charAt(4))
				|| !Character.isLetter(pCode.charAt(5)) || !Character.isDigit(pCode.charAt(6)))) {

			return false;
		}

		return true;

	}
/**
 * sets the  students phone number 
 * @param phone
 * @throws InvalidInputException
 */
	public void setPhoneNumber(String phone) throws InvalidInputException {
		this.phoneNum = phone;
	}
/**
 * gets the students phone number 
 * @return
 */
	public String getPhoneNumber() {
		return this.phoneNum;
	}
/**
 * checks if the phone number is in the correct format 
 * @param phone
 * @return
 */
	public boolean checkPhoneNumber(String phone) {
		if (phone.length() < 12 || phone.length() > 12 || !Character.isDigit(phone.charAt(0))
				|| !Character.isDigit(phone.charAt(1)) || !Character.isDigit(phone.charAt(2)) || phone.charAt(3) != '-'
				|| !Character.isDigit(phone.charAt(4)) || !Character.isDigit(phone.charAt(5))
				|| !Character.isDigit(phone.charAt(6)) || phone.charAt(7) != '-' || !Character.isDigit(phone.charAt(8))
				|| !Character.isDigit(phone.charAt(9)) || !Character.isDigit(phone.charAt(10))
				|| !Character.isDigit(phone.charAt(11))) {
			return false;
		}

		return true;

	}
/**
 * sets the students birthday 
 * @param bDay
 * @throws InvalidInputException
 */
	public void setBirthday(String bDay) throws InvalidInputException {
		this.birthday = bDay;
	}
/**
 * gets the students birthday 
 * @return
 */
	public String getBirthday() {
		return this.birthday;
	}
/**
 * checks if the birthday entered is in correct format 
 * @param bDay
 * @return
 */
	public boolean checkBirthday(String bDay) {
		if (bDay.length() < 10 || bDay.length() > 10) {
			return false;
		}
		if (!Character.isDigit(bDay.charAt(0)) || !Character.isDigit(bDay.charAt(1)) || bDay.charAt(2) != '/'
				|| !Character.isDigit(bDay.charAt(3)) || !Character.isDigit(bDay.charAt(4)) || bDay.charAt(5) != '/'
				|| !Character.isDigit(bDay.charAt(6)) || !Character.isDigit(bDay.charAt(7))
				|| !Character.isDigit(bDay.charAt(8))||!Character.isDigit(bDay.charAt(9))) {
			return false;
		}
	
		return true;
	}
/**
 * sets the students studentID
 * @param studentNum
 */
	public void setStudentNumber(long studentNum) {
		this.studentID = studentNum;
		studentIDMaker++;

	}
/**
 * gets the students studentID
 * @return
 */
	public long getStudentNumber() {
		return this.studentID;
	}
/**
 * return all the variables together 
 */
	public String toString() {

		return firstName + "," + lastName + "," + studentID + "," + province + "," + city + "," + streetAddress + ","
				+ phoneNum + "," + postalCode + "," + birthday;
	}
/**
 * compares students by last name so they can be sorted 
 */
	@Override
	public int compareTo(Student student) {
		if (this.getLastName().compareTo(student.getLastName()) == 0) {
			return (this.getFirstName().compareTo(student.getFirstName()));
		}
		return (this.getLastName().compareTo(student.getLastName()));
	}
/**
 * checks if two students are the same 
 * @param tempStudent
 * @return
 */
	public boolean equals(Student tempStudent) {
		return (this.getStudentNumber() == tempStudent.getStudentNumber());
	}
/**
 * Sets the provinces to the short form 
 * @param string
 * @return
 */
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
			return Provinces.ON;
		case "qc":
		case "quebec":
			return Provinces.QU;
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
