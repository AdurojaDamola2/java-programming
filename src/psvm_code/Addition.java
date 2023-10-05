package psvm_code;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner joshua = new Scanner(System.in);
        int number1, number2, sum;

        System.out.print("Enter firt interger");
        number1 = joshua.nextInt();

        System.out.print("Enter second interger");
        number2 = joshua.nextInt();

        sum = number1 + number2;
        System.out.print("The sum is:" + sum);

    }
}
