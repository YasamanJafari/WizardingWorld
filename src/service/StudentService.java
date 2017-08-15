package service;

import entities.House;
import entities.Student;

public class StudentService {
	private Student _student;	//The student the services are performed on/at
	
	//constructors
	public StudentService(Student student){
		_student = student;
	}
	public StudentService(){
		this(null);
	}
	
	//getters
	public Student getStudent(){
		return _student;		//get the student field of the class
	}
	
	//setter
	public void setStudent(Student student){
		_student = student;
	}
	
	public void sortToHouse(House house){
		//add this student to the house
		house.addStudent(_student);
		//set this student's house to the one given
		_student.setHouse(house);
	}
}
