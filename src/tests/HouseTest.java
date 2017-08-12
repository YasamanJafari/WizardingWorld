package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import entities.Course;
import entities.House;
import entities.Professor;
import entities.School;
import entities.Student;

public class HouseTest {

	House gryffindor;
	@Test
	public void getNameTest() {
		//public House(String name, School school, Vector<Student> students, Professor headTeacher, ArrayList<String> qualities, Map<Integer, Student> prefects);
		School hogwarts= new School("Hogwarts");
		Vector<Student> students = new Vector<Student>();
		Student harry = new Student("Harry Potter");
		students.add(harry);
		Professor mcGonagall = new Professor("Minerva McGonagall", "Animagus (distinctively marked silver tabby cat).");
		ArrayList<String> qualities = new ArrayList<String>();
		qualities.add("Courage");
	    Map<Integer, Student> prefectsMap = new HashMap<Integer, Student>(); 
	    Student prefect = new Student("Someone");
	    prefectsMap.put(1986, prefect);
		gryffindor = new House("Gryffindor", hogwarts, students, mcGonagall, qualities, prefectsMap);
		
		String actual = gryffindor.getName();
		String expected = "Gryffindor";
		
		Assert.assertEquals(expected, actual);
	}

}
