package tests;

import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import entities.Course;

public class CourseTest {
	Course flying;

	@Test
	public void studentsTest() 
	{
		flying = new Course("flying");
		Vector<String> students = new Vector<String>();
		students.add("Harry Potter");
		students.add("Ron Weasley");
		students.add("Hermoine Granger");
		students.add("Draco Malfoy");
		flying.setStudentNames(students);
		
		Vector<String> actual = flying.getStudentNames();
		Vector<String> expected = students;
		
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());
	}
	@Test
	public void getProfessorTest() {
		flying = new Course("flying", "Madame Hooch", 'O', 1996);
		String expected = "Madame Hooch";
		String actual = flying.getProfessorName();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getNameTest() {
		flying = new Course("flying", "Madame Hooch", 'O', 1996);
		String expected = "flying";
		String actual = flying.getName();
		
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void getMinGradeTest() {
		flying = new Course("flying", "Madame Hooch", 'O', 1996);
		char expected = 'O';
		char actual = flying.getMinGrade();
		
		Assert.assertEquals(expected, actual);

	}
	@Test
	public void setProfessorTest() {
		flying = new Course("Flying");
		flying.setProfessorName("Madame Hooch");
		String expected = "Madame Hooch";
		String actual = flying.getProfessorName();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void setNameTest() {
		flying = new Course("");
		flying.setName("Flying");
		String expected = "Flying";
		String actual = flying.getName();
		
		Assert.assertEquals(expected, actual);
		
	}
}
