package serviceTest;

import entities.School;
import entities.Student;
import service.SchoolService;

public class SchoolServiceTest {
	public boolean getSchoolTest(){
		School hogwarts = new School("Hogwarts");
		School actual = hogwarts;
		
		SchoolService hogwartsService = new SchoolService(hogwarts);
		School expected = hogwartsService.getSchool();
		
		if(actual.equals(expected))
			return true;
		return false;
	}
	
	public boolean setSchoolTest(){
		School hogwarts = new School("Hogwarts");
		School actual = hogwarts;
		
		SchoolService hogwartsService = new SchoolService();
		hogwartsService.setSchool(hogwarts);
		School expected = hogwartsService.getSchool();
		
		if(actual.equals(expected))
			return true;
		return false;
	}
	
	public boolean sortingHatTest(){
		Student harry = new Student("Harry Potter");
		String actual = "Gryffindor";
		
		SchoolService hogwartsService = new SchoolService();
		String expected = hogwartsService.sortingHat(harry).getName();
		
		if(actual.equals(expected))
			return true;
		return false;
	}
	
}
