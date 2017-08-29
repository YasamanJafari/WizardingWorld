package serviceTest;

import entities.Person;
import service.PersonService;

public class PersonServiceTest {
	
	public void showAllPersonsTest(){
		PersonService allPersonService = new PersonService();
		allPersonService.getData("PersonDB.txt");
		allPersonService.showAllPersons();
	}
	
	public boolean getPersonByNameTest(){
		PersonService personService = new PersonService();
		personService.getData("PersonDB.txt");
		Person actual = new Person("Minerva Mcgonagall");
		
		try{
			Person expected = personService.getPersonByName(actual.getName());
			if(actual.getName().equals(expected.getName()))
				return true;
			return false;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		} 
	}
	
	public void showPersonTest(){
		PersonService allPeopleService = new PersonService();
		allPeopleService.getData("PersonDB.txt");
		allPeopleService.showPerson("Percy Weasley");
	}
	
}
