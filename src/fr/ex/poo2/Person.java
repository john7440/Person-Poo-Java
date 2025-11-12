package fr.ex.poo2;

public class Person {
	
	
	// ==== Attributes===
	
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	
	// == Constructors ==
	
	public Person(String firstName, String lastName, int age, String address) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setAddress(address);
	}
	
	// -- Accessors--
	
	// For the first name
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// For the last name
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// For the age (with validation)
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("L'âge doit être positif! Valeur par défaut 0 (enfin 3 semaines plus exactement)");
			this.age = 0;
			
		} else {
			this.age = age;
		}
		
	}
	
	// For the address
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
