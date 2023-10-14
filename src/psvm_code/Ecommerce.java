package psvm_code;

import java.util.ArrayList;

public class Ecommerce {
	
	ArrayList<RegisterUser> database = new ArrayList<> ();
	
	
	public String createAccount(RegisterUser registerUser) throws Exception {
		if (!registerUser.getEmail ().contains ("@")){
			throw new Exception("Email is invalid");
		}
		if (registerUser.getPhoneNumber ().length () < 11){
			throw new Exception ("Phone number is not complete");
		}
		if(registerUser.getFirstName ().isEmpty () || registerUser.getLastName ().isEmpty () || registerUser.getAge () <= 0){
			throw new Exception ("Found an empty field ");
		}
		database.add (registerUser);
		System.out.println ("User saved successfully -->{}" + registerUser);
		
		return registerUser.toString ();
	}
	
	public void deleteAccount(int age)throws Exception{
		if(!database.contains (age)){
			throw new Exception ("User account not found in database");
		}
		database.remove (age);
		System.out.println ("Deleted successfully");
	}
}
