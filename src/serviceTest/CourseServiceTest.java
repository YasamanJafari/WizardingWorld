package serviceTest;

import entities.*;
import service.CourseService;

public class CourseServiceTest {
	
	public boolean getCourseTest(){
		Professor snape = new Professor("Extremely skilled at potions and Occlumency.");
		Course potions = new Course("potions", snape, Grades.A, 1995);
		Course expected = potions;
		
		CourseService potionsService = new CourseService(potions);
		Course actual = potionsService.getCourse();
		
		if(actual.equals(expected))
			return true;
		return false;
	}
	
	public boolean setCourseTest(){
		Professor snape = new Professor("Extremely skilled at potions and Occlumency.");
		Course potions = new Course("potions", snape, Grades.A, 1995);
		Course expected = potions;
		
		CourseService potionsService = new CourseService();
		potionsService.setCourse(potions);
		Course actual = potionsService.getCourse();
		
		if(actual.equals(expected))
			return true;
		return false;
	}
}
