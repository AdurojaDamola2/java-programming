package junit_testing;

public class Worksheet {
    public String differentiateNames(String userName1, String userName2) {
        if (userName1.equals(userName2)) {
            System.out.println("The names are the same");
        }
        else {
            System.out.println("Name are not equal");
        }
        return userName1;
    }
}