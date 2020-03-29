package online_banking;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.banking.controller.AdminController;
import com.capgemini.banking.controller.UserController;

import junit.framework.Assert;

public class Benejunit {

	/*@Test
	public void test1() {

		AdminController detailsValidation = new AdminController();
		detailsValidation.admin();
		String username = "likki";
		String password = "likki";
		assertEquals("likki", username);
		assertEquals("likki", password);

	}

	@Test
	public void test2() {
		UserController u=new UserController();
		u.loginUser();
		String username = "gopi";
		String password = "gopal999";
		assertEquals("gopi", username);
		assertEquals("gopal999", password);
	}
		*/
	
	@Test
	public void test3() {
		UserController uc = new UserController();
		uc.beneficiary();
		String name = "yugesh";
		String lname = "verma";
		String email = "yugeshverma@gmail.com";
		int acc = 5555;
		long mno = 123456789;
		assertEquals("yugesh", name);
		assertEquals("verma", lname);
		assertEquals("yugeshverma@gmail.com", email);
		assertEquals(5555, acc);
		assertEquals(123456789, mno);
	}
	
/*	@Test
	public void test4() {
		UserController user = new UserController();
		user.atmSimulatorr();
		int pin=1234;
		String type="debit";
		int amt=3000;
	}
	
	@Test
	public void test5() {
		UserController con=new UserController();
		con.transferFunds();
		String name="yugeshverma";
		int acc=1234;
		int amt=5000;
		assertEquals("yugeshverma",name);
		assertEquals(1234,acc);
		assertEquals(5000,amt);
		
		//String password="qwerty";
		//assertEquals(, );
		
	}*/

}
