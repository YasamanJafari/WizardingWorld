package entities;
import java.util.*;

public class Course {
	//fields
	private String _name;
	private Professor _professorName;
	private Grades _minGrade;
	private int _year;
	private Vector<Student> _studentNames;
	
	//constructors
	public Course(String name, Professor professorName, Grades minGrade, int year, Vector<Student> studentNames){
		_name = name;
		_professorName = professorName;
		_minGrade = minGrade;
		_year = year;
		_studentNames = studentNames;
	}
	public Course(String name, Professor professorName, Grades minGrade, int year){
		this(name, professorName, minGrade, year, null);
	}
	public Course(String name){
		this(name, null, null, 0, null);
	}
	public Course(){
		this("", null, null, 0, null);
	}
	
	//getters
	public String getName(){
		return _name;
	}
	public Professor getProfessorName(){
		return _professorName;
	}
	public Grades getMinGrade(){
		return _minGrade;
	}
	public int getYear(){
		return _year;
	}
	public Vector<Student> getStudentNames(){
		return _studentNames;
	}
	
	//setters
	public void setName(String name){
		_name = name;
	}
	public void setProfessorName(Professor professorName){
		_professorName = professorName;
	}
	public void setMinGrade(Grades minGrade){
		_minGrade = minGrade;
	}
	public void setYear(int year){
		_year = year;
	}
	public void setStudentNames(Vector<Student> studentNames){
		_studentNames = studentNames;
	}
}
