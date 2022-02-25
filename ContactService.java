package main;

import java.util.ArrayList;

public class ContactService {
	private ArrayList<Contact> contactList;
	
	public ContactService() {
		contactList = new ArrayList<>();
	}
	
	//add contact
	public boolean addContact(Contact c) {
		boolean contactExist = false;
		//checks if contact exist
		for(Contact i:contactList) {
			if(i.equals(c)) {
				contactExist = true;
			}
		}
		if(!contactExist) {
			contactList.add(c);
			return true;
		}else {
			return false;
		}
	}
	//delete contact
	public boolean deleteContact(String cid) {
		//checks to see if contact id exist
		for(Contact i:contactList) {
			if(i.getContactId().equals(cid)) {
				contactList.remove(i);
				return true;
			}
		}
		return false;
	}
	//update contact list
	public boolean updateContact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		for(Contact i:contactList) {
			if(i.getContactId().equals(contactId)) {
				//checks & update first name
				if(!firstName.equals("") && !(firstName.length() > 10)) {
					i.setFirstName(firstName);
				}
				//checks & update last name
				if(!lastName.equals("") && !(lastName.length() > 10)) {
					i.setLastName(lastName);
				}
				//checks & update phone number
				if(!phoneNumber.equals("") && !(phoneNumber.length() > 10)) {
					i.setPhoneNumber(phoneNumber);
				}
				//checks & update address
				if(!address.equals("") && !(address.length() > 30)) {
					i.setAddress(address);
				}
				return true;
				}
		}
		return false;
	}
}
  