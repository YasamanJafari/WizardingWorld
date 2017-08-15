package serviceTest;

import entities.School;
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
}
