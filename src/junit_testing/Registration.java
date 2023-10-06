package junit_testing;

public class Registration {

    public String getUserPassword(String password){
        if (password.isEmpty()){
            System.out.println("Your password can not be empty");
        }
        return password;
    }

    public String getUserName(String username){
        if (username.isEmpty()){
            System.out.println("Your username can not be empty");
        }
        return username;
    }

    public int getUserAge(int age){
        if (age < 0){
            System.out.println("Your age can not be empty");
        }
        return age;
    }

    public String getUserPhoneNumber(String phoneNumber){
        if (phoneNumber.isEmpty()){
            System.out.println("Your phone number can not be empty");
        }
        return phoneNumber;
    }

    public String utilityMethod(String phoneNumber, int age, String username, String password ){
        getUserAge(age);
        getUserName(username);
        getUserPassword(password);
        getUserPhoneNumber(phoneNumber);
        return "Account created successfully";
    }
}

