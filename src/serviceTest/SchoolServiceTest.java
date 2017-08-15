package serviceTest;

import entities.School;
import entities.Student;
import service.SchoolService;

public class SchoolServiceTest {
	public boolean getSchoolTest(){
		School hogwarts = new School("Hogwarts");
		School expected = hogwarts;
		
		SchoolService hogwartsService = new SchoolService(hogwarts);
		School actual = hogwartsService.getSchool();
		
		if(actual.equals(expected))
			return true;
		return false;
	}
	
	public boolean setSchoolTest(){
		School hogwarts = new School("Hogwarts");
		School expected = hogwarts;
		
		SchoolService hogwartsService = new SchoolService();
		hogwartsService.setSchool(hogwarts);
		School actual = hogwartsService.getSchool();
		
		if(actual.equals(expected))
			return true;
		return false;
	}
	
	public boolean sortingHatTest(){
		Student harry = new Student("Harry Potter");
		String expected = "Gryffindor";
		
		SchoolService hogwartsService = new SchoolService();
		String actual = hogwartsService.sortingHat(harry).getName();
		
		if(actual.equals(expected))
			return true;
		return false;
	}
	
}
