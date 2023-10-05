import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner joshua = new Scanner(System.in);

        int x;
        int y;
        int z;
        int product;

        System.out.println("Enter first integer: ");
        x = joshua.nextInt();

        System.out.println("Enter second integer: ");
        y = joshua.nextInt();

        System.out.println("Enter third integer: ");
        z = joshua.nextInt();

        product = x * y * z;
        System.out.println("The Product is:"+product);


    }
}
