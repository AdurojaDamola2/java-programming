package psvm_code;

import java.util.Scanner;

public class Nigeria{
    
    public int getCondition(int number){
        if (number % 2 == 1){
            System.out.println ("Weird");
        }
        
        else {
            if (number % 2 == 0){
                System.out.println ("Not weird");
                for (int index = 2; index <= 5; index++){
                    System.out.println ("Not Weird");
                }
                for (int index = 6; index <= 20; index++){
                    System.out.println ("Weird");
                }
                if (number >  20){
                    System.out.println ("Not weird");
                }
            }
        }
        return number;
    }
}

    
