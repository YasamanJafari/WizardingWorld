package tests;

import org.junit.Assert;
import org.junit.Test;

import entities.FinishedCourse;
import entities.Grades;

public class FinishedCourseTest {
	FinishedCourse flying;
	
	@Test
	public void getPassedTest() {
		flying = new FinishedCourse(true);
		boolean actual = flying.getPassed();
		boolean expected = true;
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void getGradesTest() {
		flying = new FinishedCourse(Grades.O);
		Grades actual = flying.getGrade();
		Grades expected = Grades.O;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void setPassedTest() {
		flying = new FinishedCourse();
		flying.setPassed(true);
		boolean actual = flying.getPassed();
		boolean expected = true;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void setGradeTest() {
		flying = new FinishedCourse();
		flying.setGrade(Grades.P);
		Grades actual = flying.getGrade();
		Grades expected = Grades.P;
		
		Assert.assertEquals(expected, actual);
	}
}
