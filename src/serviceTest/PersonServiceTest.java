package serviceTest;

import service.PersonService;

public class PersonServiceTest {
	
	public void showAllPersonsTest(){
		PersonService allPersonService = new PersonService();
		allPersonService.getData("PersonDB.txt");
		allPersonService.showAllPersons();
	}
}
