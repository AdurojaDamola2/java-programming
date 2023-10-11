package junit_testing;

public class Comparison2 {
    public int getSmallestNumber(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
        int smallestNumber = firstNumber;


        if (smallestNumber > secondNumber) {
            smallestNumber = secondNumber;
        }

        if (smallestNumber > thirdNumber) {
            smallestNumber = thirdNumber;
        }

        if (smallestNumber > fourthNumber) {
            smallestNumber = fourthNumber;
        }

        if (smallestNumber > fifthNumber) {
            smallestNumber = fifthNumber;
        }

        System.out.println("The smallest number is " + smallestNumber);

        return smallestNumber;
    }

    public int getLargestNumber(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {

        int largestNumber = firstNumber;

        if (largestNumber < secondNumber) {
            largestNumber = secondNumber;
        }

        if (largestNumber < thirdNumber) {
            largestNumber = thirdNumber;
        }

        if (largestNumber < fourthNumber) {
            largestNumber = fourthNumber;
        }

        if (largestNumber < fifthNumber) {
            largestNumber = fifthNumber;
        }

        System.out.println("The largest number is " + largestNumber);

        return largestNumber;

    }

    public String setName(String name) throws Exception {
        if (!name.isEmpty()) {
            System.out.println("I love you," + name);
        } else {
            throw new Exception("User name is empty");
        }
        return name;
    }

    public int setAge(int age) throws Exception {
        if (age == 17){
            System.out.println( "Age " + age +" meet up with the requirement");
        } else {
            throw new Exception("User age did not meet up with the reqirement");
        }
        return age;
    }
}
