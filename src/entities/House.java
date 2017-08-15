package entities;

import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;

public class House {
	private String _name; //House name
	private School _school; //The school that has this house
	private Vector<Student> _students; //List of students in the house
	private Professor _headTeacher; //The house's head teacher
	private ArrayList<String> _qualities; //The list of qualities that are required to be in the house
	private Map<Integer, Student> _prefects; //The list of prefects of the house per year
	
	//constructors
	public House(String name, School school, Vector<Student> students, Professor headTeacher, ArrayList<String> qualities, Map<Integer, Student> prefects){
		_name = name;
		_school = school;
		_students = students;
		_headTeacher = headTeacher;
		_qualities = qualities;
		_prefects = prefects;
	}
	public House(String name, School school){
		//only name and school given
		this(name, school, null, null, null, null);
	}
	public House(String name){
		//only name given
		this(name, null, null, null, null, null);
	}
	public House(){
		//nothing given
		this("", null, null, null, null, null);
	}
	
	//getters
	public String getName(){
		//get name field
		return _name;
	}
	public School getSchool(){
		//get school field
		return _school;
	}
	public Vector<Student> getStudents(){
		//get students field
		return _students;
	}
	public Professor getHeadTeacher(){
		//get headTeacher field
		return _headTeacher;
	}
	public ArrayList<String> getQualities(){
		//get qualities field
		return _qualities;
	}
	public Map<Integer, Student> getPrefects(){
		//get prefects field
		return _prefects;
	}
	
	//setters
	public void setName(String name){
		//set the field of name
		_name = name;
	}
	public void setSchool(School school){
		//set the field of school
		_school = school;
	}
	public void setStudents(Vector<Student> students){
		//set the field of students
		_students = students;
	}
	public void setHeadTeacher(Professor headTeacher){
		//set the field of headTeacher
		_headTeacher = headTeacher;
	}
	public void setQualities(ArrayList<String> qualities){
		//set the field of qualities
		_qualities = qualities;
	}
	public void setPrefects(Map<Integer, Student> prefects){
		//set the field of prefects
		_prefects = prefects;
	}
	
	//add a new student to house 
	public void addStudent(Student student){
		_students.add(student);
	}
}
