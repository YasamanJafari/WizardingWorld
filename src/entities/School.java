package entities;
import java.util.*;

public class School {
	//NOTE: fields are added according to the test case file.
	private String _name;
	private ArrayList<String> _houseNames;
	private ArrayList<String> _courseNames;
	private ArrayList<Integer> _years;
	private Vector<String> _studentNames;
	private Vector<String> _professorNames;
	
	//constructors
	public School(String name, ArrayList<String> houseNames, ArrayList<String> courseNames, ArrayList<Integer> years, Vector<String> studentNames, Vector<String> professorNames){
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
	public ArrayList<String> getHouseNames(){
		return _houseNames;
	}
	public Vector<String> getStudentNames(){
		return _studentNames;
	}
	public Vector<String> getProfessorNames(){
		return _professorNames;
	}
	public ArrayList<String> getCourseNames(){
		return _courseNames;
	}
	
	//setters
	public void setName(String name){
		_name = name;
	}
	public void setYears(ArrayList<Integer> years){
		_years = years;
	}
	public void setHouseNames(ArrayList<String> houseNames){
		_houseNames = houseNames;
	}
	public void setStudentNames(Vector<String> studentNames){
		_studentNames = studentNames;
	}
	public void setProfessorNames(Vector<String> professorNames){
		_professorNames = professorNames;
	}
	public void setCourseNames(ArrayList<String> courseNames){
		_courseNames = courseNames;
	}
}
