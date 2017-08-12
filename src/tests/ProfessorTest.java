package tests;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import entities.Course;
import entities.Professor;

public class ProfessorTest {

	Professor snape;
	@Test
	public void getNotesTest() {
		//public Professor(Map<Integer, Course> courses, String notes, String name, String houseName, String bloodStatus, String school, Date birthday)  
		snape = new Professor("Extremely skilled at potions and Occlumency.");
		String actual = snape.getNotes();
		String expected = "Extremely skilled at potions and Occlumency.";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getCoursesTest() {
		//public Professor(Map<Integer, Course> courses, String notes, String name, String houseName, String bloodStatus, String school, Date birthday)  
	    Map<Integer, Course> courseMap = new HashMap<Integer, Course>(); 
	    Course potions = new Course("potions", "Severus Snape", 'C', 1995);
	    courseMap.put(1995, potions);
		snape = new Professor(courseMap);
		Map<Integer, Course> actual = snape.getCourses();
		Map<Integer, Course> expected = courseMap;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void setCoursesTest() {
	    Map<Integer, Course> courseMap = new HashMap<Integer, Course>(); 
	    Course potions = new Course("potions", "Severus Snape", 'C', 1995);
	    courseMap.put(1995, potions);
		snape = new Professor();
		snape.setCourses(courseMap);
		Map<Integer, Course> actual = snape.getCourses();
		Map<Integer, Course> expected = courseMap;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void setNotesTest() {
		snape = new Professor();
		snape.setNotes("Extremely skilled at potions and Occlumency.");
		String actual = snape.getNotes();
		String expected = "Extremely skilled at potions and Occlumency.";
		
		Assert.assertEquals(expected, actual);
	}
}
