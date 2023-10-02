import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("Enter first interger");
        number1 = input.nextInt();

        System.out.println("Enter second interger");
        number2 = input.nextInt();

        if (number1 == number2){
            System.out.println("number1 and number2 are equal to themselves");
        }

        if (number1 < number2){
            System.out.println("number1 is lesser than number2 ");

        }
        if (number1 > number2){
            System.out.println("number1 is greater than number2 ");
        }

    }
}
