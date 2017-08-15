package serviceTest;

import entities.House;
import entities.Student;
import service.StudentService;

public class StudentServiceTest {
	public boolean getStudentTest(){
		Student harry = new Student("Harry Potter");
		Student expected = harry;
		
		StudentService harryService = new StudentService(harry);
		Student actual = harryService.getStudent();
		
		if(actual.equals(expected))
			return true;
		return false;
	}
	
	public boolean setStudentTest(){
		Student harry = new Student("Harry Potter");
		Student expected = harry;
		
		StudentService harryService = new StudentService();
		harryService.setStudent(harry);
		Student actual = harryService.getStudent();
		
		if(actual.equals(expected))
			return true;
		return false;
	}
	
	public boolean sortToHouseTest(){
		Student harry = new Student("Harry Potter"); 
		House gryffindor = new House("Gryffindor");
		House expected = gryffindor;
		
		StudentService harryService = new StudentService(harry);
		harryService.sortToHouse(gryffindor);
		
		House actual = harry.getHouse();
		if(actual.equals(expected))
			return true;
		return false;
	}
}
