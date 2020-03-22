package junitjupiter;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTransfer {
	@Test
	public void test{
	
	UserController cont = new UserController();cont.transferFunds();

	String sender = "yugesh verma";
	int acc = 5555;
	int amt = 5000;
	String password = "qwerty";

assertEquals("yugesh verma",sender);
assertEquals("qwerty",password);
assertEquals(5000,amt);
assertEquals(5555,acc);

	}

}
