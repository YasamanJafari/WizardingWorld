package serviceTest;

import entities.Student;
import service.StudentService;

public class StudentServiceTest {
	public boolean getStudentTest(){
		Student harry = new Student("Harry Potter");
		Student actual = harry;
		
		StudentService hogwartsService = new StudentService(harry);
		Student expected = hogwartsService.getStudent();
		
		if(actual.equals(expected))
			return true;
		return false;
	}
}
