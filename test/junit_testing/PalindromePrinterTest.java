package junit_testing;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromePrinterTest {
	
	@Test
	public void testIsPalindrome() {
		assertTrue(PalindromePrinter.isPalindrome("racecar"));
		assertTrue(PalindromePrinter.isPalindrome("deified"));
		assertTrue(PalindromePrinter.isPalindrome("A man a plan a canal Panama"));
		assertFalse(PalindromePrinter.isPalindrome("hello"));
		assertFalse(PalindromePrinter.isPalindrome("world"));
	}
	
	@Test
	public void testPalindrome() {
		PalindromePrinter palindromePrinter = new PalindromePrinter();
		
		assertEquals("racecar", palindromePrinter.palindrome("racecar"));
		assertEquals("deified", palindromePrinter.palindrome("deified"));
		assertEquals("A man a plan a canal Panama", palindromePrinter.palindrome("A man a plan a canal Panama"));
		assertEquals("hello", palindromePrinter.palindrome("hello"));
		assertEquals("world", palindromePrinter.palindrome("world"));
	}

}