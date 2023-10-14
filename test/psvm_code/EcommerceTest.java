package psvm_code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;


class EcommerceTest {
	RegisterUser registerUser = new RegisterUser ();
	Ecommerce ecommerce = new Ecommerce ();
	
	@Test
	public void test_registerUser() throws Exception {
		registerUser.setEmail("adurojadamola2@gmail.com");
		registerUser.setFirstName("Kelvin");
		registerUser.setLastName("Chase");
		registerUser.setAge(21);
		registerUser.setPhoneNumber("09152624528");
		ecommerce.createAccount(registerUser);
		Assertions.assertEquals("Chase", registerUser.getLastName(), "Last name should be 'Chase'");
	}
	
	@Test
	public void test_deleteRegisterUser()throws Exception{
		Assertions.assertDoesNotThrow(() -> ecommerce.deleteAccount(21), "Delete account should not throw an exception");
		System.out.println ("All out!!!!!!");
	
	}


}
