package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Contact;

class ContactTest {
	//test contactId
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890000","Tony","Stark","6035551234","72 Imaginary Lane");
			});
	}
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact(null, "Tony","Stark","6035551234","72 Imaginary Lane");
			});
	}
	//test firstName
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Tony Anthony","Stark","6035551234","72 Imaginary Lane");
			});
	}
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890", null,"Stark","6035551234","72 Imaginary Lane");
			});
	}
	//test lastName
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890", "Tony ","Starknessss","6035551234","72 Imaginary Lane");
			});
	}
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890", "Tony ", null,"6035551234","72 Imaginary Lane");
			});
	}
	//test phoneNumber
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890", "Tony ", "Stark","603555123456", "72 Imaginary Lane");
			});
	}
	@Test
	void testPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890", "Tony", "Stark", null, "72 Imaginary Lane");
			});
	}
	
	//test address
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890", "Tony", "Stark", "6035551234", "72 Imaginary Lane, Malibu CA 90210");
			});
	}
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890", "Tony", "Stark", "6035551234", null);
			});
	}

}