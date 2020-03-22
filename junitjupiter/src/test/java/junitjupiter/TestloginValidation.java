package junitjupiter;

import static org.junit.Assert.*;

import org.junit.Test;

import banking.DetailsValidation;

public class TestloginValidation {

	@Test
	public void test() {
		
		DetailsValidation detailsValidation=new DetailsValidation();
		
		detailsValidation.loginValidation();
		String user="gopi";
		String password="gopal999";
		assertEquals("gopi", user);
		assertEquals("gopal999", password);

		
		
		
	}

}
