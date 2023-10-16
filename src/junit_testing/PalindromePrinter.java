package junit_testing;

import java.util.Locale;

public class PalindromePrinter{
	
	static boolean isPalindrome(String word)
	{
		
		int i = 0, j = word.length() - 1;
		
		while (i < j) {
			if (word.charAt(i) != word.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	public String palindrome(String word){
		word = word.toLowerCase();
		
		if (isPalindrome(word)) {
		System.out.println ( word + " is a palindrome");
		}
		
		else{
			System.out.println ( word + " is not palindrome");
		}
	return word;
	}
}

