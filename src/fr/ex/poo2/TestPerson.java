package fr.ex.poo2;
import java.util.ArrayList;

/**
 * TestPerson is a test class used to demonstrate the creation and filtering of Person objects
 * It creates several instances of Person, displays them, and filters those born in France
 */
public class TestPerson {

	/**
     * The main method executes the test scenario
     * It creates a list of Person objects, displays them, and filters those born in France
     *
     * @param args command-line arguments (not used in this case)
     */
	public static void main(String[] args) {
	
		// Personalities list
		Person manu = new Person("Emmanuel","Macron", 47, "Elysée", new City("France", "Amiens"));
		Person mor = new Person("Mor", "Diop");
		Person potter = new Person("Harry", "Potter", 12, "Poudlard", new City("Royaume-Uni", "Le placard sous l'escalier", 9000000 ));
		Person sarko = new Person("Nicolas", "Sarkozy", 70, "Prison de la Santé", new City("France","Paris"));
		Person theo = new Person("Theo", "Sahrane", 25, "[Censored]", new City("France", "Dans un chou"));
		Person jonathan = new Person("Jonathan", "Maier", 36, "Saint-Paul", new City("Autriche", "Hong-Kong"));
		
		
		
		// Initial Display
		System.out.println("\n===========================");
		System.out.println("      Liste initiale ");
		System.out.println("===========================\n");
		System.out.println(manu);
		System.out.println(mor);
		System.out.println(potter);
		System.out.println(sarko);
		System.out.println(theo);
		System.out.println(jonathan);
		System.out.println("----------------------------");
		
		
		// ArrayList of Persons to filter them
		ArrayList<Person> personOfInterest = new ArrayList<>();
		personOfInterest.add(manu);
		personOfInterest.add(mor);
		personOfInterest.add(potter);
		personOfInterest.add(sarko);
		personOfInterest.add(theo);
		personOfInterest.add(jonathan);
		
		//Filtered display
		System.out.println("\n===========================");
		System.out.println("   Personne née en France ");
		System.out.println("===========================\n");
		for (Person person: personOfInterest) {
			City birthCity = person.getBirthCity();
			if (birthCity != null && "France".equalsIgnoreCase(birthCity.getCountry())) {
				System.out.println(person);
			}
		}
		
		
		
		
		
		
	}

}
