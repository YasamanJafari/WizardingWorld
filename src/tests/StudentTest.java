package tests;

import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import entities.Course;
import entities.Student;

public class StudentTest {

	Student harry;
	@Test
	public void getCoursesTest() {
		Vector <Course> courses = new Vector<Course>();
	    Course potions = new Course("potions", "Severus Snape", 'C', 1995);
	    courses.add(potions);
		harry = new Student(courses);
		Vector<Course> actual = harry.getCourses();
		Vector<Course> expected = courses;
		
		Assert.assertEquals(expected, actual);
	}
}
