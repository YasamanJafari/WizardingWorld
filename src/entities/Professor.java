package entities;
import java.util.*;

public class Professor extends Person{
	private Map<Integer, Course> _courses;
	private String _notes;
	
	//constructor
	public Professor(Map<Integer, Course> courses, String notes, String name, House houseName, BloodStatus bloodStatus, School school, String birthday){
		//calling the parent's constructor
		super(name, houseName, bloodStatus, school, birthday);
		_courses = courses;
		_notes = notes;
	}
	public Professor(Map<Integer, Course> courses, String name, House houseName, BloodStatus bloodStatus, School school, String birthday){
		//if notes is not given
		this(courses, "", name, houseName, bloodStatus, school, birthday);
	}
	public Professor(String notes, String name, House houseName, BloodStatus bloodStatus, School school, String birthday){
		//if courses is not given
		this(null, notes, name, houseName, bloodStatus, school, birthday);
	}
	public Professor(String name, House houseName, BloodStatus bloodStatus, School school, String birthday){
		//if courses and notes are not given
		this(null, "", name, houseName, bloodStatus, school, birthday);
	}
	public Professor(Map<Integer, Course> courses){
		//parent's fields and notes are not given
		this(courses, "", "", null, null, null, "");
	}
	public Professor(String name){
		// parent's fields and courses are not given
		this(null, "", name, null, null, null, "");
	}
	public Professor(Map<Integer, Course> courses, String notes){
		//parent's fields are not given 
		this(courses, notes, "", null, null, null, "");
	}
	public Professor(Map<Integer, Course> courses, String notes, String name){
		//parent's fields are not given except name
		this(courses, notes, name, null, null, null, "");
	}
	public Professor(String name, String notes){
		//only name and notes are given
		this(null, notes, name, null, null, null, "");
	}
	public Professor(){
		//nothing is given!!
		this(null, "", "", null, null, null, "");
	}
	
	//getters
	public String getNotes(){
		//get the notes field
		return _notes;
	}
	public Map<Integer, Course> getCourses(){
		//get the courses field
		return _courses;
	}
	
	//setters
	public void setNotes(String notes){
		//set the notes field
		_notes = notes;
	}
	public void setCourses(Map<Integer, Course> courses){
		//set the courses field
		_courses = courses;
	}
}

