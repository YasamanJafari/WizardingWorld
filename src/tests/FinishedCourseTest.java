package tests;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import entities.Course;
import entities.FinishedCourse;

public class FinishedCourseTest {
	FinishedCourse flying;
	
	@Test
	public void getPassedTest() {
		flying = new FinishedCourse(true);
		boolean actual = flying.getPassed();
		boolean expected = true;
		
		Assert.assertEquals(expected, actual);
	}

}
