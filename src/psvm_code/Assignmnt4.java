package psvm_code;

import java.util.Scanner;

public class Assignmnt4 {
    public static void main(String[] args) {
        Scanner joshua = new Scanner(System.in);

        int  number1;
        int  number2;

        System.out.println("Enter first integer: ");
        number1 = joshua.nextInt();

        System.out.println("Enter second integer: ");
        number2 = joshua.nextInt();

        if (number1 > number2){
            System.out.println(number1+" is larger");
        }

        if (number1 < number2){
            System.out.println(number2+" is larger");
        }

        if (number1 == number2){
            System.out.println("This numbers are equal");
        }
        }
        }
