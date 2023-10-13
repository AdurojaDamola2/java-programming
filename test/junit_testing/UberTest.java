package junit_testing;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UberTest {
	
	Uber uber = new Uber ();
	
	@Test
	public void test_canBookUber() throws Exception {
		int orderPrice = uber.helper (3500);
		Assertions.assertEquals (orderPrice, 3500);
	}
}