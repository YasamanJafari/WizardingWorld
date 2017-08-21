package entities;

import java.util.Vector;

public class Student extends Person{
	private Vector<Course> _courses;
	private Vector<FinishedCourse> _reportCard;
	
	//constructor
	public Student(Vector<Course> courses, Vector<FinishedCourse> reportCard, String name, House houseName, BloodStatus bloodStatus, School school, String birthday){
		//calling the parent's constructor
		super(name, houseName, bloodStatus, school, birthday);
		_courses = courses;
		_reportCard = reportCard;
	}
	public Student(Vector <Course> courses, String name, House houseName, BloodStatus bloodStatus, School school, String birthday){
		//if reportCard not given
		this(courses, null, name, houseName, bloodStatus, school, birthday);
	}

	public Student(String name, House houseName, BloodStatus bloodStatus, School school, String birthday){
		//if courses and reportCard not given
		this(null, null, name, houseName, bloodStatus, school, birthday);
	}
	public Student(Vector<Course> courses){
		//parent's fields and reportCard not given
		this(courses, null, "", null, null, null, null);
	}
	public Student(Vector<Course> courses, Vector<FinishedCourse> reportCard){
		//parent's fields are not given 
		this(courses, reportCard, "", null, null, null, "");
	}
	public Student(Vector<Course> courses, Vector<FinishedCourse> reportCard, String name){
		//parent's fields are not given except name
		this(courses, reportCard, name, null, null, null, "");
	}
	public Student(String name){
		//only name is given
		this(null, null, name, null, null, null, "");
	}
	public Student(){
		//nothing is given!!
		this(null, null, "", null, null, null, "");
	}
	
	//getters
	public Vector<FinishedCourse> getReportCard(){
		//get the reportCard field
		return _reportCard;
	}
	public Vector<Course> getCourses(){
		//get the courses field
		return _courses;
	}
	
	//setters
	public void setReportCard(Vector<FinishedCourse> reportCard){
		//set the reportCard field
		_reportCard = reportCard;
	}
	public void setCourses(Vector<Course> courses){
		//set the courses field
		_courses = courses;
	}
}
