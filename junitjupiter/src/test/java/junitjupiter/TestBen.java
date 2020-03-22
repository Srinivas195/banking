package junitjupiter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBen {
	@Test

public void ben
	{
		UserController cont = new UserController();
		cont.beneficiary();
		String firstName = "yugesh";
		String lastName = "verma";
		int acc = 5555;
		String emailid = "yugeshverma@gmail.com";
		long phoneno = 9165065742;

		assertEquals("yugesh", username);
		assertEquals("verma", lastname);
		assertEquals("yugeshverma@gmail.com", emailid);
		assertEquals(9165065742, phoneno);
	}

}
