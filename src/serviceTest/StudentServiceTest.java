package serviceTest;

import entities.Student;
import service.StudentService;

public class StudentServiceTest {
	public boolean getStudentTest(){
		Student harry = new Student("Harry Potter");
		Student actual = harry;
		
		StudentService harryService = new StudentService(harry);
		Student expected = harryService.getStudent();
		
		if(actual.equals(expected))
			return true;
		return false;
	}
	
	public boolean setStudentTest(){
		Student harry = new Student("Harry Potter");
		Student actual = harry;
		
		StudentService harryService = new StudentService();
		harryService.setStudent(harry);
		Student expected = harryService.getStudent();
		
		if(actual.equals(expected))
			return true;
		return false;
	}
}
