package junit_testing;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AirConditionerTest {

    AirConditioner airConditioner = new AirConditioner();

    @Test
    public void test_acIsOn(){
        boolean isOn = airConditioner.isOn("on");
        Assertions.assertTrue(isOn, String.valueOf(true));
    }

    @Test
    public void test_acIsOff(){
        boolean isOff = airConditioner.isOff("off");
        Assertions.assertTrue(isOff, String.valueOf(true));
    }


}