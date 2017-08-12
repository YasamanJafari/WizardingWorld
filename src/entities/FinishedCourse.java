package entities;

import java.util.Vector;

public class FinishedCourse extends Course{
	private Grades _grade; //grade received
	private boolean _passed; //whether or not the student passed the course
	
	//constructors
	public FinishedCourse(Grades grade, boolean passed, String name, Professor professorName, Grades minGrade, int year, Vector<Student> studentNames){
		super(name, professorName, minGrade, year, studentNames);
		_grade = grade;
		_passed = passed;
	}
	public FinishedCourse(boolean passed, String name, Professor professorName, Grades minGrade, int year, Vector<Student> studentNames){
		//Grade not given
		this(null, passed, name, professorName, minGrade, year, studentNames);
	}
	public FinishedCourse(Grades grade, String name, Professor professorName, Grades minGrade, int year, Vector<Student> studentNames){
		//passed boolean not given
		this(grade, false, name, professorName, minGrade, year, studentNames);
	}
	public FinishedCourse(String name, Professor professorName, Grades minGrade, int year, Vector<Student> studentNames){
		//passed boolean and grade not given
		this(null, false, name, professorName, minGrade, year, studentNames);
	}
	public FinishedCourse(){
		//nothing given
		this(null, false, "", null, null, 0, null);
	}
	public FinishedCourse(Grades grade){
		//only grade given
		this(grade, false, "", null, null, 0, null);
	}
	public FinishedCourse(boolean passed){
		//only passed given
		this(null, passed, "", null, null, 0, null);
	}
	
	//getters
	public boolean getPassed(){
		//get passed field
		return _passed;
	}
	public Grades getGrade(){
		//get grade field
		return _grade;
	}
	
	//setters
	public void setPassed(boolean passed){
		//set passed field
		_passed = passed;
	}
	public void setGrade(Grades grade){
		//set grade field
		_grade = grade;
	}
}
