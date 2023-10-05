package junit_testing;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void test_addTwoNumbers(){
        int getResult = calculator.addTwoNumbers(2, 5);
        Assertions.assertEquals(getResult, 7);
    }

    @Test
    public void test_divideTwoNumbers(){
        int getResult = calculator.divideTwoNumbers(10, 5);
        Assertions.assertEquals(getResult, 2);
    }

    @Test
    public void test_multiplyTwoNumbers(){
        int getResult = calculator.multiplyTwoNumbers(10, 5);
        Assertions.assertEquals(getResult, 50);
    }

    @Test
    public void test_subtractTwoNumbers(){
        int getResult = calculator.subtractTwoNumbers(10, 5);
        Assertions.assertEquals(getResult, 5);
    }
}