import serviceTest.*;
import service.*;

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
		
//		//SchoolService::sortingHat
//		System.out.println("** SCHOOL_SERVICE::sortingHat TEST **");
//		//Printing test result
//		sstest.sortingHatTest();
//		System.out.println("----------------------------------------");
		
		
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
		System.out.println("** HOUSE_SERVICE::getData TEST **");
		houseTG.showAllHouses();
		
		//PersonTest::getData
		PersonService personTG = new PersonService();
		personTG.getData("PersonDB.txt");
		System.out.println("** PERSON_SERVICE::getData TEST **");
		personTG.showAllPersons();
		
		//ProfessorTest::getData
		ProfessorService professorTG = new ProfessorService();
		System.out.println("** PROFESSOR_SERVICE::getData TEST **");
		professorTG.getData("ProfessorDB.txt");
		professorTG.showAllProfessors();

		
		//You can test all setDatas by opening the file and seeing the content ^_^
		schoolTG.setData("SchoolDB.txt");
		courseTG.setData("CourseDB.txt");
		studentTG.setData("StudentDB.txt");
		houseTG.setData("HouseDB.txt");
		personTG.setData("PersonDB.txt");
		professorTG.setData("ProfessorDB.txt");
		
		//HouseServiceTest::getHouseByName
		HouseServiceTest houseServiceTest = new HouseServiceTest();
		System.out.println("** HOUSE_SERVICE::getHouseByName TEST **");
		//Printing test result
		System.out.println(houseServiceTest.getHouseByNameTest());
		System.out.println("----------------------------------------");
		
		//HouseServiceTest::showAllHouses
		System.out.println("** HOUSE_SERVICE::showAllHouses TEST **");
		//Printing test result
		houseServiceTest.showAllHousesTest();
		
		//HouseServiceTest::showHouse
		System.out.println("** HOUSE_SERVICE::showHouse TEST **");
		//Printing test result
		houseServiceTest.showHouseTest();
		System.out.println("----------------------------------------");
		
		//HouseServiceTest::createNewHouse
		System.out.println("** HOUSE_SERVICE::createNewHouse TEST **");
		//Printing test result
		houseServiceTest.createNewHouseTest();
		
		//HouseServiceTest::editHouse
		System.out.println("** HOUSE_SERVICE::editHouse TEST **");
		//Printing test result
		houseServiceTest.editHouseTest();
		
		//HouseServiceTest::deleteHouse
		System.out.println("** HOUSE_SERVICE::deleteHouse TEST **");
		//Printing test result
		houseServiceTest.deleteHouseTest();
		
		//HouseServiceTest::searchByName
		System.out.println("** HOUSE_SERVICE::searchByName TEST **");
		//Printing test result
		System.out.println(houseServiceTest.searchByNameTest());
		System.out.println("----------------------------------------");
		
		//PersonServiceTest::showAllPersons
		PersonServiceTest personServiceTest = new PersonServiceTest();		
		System.out.println("** PERSON_SERVICE::showAllPersons TEST **");
		//Printing test result
		personServiceTest.showAllPersonsTest();

		//PersonServiceTest::getPersonByName
		PersonServiceTest personServiceT = new PersonServiceTest();
		System.out.println("** Person_SERVICE::getPersonByName TEST **");
		//Printing test result
		System.out.println(personServiceT.getPersonByNameTest());
		System.out.println("----------------------------------------");
		
		//PersonServiceTest::showPerson
		System.out.println("** PERSON_SERVICE::showPerson TEST **");
		//Printing test result
		personServiceTest.showPersonTest();
		
		//PersonServiceTest::createNewPerson
		System.out.println("** PERSON_SERVICE::createNewPerson TEST **");
		//Printing test result
		personServiceTest.createNewPersonTest();
		
		//PersonServiceTest::editPerson
		System.out.println("** PERSON_SERVICE::editPerson TEST **");
		//Printing test result
		personServiceTest.editPersonTest();
		
		//PersonServiceTest::deletePerson
		System.out.println("** PERSON_SERVICE::deletePerson TEST **");
		//Printing test result
		personServiceTest.deletePersonTest();
		
		//ProfessorServiceTest::showAllProfessors
		ProfessorServiceTest professorServiceT = new ProfessorServiceTest();
		System.out.println("** PROFESSOR_SERVICE::showAllProfessors TEST **");
		//Printing test result
		professorServiceT.showAllProfessorsTest();
		
		//ProfessorServiceTest::getProfessorByName
		System.out.println("** PROFESSOR_SERVICE::getProfessorByName TEST **");
		//Printing test result
		System.out.println(professorServiceT.getProfessorByNameTest());
		System.out.println("----------------------------------------");
	}
}
