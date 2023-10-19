package hackerrank;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ConditionalActionsTest {
	
	ConditionalActions conditionalActions = new ConditionalActions ();
	
	@Test
	public void test_conditionalAction(){
		String result = conditionalActions.getCondition (24);
		Assertions.assertEquals ("", result);
	}

}