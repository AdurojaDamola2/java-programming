import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner joshua = new Scanner(System.in);

        int x;
        int y;
        int sum;
        int product;
        int difference;
        int quotient;

        System.out.println("Enter first integer: ");
        x = joshua.nextInt();

        System.out.println("Enter second integer: ");
        y = joshua.nextInt();

        sum = x + y;
        System.out.println("The Sum is:"+sum);

        product = x * y;
        System.out.println("The Product is:"+product);

        difference = x - y;
        System.out.println("The Difference is:"+difference);

        quotient = x / y;
        System.out.println("The Quotient is:"+quotient);

    }
}
