package fr.ex.poo2;

public class Person {
	
	// ==== Attributes===
	
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	private City birthCity;
	
	// == Constructors ==
	
	public Person(String firstName, String lastName, int age, String address, City birthCity) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setAddress(address);
		this.birthCity = birthCity;
			
	}
	
	public Person(String firstName, String lastName, int age) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		this.address = "Inconnue";
	}
	
	public Person(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
		this.age = 0;
		this.address = "Inconnue";
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
	
	// for the birth city
	public City getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(City birthCity) {
        this.birthCity = birthCity;
    }

	
	
	// methods
	
	public String toString() {
		return "Prénom: " + getFirstName() + "\n" +
			   "Nom: " + getLastName() + "\n" +
			   "Age: " + getAge() + "\n" +
			   "Adresse: " + getAddress() + "\n" +
               "Ville de naissance: " + (birthCity != null ? birthCity.getCityName() : "Inconnue") + "\n" +
               "Pays de naissance: " + (birthCity != null ? birthCity.getCountry() : "Inconnu") + "\n";
	}



}
