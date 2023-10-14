package psvm_code;



class RegisterUser{
	private String email;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int age;
	
	public String getEmail () {
		return email;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public String getFirstName () {
		return firstName;
	}
	
	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName () {
		return lastName;
	}
	
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNumber () {
		return phoneNumber;
	}
	
	public void setPhoneNumber (String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getAge () {
		return age;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
}
