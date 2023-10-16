package junit_testing;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class CalculationTest {
	
	Calculation messenger = new Calculation ();
	
	@Test
	public void test_squareRoot() {
		int getResult = messenger.squareRoot (64);
		Assertions.assertEquals (8, 8);
	}
	
	@Test
	public void test_cubeRoot() {
		int getResult = messenger.cubeRoot (64);
		Assertions.assertEquals (4, 4);
	}
	
}