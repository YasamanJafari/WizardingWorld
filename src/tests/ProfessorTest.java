package tests;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
}
