package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import main.Contact;
import main.ContactService;

class ContactServiceTest {
	@Test
	public void testAdd(){
		ContactService cs = new ContactService();
		Contact test1 = new Contact("1234567890", "John", "Doe", "6035551111", "15 Example St.");
		
		assertEquals(true, cs.addContact(test1));
	}

	@Test
	public void testDelete(){
	   ContactService cs = new ContactService();
	   Contact test1 = new Contact("1234567890", "John", "Doe", "6035551111", "15 Example St.");
	   Contact test2 = new Contact("0987654321", "Jane", "Public", "9785552222", "11 Sample Rd.");
	   Contact test3 = new Contact("1122334455", "Bruce", "Banner", "5185553333", "52 Fake Ave.");

	   cs.addContact(test1);
	   cs.addContact(test2);
	   cs.addContact(test3);

	   assertEquals(true, cs.deleteContact("0987654321"));
	   assertEquals(false, cs.deleteContact("0987654322"));
	   assertEquals(false, cs.deleteContact("0987654333"));
	}

	@Test
	public void testUpdate(){
	
		ContactService cs = new ContactService();
	
		Contact test1 = new Contact("1234567890", "John", "Doe", "6035551111", "15 Example St.");
		Contact test2 = new Contact("0987654321", "Jane", "Public", "9785552222", "11 Sample Rd.");
		Contact test3 = new Contact("1122334455", "Bruce", "Banner", "5185553333", "52 Fake Ave.");

		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);

		assertEquals(true, cs.updateContact("1122334455", "Bruce", "Banner", "5185553333", "52 Fake Ave."));
		assertEquals(false, cs.updateContact("1122334466", "Bruce", "Banner", "5185553333", "52 Fake Ave."));
	}

}