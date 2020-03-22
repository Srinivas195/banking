package junitjupiter;

import static org.junit.Assert.*;

import org.junit.Test;

import banking.DetailsValidation;

public class Testatm {

	@Test
	public void test() {
		
		DetailsValidation detailsValidation=new DetailsValidation();

		detailsValidation.atmSimulator();
		int amt=1200;
		String type="debit";
		int pin=6666;
		assertEquals(type,"debit");
		assertEquals(amt,1200);
		assertEquals(pin,6666);

	}
	

}
