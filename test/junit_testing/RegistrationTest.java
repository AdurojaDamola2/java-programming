package junit_testing;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class RegistrationTest {

    Registration registration = new Registration();

    @Test
    public void test_registration(){
        String userInfo = registration.utilityMethod("", 3, "death", "joshuapassword");
        Assertions.assertEquals(userInfo, "Account created successfully");
    }
}