package entities;
import java.util.*;

public class School {
	//NOTE: fields are added according to the test case file.
	private String _name;
	private ArrayList<House> _houseNames;
	//if _houseNames is null, then the school is not housed
	private ArrayList<Course> _courseNames;
	private ArrayList<Integer> _years;
	private Vector<Student> _studentNames;
	//the number of students in each school is the size of the studentNames vector
	private Vector<Professor> _professorNames;
	
	//constructors
	public School(String name, ArrayList<House> houseNames, ArrayList<Course> courseNames, ArrayList<Integer> years, Vector<Student> studentNames, Vector<Professor> professorNames){
		_name = name;
		_houseNames = houseNames;
		_courseNames = courseNames;
		_years = years;
		_studentNames = studentNames;
		_professorNames= professorNames;
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
	public ArrayList<House> getHouseNames(){
		return _houseNames;
	}
	public Vector<Student> getStudentNames(){
		return _studentNames;
	}
	public Vector<Professor> getProfessorNames(){
		return _professorNames;
	}
	public ArrayList<Course> getCourseNames(){
		return _courseNames;
	}
	
	//setters
	public void setName(String name){
		_name = name;
	}
	public void setYears(ArrayList<Integer> years){
		_years = years;
	}
	public void setHouseNames(ArrayList<House> houseNames){
		_houseNames = houseNames;
	}
	public void setStudentNames(Vector<Student> studentNames){
		_studentNames = studentNames;
	}
	public void setProfessorNames(Vector<Professor> professorNames){
		_professorNames = professorNames;
	}
	public void setCourseNames(ArrayList<Course> courseNames){
		_courseNames = courseNames;
	}
}
