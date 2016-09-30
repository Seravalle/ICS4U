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
	public void setPostalCode(String pCode){
		this.postalCode= pCode;
		
	}
	public String getPostalCode(){
		return this.postalCode;
	}
	public void setPhoneNumber(String phone){
		this.phoneNum= phone;
	}
	public String getPhoneNumber (){
		return this.phoneNum;
	}
	public void setBirthday(String bDay){
		this.birthday= bDay;
	}
	public String getBirthday(){
		return this.birthday;
	}
	
	
}
