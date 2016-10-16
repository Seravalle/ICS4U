package seravalle;

public class Student {

	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String province;
	private String postalCode;
	private String phoneNum;
	private String birthday;
	private long studentID = 323000000;

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
		studentID ++;
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
		studentID ++;
		
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
		studentID ++;
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
		studentID ++;
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
		studentID ++;
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
		studentID ++;
	}

	public Student(String firstName, String lastName, String streetAddress, String city, String province,
			String postalCode) {
		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress(streetAddress);
		setCity(city);
		setProvince(province);
		setPostalCode(postalCode);
		setPhoneNumber("");
		setBirthday("");
		setStudentNumber(studentID);
		studentID ++;
	}

	public Student(String firstName, String lastName, String streetAddress, String city, String province,
			String postalCode, String phoneNum) {
		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress(streetAddress);
		setCity(city);
		setProvince(province);
		setPostalCode(postalCode);
		setPhoneNumber(phoneNum);
		setBirthday("");
		setStudentNumber(studentID);
		studentID ++;
	}

	public Student(String firstName, String lastName, String streetAddress, String city, String province,
			String postalCode, String phoneNum, String birthday) {

		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress(streetAddress);
		setCity(city);
		setProvince(province);
		setPostalCode(postalCode);
		setPhoneNumber(phoneNum);
		setBirthday(birthday);
		setStudentNumber(studentID);
		studentID ++;

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
		this.province = provinceName;
	}

	public String getProvince() {
		return this.province;
	}

	public void setPostalCode(String pCode) {
		this.postalCode = pCode;
		boolean valid = false;
//		while (valid == false) {
		//	if (!(Character.isLetter(postalCode.charAt(0)) && Character.isDigit(postalCode.charAt(1))
		//			&& Character.isLetter(postalCode.charAt(2)) && (postalCode.charAt(3) == ' ')
			//		&& Character.isDigit(postalCode.charAt(4)) && Character.isLetter(postalCode.charAt(5))
				//	&& Character.isDigit(postalCode.charAt(6)))) {
			//	System.out.println(" Please enter a valid postal code ");
			//	valid = true;
		//	}
	//	}
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
		studentID++;
		
	}

	public long getStudentNumber() {
		return this.studentID;
	}

}
