package fr.ex.poo2;

public class City {

	//   === Attributes ===
	
	// The name of the country where the city is located
	protected String country;
	
	// Name of the city
	protected String cityName;
	
	// The number of citizens living in the city
	protected int numberOfCitizen = -1;
	
	// Unique ID for each city instance
	protected int id;
	
	// Counter used to generate unique IDs
	protected static int nextId = 1;
	
	// === Constructors ===

    /**
     * Constructor with full parameters,
     * it automatically assigns a unique ID to the city
     *
     * @param country          the country name
     * @param cityName         the city name
     * @param numberOfCitizen  the number of citizens
     */
	public City(String country, String cityName, int numberOfCitizen) {

		this.id = nextId++;
		this.country = country;
		this.cityName = cityName;
		this.numberOfCitizen = numberOfCitizen;
	}
	
	/**
     * Constructor with default country set to "Unknown"
     *
     * @param cityName         the city name
     * @param numberOfCitizen  the number of citizens
     */
	public City(String cityName, int numberOfCitizen) {
		this.id = nextId++;
		this.country = "Inconnu";
		setCityName(cityName);
		setNumberOfCitizen(numberOfCitizen);
	}
	
	public City(String country, String cityName) {
		this.id = nextId++;
		setCountry(country);
		setCityName(cityName);
		this.numberOfCitizen = -1;
	}
	
	public City(String cityName) {
        this.id = nextId++;
        this.country = "Unknown";
        this.cityName = cityName;
        this.numberOfCitizen = -1;
    }
	
	
	
	// === Accessors ===

    // Returns the unique ID of the city
	public int getId() {
        return id;
    }
	
	// Returns the country name
	public String getCountry() {
		return country;
	}
	
	// Sets the country name
	public void setCountry(String country) {
		this.country = country;
	}
	
	// Returns the city name
	public String getCityName() {
		return cityName;
	}
	
	// Sets the city name
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	// Returns the number of citizens
	public int getNumberOfCitizen() {
		return numberOfCitizen;
	}
	
	/**
     * Sets the number of citizens,
     * if the value is negative, it defaults to 0 and displays a warning message
     *
     * @param numberOfCitizen the number of citizens
     */
	public void setNumberOfCitizen(int numberOfCitizen) {
		if (numberOfCitizen < 0) {
			System.out.println("Il ne peut pas y avoir - de 0 habitants ! Valeur par défaut");
			this.numberOfCitizen = -1;
		} else {
			this.numberOfCitizen = numberOfCitizen;
		}
		
	}
	
	
	// === Methods ===

    /**
     * Displays the city's information in a formatted sentence
     */
	public void display() {
		System.out.println(getCityName()+ " est une ville");
							if (numberOfCitizen >= 0) {
									System.out.print(" de" + numberOfCitizen + " habitants");
							}
							System.out.println(" situé en " + country + "\n");
	}
	
	/**
     * Returns a string representation of the city
     *
     * @return formatted city description
     * 
     */
	
	 @Override
	    public String toString() {
	        String result = cityName + " est une ville";
	        if (numberOfCitizen >= 0) {
	            result += " de " + numberOfCitizen + " habitans";
	        }
	        result += " située en " + country + ".";
	        return result;
	    }

}
