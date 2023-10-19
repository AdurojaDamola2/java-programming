package psvm_code;


import java.util.Scanner;

public class Task {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int currentTerm = a;
        
            for (int j = 0  ; j < n; j++) {
                System.out.print(currentTerm);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            
                currentTerm += (Math.pow(2, j) * b);
            }
        
            System.out.println();
        }
        
    }
    }
