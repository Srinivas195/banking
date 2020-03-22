package junitjupiter;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tyss.capgemini.jpa.bank.Bank.DetailsValidation;

public class Adminlogin {

	@Test
	public void test() {

		
				DetailsValidation detailsValidation = new DetailsValidation();

				detailsValidation.adminLogin();
				String username = "likitha";
				String password = "likitha999";
				assertEquals("likitha", username);
				assertEquals("likitha999", password);

			}

		}}

}
