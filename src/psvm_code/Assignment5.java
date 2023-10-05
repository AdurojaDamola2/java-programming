package psvm_code;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner joshua = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int sum;
        int average;
        int product;
        int smallestNumber;
        int largestNumber;

        System.out.println("Enter first integer: ");
        number1 = joshua.nextInt();

        System.out.println("Enter second integer: ");
        number2 = joshua.nextInt();

        System.out.println("Enter third integer: ");
        number3 = joshua.nextInt();

        sum = number1 + number2 + number3;
        System.out.println("The Sum is:" + sum);

        average = (number1 + number2 + number3) / 3;
        System.out.println("The Average is:" + average);

        product = number1 * number2 * number3;
        System.out.println("The psvm_code.Product is:" + product);

        smallestNumber = number1;
        largestNumber = number1;

        if (smallestNumber > number2) {
            smallestNumber = number2;
        }
        if (smallestNumber > number3) {
            smallestNumber = number3;
        }

        if (largestNumber < number2) {
            largestNumber = number2;
        }
        if (largestNumber < number3) {
            largestNumber = number3;
        }

        System.out.println(smallestNumber + " is the smallest number");
        System.out.println(largestNumber + " is the largest number");
    }
}
