package entities;
import java.util.*;

public class Course {
	//fields
	private String _name;
	private String _professorName;
	private char _minGrade;
	private int _year;
	private Vector<String> _studentNames;
	
	//constructors
	public Course(String name, String professorName, char minGrade, int year, Vector<String> studentNames){
		_name = name;
		_professorName = professorName;
		_minGrade = minGrade;
		_year = year;
		_studentNames = studentNames;
	}
	public Course(String name, String professorName, char minGrade, int year){
		this(name, professorName, minGrade, year, null);
	}
	public Course(String name){
		this(name, "", '0', 0, null);
	}
	public Course(){
		this("", "", '0', 0, null);
	}
	
	//getters
	public String getName(){
		return _name;
	}
	public String getProfessorName(){
		return _professorName;
	}
	public char getMinGrade(){
		return _minGrade;
	}
	public int getYear(){
		return _year;
	}
	public Vector<String> getStudentNames(){
		return _studentNames;
	}
	
	//setters
	public void setName(String name){
		_name = name;
	}
	public void setProfessorName(String professorName){
		_professorName = professorName;
	}
	public void setMinGrade(char minGrade){
		_minGrade = minGrade;
	}
	public void setYear(int year){
		_year = year;
	}
	public void setStudentNames(Vector<String> studentNames){
		_studentNames = studentNames;
	}
}
