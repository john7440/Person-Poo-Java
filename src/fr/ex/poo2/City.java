package fr.ex.poo2;

/**
 * Represents a city with a name, country, population, and a unique identifier
 * Provides constructors for various levels of detail and methods to access and display city information
 */
public class City {

	//   === Attributes ===
	
	/** The name of the country where the city is located */
	protected String country;
	
	/** The name of the city */
	protected String cityName;
	
	/** The number of citizens living in the city (default is -1 if unknown) */
	protected int numberOfCitizen = -1;
	
	/** Unique ID for each city instance */
	protected int id;
	
	/** Static counter used to assign unique IDs */
	protected static int nextId = 1;
	
	// === Constructors ===

	/**
     * Constructs a city with full details: country, name, and population
     * Automatically assigns a unique ID to the city
     *
     * @param country the country where the city is located
     * @param cityName the name of the city
     * @param numberOfCitizen the number of citizens in the city
     */
	public City(String country, String cityName, int numberOfCitizen) {

		this.id = nextId++;
		this.country = country;
		this.cityName = cityName;
		this.numberOfCitizen = numberOfCitizen;
	}
	
	/**
     * Constructs a city with a name and population
     * The country is set to "Inconnu" by default
     *
     * @param cityName the name of the city
     * @param numberOfCitizen the number of citizens in the city
     */
	public City(String cityName, int numberOfCitizen) {
		this.id = nextId++;
		this.country = "Inconnu";
		setCityName(cityName);
		setNumberOfCitizen(numberOfCitizen);
	}
	
	/**
     * Constructs a city with a name and country
     * The population is set to -1 (unknown)
     *
     * @param country the country where the city is located
     * @param cityName the name of the city
     */
	public City(String country, String cityName) {
		this.id = nextId++;
		setCountry(country);
		setCityName(cityName);
		this.numberOfCitizen = -1;
	}
	
	/**
     * Constructs a city with only a name
     * The country is set to "Unknown" and population to -1
     *
     * @param cityName the name of the city
     */
	public City(String cityName) {
        this.id = nextId++;
        this.country = "Unknown";
        this.cityName = cityName;
        this.numberOfCitizen = -1;
    }
	
	// === Accessors ===

	/**
     * Returns the unique ID of the city
     *
     * @return the city's ID
     */
	public int getId() {
        return id;
    }
	
	/**
     * Returns the country where the city is located
     *
     * @return the country name
     */
	public String getCountry() {
		return country;
	}
	
	/**
     * Sets the country where the city is located
     *
     * @param country the country name to set
     */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
     * Returns the name of the city
     *
     * @return the city name
     */
	public String getCityName() {
		return cityName;
	}
	
	/**
     * Sets the name of the city
     *
     * @param cityName the city name to set
     */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	/**
     * Returns the number of citizens in the city
     *
     * @return the number of citizens
     */
	public int getNumberOfCitizen() {
		return numberOfCitizen;
	}
	
	/**
     * Sets the number of citizens in the city.
     * If the value is negative, it defaults to -1 and displays a warning.
     *
     * @param numberOfCitizen the number of citizens to set
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
	            result += " de " + numberOfCitizen + " habitants";
	        }
	        result += " située en " + country + "\n";
	        return result;
	    }

}
