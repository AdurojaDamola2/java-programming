package junit_testing;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class WorksheetTest {

    Worksheet joshua = new Worksheet();

    @Test
    public void test_differentiateNames() {
        String differentiateNames = joshua.differentiateNames("damola","damola5");
        Assertions.assertEquals(differentiateNames,"damola");
    }
}