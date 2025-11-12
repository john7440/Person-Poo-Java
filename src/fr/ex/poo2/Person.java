package fr.ex.poo2;

/**
 * Represents a person with basic personal information such as name, age, address, and birth city
 */
public class Person {
	
	// ==== Attributes===
	// Personal informations
	
	/** The person's first name */
	private String firstName;
	
	/** The person's last name */
	private String lastName;
	
	/** The person's age */
	private int age;
	
	/** The person's address */
	private String address;
	
	/** The city where the person was born */
	private City birthCity;
	
	// == Constructors ==
	
	/**
     * Constructs a Person with full details
     *
     * @param firstName the person's first name
     * @param lastName the person's last name
     * @param age the person's age
     * @param address the person's address
     * @param birthCity the city where the person was born
     */
	public Person(String firstName, String lastName, int age, String address, City birthCity) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setAddress(address);
		this.birthCity = birthCity;	
	}
	
	 /**
     * Constructs a Person with name and age, default address is "Inconnue"
     *
     * @param firstName the person's first name
     * @param lastName the person's last name
     * @param age the person's age
     */
	public Person(String firstName, String lastName, int age) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		this.address = "Inconnue";
	}
	
	/**
     * Constructs a Person with only name, default age is 0 and address is "Inconnue"
     *
     * @param firstName the person's first name
     * @param lastName the person's last name
     */
	public Person(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
		this.age = 0;
		this.address = "Inconnue";
	}
	
	// -- Accessors--
	
	/**
     * Gets the person's first name
     *
     * @return the first name
     */
	public String getFirstName() {
		return firstName;
	}
	
	 /**
     * Sets the person's first name
     *
     * @param firstName the first name to set
     */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
     * Gets the person's last name
     *
     * @return the last name
     */
	public String getLastName() {
		return lastName;
	}
	
	/**
     * Sets the person's last name
     *
     * @param lastName the last name to set
     */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
     * Gets the person's age
     *
     * @return the age
     */
	public int getAge() {
		return age;
	}
	
	/**
     * Sets the person's age. If the age is negative, sets it to -1
     *
     * @param age the age to set
     */
	public void setAge(int age) {
		if (age < 0) {
			this.age = -1;
			
		} else {
			this.age = age;
		}
		
	}
	
	   /**
     * Gets the person's address.
     *
     * @return the address
     */
	public String getAddress() {
		return address;
	}
	
	/**
     * Sets the person's address.
     *
     * @param address the address to set
     */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
     * Gets the person's birth city.
     *
     * @return the birth city
     */
	public City getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(City birthCity) {
        this.birthCity = birthCity;
    }

    // == Methods ==
    
    /**
     * Returns a string representation of the person's details.
     *
     * @return a formatted string with personal information
     */
    public String toString() {
        String result = "Prénom: " + getFirstName() + "\n" +
                        "Nom: " + getLastName() + "\n" +
                        "Age: " + getAge() + "\n" +
                        "Adresse: " + getAddress() + "\n";

        if (birthCity != null) {
            result += "Ville de naissance: " + birthCity.getCityName() + "\n" +
                      "Pays de naissance: " + birthCity.getCountry() + "\n";

            if (birthCity.getNumberOfCitizen() >= 0) {
                result += "Population de la ville: " + birthCity.getNumberOfCitizen() + "\n";
            }
        } else {
            result += "Ville de naissance: Inconnue\n";
        }

        return result;
    }

}
