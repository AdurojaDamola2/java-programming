package psvm_code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numQueries = scanner.nextInt();
        
        for (int i = 0; i < numQueries; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            generateAndPrintSeries(a, b, n);
        }
        
        scanner.close();
    }
    
    public static void generateAndPrintSeries(int a, int b, int n) {
        int currentTerm = a;
        for (int i = 0; i < n; i++) {
            currentTerm += (Math.pow(2, i) * b);
            System.out.print(currentTerm + " ");
        }
        System.out.println();
    }
}