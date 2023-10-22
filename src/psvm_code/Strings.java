package psvm_code;

import java.util.Scanner;

public class Strings {
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	String firstWord =sc.next();
	String secondWord =sc.next();
	
	int firstWordLength = firstWord.length();
	int secondWordLength = secondWord.length();
	int sumOfWordLength = firstWordLength + secondWordLength;
		System.out.println (sumOfWordLength);
		
		int compare = firstWord.compareTo (secondWord);
		if (compare < 0){
			System.out.println ("Yes");
		}else {
			System.out.println ("No");
		}
		
		String capitalizedFirstWord = Character.toUpperCase(firstWord.charAt(0)) + firstWord.substring(1);
		String capitalizedSecondWord = Character.toUpperCase(secondWord.charAt(0)) + secondWord.substring(1);
		
		System.out.println (capitalizedFirstWord + " " + capitalizedSecondWord);
}

}
