package entities;
import java.util.*;

public class School {
	//NOTE: fields are added according to the test case file.
	private String _name;
	private ArrayList<House> _houses;
	//if _houses is null, then the school is not housed
	private ArrayList<Course> _courses;
	private ArrayList<Integer> _years;
	private Vector<Student> _students;
	//the number of students in each school is the size of the studentNames vector
	private Vector<Professor> _professors;
	
	//constructors
	public School(String name, ArrayList<House> houses, ArrayList<Course> courses, ArrayList<Integer> years, Vector<Student> students, Vector<Professor> professors){
		_name = name;
		_houses = houses;
		_courses = courses;
		_years = years;
		_students = students;
		_professors= professors;
	}
	public School(String name){
		this(name, null, null, null, null, null);
	}
	public School(){
		this("", null, null, null, null, null);
	}
	
	//getters
	public String getName(){
		return _name;
	}
	public ArrayList<Integer> getYears(){
		return _years;
	}
	public ArrayList<House> getHouses(){
		return _houses;
	}
	public Vector<Student> getStudents(){
		return _students;
	}
	public Vector<Professor> getProfessors(){
		return _professors;
	}
	public ArrayList<Course> getCourses(){
		return _courses;
	}
	
	//setters
	public void setName(String name){
		_name = name;
	}
	public void setYears(ArrayList<Integer> years){
		_years = years;
	}
	public void setHouses(ArrayList<House> houses){
		_houses = houses;
	}
	public void setStudents(Vector<Student> students){
		_students = students;
	}
	public void setProfessors(Vector<Professor> professors){
		_professors = professors;
	}
	public void setCourses(ArrayList<Course> courses){
		_courses = courses;
	}
}
