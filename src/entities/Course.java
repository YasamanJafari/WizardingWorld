package entities;
import java.util.*;

public class Course {
	//fields
	private String _name;
	private Professor _professor;
	private Grades _minGrade;
	private int _year;
	private Vector<Student> _students;
	
	//constructors
	public Course(String name, Professor professor, Grades minGrade, int year, Vector<Student> students){
		_name = name;
		_professor = professor;
		_minGrade = minGrade;
		_year = year;
		_students = students;
	}
	public Course(String name, Professor professor, Grades minGrade, int year){
		this(name, professor, minGrade, year, new Vector<Student>());
	}
	public Course(String name){
		this(name, new Professor(), Grades.A, 0, new Vector<Student>());
	}
	public Course(){
		this("", new Professor(), Grades.A, 0, new Vector<Student>());
	}
	
	//getters
	public String getName(){
		return _name;
	}
	public Professor getProfessor(){
		return _professor;
	}
	public Grades getMinGrade(){
		return _minGrade;
	}
	public int getYear(){
		return _year;
	}
	public Vector<Student> getStudents(){
		return _students;
	}
	
	//setters
	public void setName(String name){
		_name = name;
	}
	public void setProfessor(Professor professor){
		_professor = professor;
	}
	public void setMinGrade(Grades minGrade){
		_minGrade = minGrade;
	}
	public void setYear(int year){
		_year = year;
	}
	public void setStudents(Vector<Student> students){
		_students = students;
	}
}
