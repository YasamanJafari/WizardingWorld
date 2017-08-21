import service.*;
import serviceTest.*;

public class Main {

	public static void main(String[] args) {
		//***Creating an instance of courseService test in order to use the methods
		CourseServiceTest cstest = new CourseServiceTest();
		
		//CourseService::getCourseTest
		System.out.println("** COURSE_SERVICE::getCourse TEST **");
		//Printing test result
		System.out.println(cstest.getCourseTest());
		System.out.println("----------------------------------------");

		System.out.println("** COURSE_SERVICE::setCourse TEST **");
		//Printing test result
		System.out.println(cstest.setCourseTest());
		System.out.println("----------------------------------------");
	
		//***Creating an instance of schoolService test in order to use the methods
		SchoolServiceTest sstest = new SchoolServiceTest();
		
		//SchoolService::getSchoolTest
		System.out.println("** SCHOOL_SERVICE::getSchool TEST **");
		//Printing test result
		System.out.println(sstest.getSchoolTest());
		System.out.println("----------------------------------------");
		
		//SchoolService::setSchoolTest
		System.out.println("** SCHOOL_SERVICE::setSchool TEST **");
		//Printing test result
		System.out.println(sstest.setSchoolTest());
		System.out.println("----------------------------------------");
		
		//SchoolService::sortingHat
		System.out.println("** SCHOOL_SERVICE::sortingHat TEST **");
		//Printing test result
		System.out.println(sstest.sortingHatTest());
		System.out.println("----------------------------------------");
		
		
		//***Creating an instance of studentService test in order to use the methods
		StudentServiceTest studentServTest = new StudentServiceTest();
		
		//StudentService::getSchoolTest
		System.out.println("** STUDENT_SERVICE::getStudent TEST **");
		//Printing test result
		System.out.println(studentServTest.getStudentTest());
		System.out.println("----------------------------------------");
		
		
		//StudentService::setSchoolTest
		System.out.println("** STUDENT_SERVICE::setStudent TEST **");
		//Printing test result
		System.out.println(studentServTest.setStudentTest());
		System.out.println("----------------------------------------");
		
		//StudentService::sortToHouseTest
		System.out.println("** STUDENT_SERVICE::sortToHouse TEST **");
		//Printing test result
		System.out.println(studentServTest.sortToHouseTest());
		System.out.println("----------------------------------------");
	
		//SchoolTest::getData
		SchoolService schoolTG = new SchoolService();
		schoolTG.getData("SchoolDB.txt");
		
		//CourseTest::getData
		CourseService courseTG = new CourseService();
		courseTG.getData("CourseDB.txt");
		
		//StudentTest::getData
		StudentService studentTG = new StudentService();
		studentTG.getData("StudentDB.txt");
		
		//HouseTest::getData
		HouseService houseTG = new HouseService();
		houseTG.getData("HouseDB.txt");
		
		//PersonTest::getData
		PersonService personTG = new PersonService();
		personTG.getData("PersonDB.txt");
		
		//ProfessorTest::getData
		ProfessorService professorTG = new ProfessorService();
		professorTG.getData("ProfessorDB.txt");
	
		//stg.setData("SchoolDB.txt");
	}
}
