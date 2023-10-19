package junit_testing;


public class PalindromePrinter{
	
	public static boolean isPalindrome (String word){
		word = word.replaceAll ("\\s", "").toLowerCase ();
		
		int left = 0;
		int right = word.length () -1;
		
		if (left < right){
			if (word.charAt (left) != word.charAt (right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public String palindrome(String word){
		if (isPalindrome(word)) {
		System.out.println ( word + " is a palindrome");
		}
		
		else{
			System.out.println ( word + " is not palindrome");
		}
		
		return word;
	}
}

