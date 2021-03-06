package serviceTest;

import entities.BloodStatus;
import entities.House;
import entities.Person;
import entities.School;
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
	
	public void createNewPersonTest(){
		PersonService allPersonService = new PersonService();
		Person newPerson = new Person("New Person", new House("New House"), BloodStatus.HALF_BLOOD, new School("New School"), "01/01/1980");
		newPerson.setRole("Student");
		allPersonService.createNewPerson(newPerson);
		allPersonService.getData("PersonDB.txt");
		allPersonService.showAllPersons();
	}
	
	public void editPersonTest(){
		PersonService allPersonService = new PersonService();
		allPersonService.getData("PersonDB.txt");
		
		//edited person
		Person edittedPerson = new Person("Editted Person", new House("Editted House"), BloodStatus.HALF_BLOOD, new School("Editted School"), "01/01/1980");
		edittedPerson.setRole("Student");
		
		allPersonService.editPerson(edittedPerson, "New Person");
		allPersonService.getData("PersonDB.txt");
		allPersonService.showAllPersons();
	}
	
	public void deletePersonTest(){
		PersonService allPersonService = new PersonService();
		allPersonService.getData("PersonDB.txt");
		allPersonService.deletePerson(allPersonService.getAllPersons().get(allPersonService.getAllPersons().size() - 1));
		allPersonService.getData("PersonDB.txt");
		allPersonService.showAllPersons();
	}
}
