package junit_testing;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Comparison2Test {

    Comparison2 joshua = new Comparison2();

    @Test
    public void test_smallestNumber(){
        int smallestNumber = joshua.getSmallestNumber(2, 4, 3, 10, 7);
        Assertions.assertEquals(smallestNumber,2);
    }

    @Test
    public void test_largestNumber(){
        int largestNumber = joshua.getLargestNumber(20, 4, 3, 10, 7);
        Assertions.assertEquals(largestNumber,20);
    }

    @Test
    public void test_name() throws Exception {
        String name = joshua.setName("");
        Assertions.assertEquals(name, "");
    }

    @Test
    public void test_age() throws Exception{
        int age = joshua.setAge(17);
        Assertions.assertEquals(age,17);
    }
}