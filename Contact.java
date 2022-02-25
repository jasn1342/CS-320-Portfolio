package main;

public class Contact {

	  private String contactId;
	  private String firstName;
	  private String lastName;
	  private String phoneNumber;
	  private String address;
	  
	  	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
	  		if(contactId == null || contactId.length() > 10) {
	  			throw new IllegalArgumentException("Invalid - contact ID is null or " + "length is greater than 10");
	  			}
	  		if(firstName == null || firstName.length() > 10) {
	  			throw new IllegalArgumentException("Invalid - first name is null or length is greater than 10");
	  			}
	  		if(lastName == null || lastName.length() > 10) {
	  			throw new IllegalArgumentException("Invalid - last name is null or length is greater than 10");
	  			}
	  		if(phoneNumber == null || phoneNumber.length() > 10) {
	  			throw new IllegalArgumentException("Invalid - phone number is null or length is greater than 10");
	  			}
	  		if(address == null || address.length() > 30) {
	  			throw new IllegalArgumentException("Invalid - address is null or length is greater than 30");
	  			}
	  		
	  		this.contactId = contactId;
	  		this.firstName = firstName;
	  		this.lastName = lastName;
	  		this.phoneNumber = phoneNumber;
	  		this.address = address;
	  		}
	  	
	  	//accessors/getters
	  	public String getContactId() {
	  		return this.contactId;
	  	}
	  	public String getFirstName(){
	  		return this.firstName;
	  	}
	  	public String getLastName() {
	  		return this.lastName;
	  	}
	  	public String getPhoneNumber() {
	  		return this.phoneNumber;
	  	}
	  	public String getAddress() {
	  		return this.address;
	  	}
	  	
	  //mutators/setters
	  	public void setContactId(String contactId) {
	  		this.contactId = contactId;
	  	}
	  	public void setFirstName(String firstName) {
	  		this.firstName = firstName;
	  		}
	  	public void setLastName(String lastName) {
	  		this.lastName = lastName;
	  		}
	  	public void setPhoneNumber(String phoneNumber) {
	  		this.phoneNumber = phoneNumber;
	  		}
	  	public void setAddress(String address) {
	  		this.address = address;
	  		}
	}