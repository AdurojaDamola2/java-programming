package junit_testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Calculation2Test {
	
	Calculation2 servant = new Calculation2 ();
	
	@Test
	public void test_addTwoNumbers () {
		int getResult = servant.addTwoNumbers(11, 7);
		Assertions.assertEquals(getResult, 18);
	}
	
	@Test
	public void divideTwoNumbers () {
		int getResult = servant.divideTwoNumbers(14, 7);
		Assertions.assertEquals(getResult, 2);
	}
	
	@Test
	public void multiplyTwoNumbers () {
		int getResult = servant.multiplyTwoNumbers(11, 7);
		Assertions.assertEquals(getResult, 77);
	}
	
	@Test
	public void subtractTwoNumbers () {
		int getResult = servant.subtractTwoNumbers(11, 7);
		Assertions.assertEquals(getResult, 4);
	}
	
	@Test
	public void squareRoot () {
		int getResult = servant.squareRoot (64, 16);
		Assertions.assertEquals(getResult, 8, 4);
	}
	
	@Test
	public void cubeRoot () {
		int getResult = servant.cubeRoot (64, 8);
		Assertions.assertEquals(getResult, 4, 2);
	}
}