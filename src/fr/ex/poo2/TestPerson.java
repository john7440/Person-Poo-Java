package fr.ex.poo2;

public class TestPerson {

	public static void main(String[] args) {
	
		// New Person
		Person manu = new Person("Emmanuel","Macron", 47, "Elysée", new City("France", "Amiens"));
		Person mor = new Person("Mor", "Diop", 25);
		Person potter = new Person("Harry", "Potter");
		
		// Display
		System.out.println(manu);
		System.out.println(mor);
		System.out.println(potter);
		
	}

}
