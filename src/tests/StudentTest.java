package tests;

import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import entities.Course;
import entities.FinishedCourse;
import entities.Grades;
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
	
	@Test
	public void getReportCardTest() {
		Vector <Course> courses = new Vector<Course>();
		Vector <FinishedCourse> finishedCourses = new Vector<FinishedCourse>();
	    Course potions = new Course("potions", "Severus Snape", 'C', 1995);
	    //	public FinishedCourse(Grades grade, boolean passed, String name, String professorName, char minGrade, int year, Vector<String> studentNames){
	    FinishedCourse flying = new FinishedCourse(Grades.O, true, "flying", "Madame Hooch", 'A', 1996, null);
	    finishedCourses.add(flying);
	    courses.add(potions);
	    
		harry = new Student(courses, finishedCourses, "harry");
		Vector<FinishedCourse> actual = harry.getReportCard();
		Vector<FinishedCourse> expected = finishedCourses;
		
		Assert.assertEquals(expected, actual);
	}
}
