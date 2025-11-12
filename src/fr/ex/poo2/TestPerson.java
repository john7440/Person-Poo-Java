package fr.ex.poo2;

public class TestPerson {

	public static void main(String[] args) {
	
		// New Person
		Person manu = new Person("Emmanuel","Macron", 47, "Elysée", new City("France", "Amiens"));
		Person potter = new Person("Harry", "Potter", 12, "Poudlard", new City("Royaume-Uni", "Le placard sous l'escalier", 9000000 ));
		Person sarko = new Person("Nicolas", "Sarkozy", 70, "Prison de la Santé", new City("France","Paris"));
		Person theo = new Person("Theo", "Sahrane", 25, "[Censored]", new City("France", "Dans un chou"));
		
		City paris = new City("France","Toulouse");
		
		// Display
		System.out.println(manu);
		System.out.println(potter);
		System.out.println(sarko);
		System.out.println(theo);
		
		System.out.println(paris);
		
	}

}
