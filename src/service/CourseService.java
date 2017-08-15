package service;

import entities.Course;

public class CourseService {
	private Course _course; 	//The course the services are performed on/at
	
	//constructors
	public CourseService(Course course){
		_course = course;
	}
	public CourseService(){
		this(null);
	}
	
	//getters
	public Course getCourse(){
		return _course;		//get the course field of the class
	}
	
	//setter
	public void setCourse(Course course){
		_course = course;
	}
}
