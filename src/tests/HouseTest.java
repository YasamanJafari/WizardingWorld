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

	@Test
	public void getSchoolTest() {
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
		
		School actual = gryffindor.getSchool();
		School expected = hogwarts;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getStudentsTest() {
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
		
		Vector<Student> actual = gryffindor.getStudents();
		Vector<Student> expected = students;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getHeadTeacherTest() {
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
		
		Professor actual = gryffindor.getHeadTeacher();
		Professor expected = mcGonagall;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getQualitiesTest() {
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
		
		ArrayList<String> actual = gryffindor.getQualities();
		ArrayList<String> expected = qualities;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getPrefectsTest() {
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
		
		Map<Integer, Student> actual = gryffindor.getPrefects();
		Map<Integer, Student> expected = prefectsMap;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void setNameTest() {
		//public House(String name, School school, Vector<Student> students, Professor headTeacher, ArrayList<String> qualities, Map<Integer, Student> prefects);
		gryffindor = new House();
		
		gryffindor.setName("Gryffindor");
		String actual = gryffindor.getName();
		String expected = "Gryffindor";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void setSchoolTest() {
		//public House(String name, School school, Vector<Student> students, Professor headTeacher, ArrayList<String> qualities, Map<Integer, Student> prefects);
		gryffindor = new House();
		
		School hogwarts= new School("Hogwarts");
		gryffindor.setSchool(hogwarts);
		School actual = gryffindor.getSchool();
		School expected = hogwarts;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void setStudentsTest() {
		//public House(String name, School school, Vector<Student> students, Professor headTeacher, ArrayList<String> qualities, Map<Integer, Student> prefects);
		gryffindor = new House();
		Vector<Student> students = new Vector<Student>();
		Student harry = new Student("Harry Potter");
		students.add(harry);
		
		gryffindor.setStudents(students);
		Vector<Student> actual = gryffindor.getStudents();
		Vector<Student> expected = students;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void setHeadTeacherTest() {
		//public House(String name, School school, Vector<Student> students, Professor headTeacher, ArrayList<String> qualities, Map<Integer, Student> prefects);
		gryffindor = new House();
		Professor mcGonagall = new Professor("Minerva McGonagall", "Animagus (distinctively marked silver tabby cat).");
		
		gryffindor.setHeadTeacher(mcGonagall);
		Professor actual = gryffindor.getHeadTeacher();
		Professor expected = mcGonagall;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void setQualitiesTest() {
		//public House(String name, School school, Vector<Student> students, Professor headTeacher, ArrayList<String> qualities, Map<Integer, Student> prefects);
		gryffindor = new House();
		ArrayList<String> qualities = new ArrayList<String>();
		qualities.add("Courage");
		
		gryffindor.setQualities(qualities);
		ArrayList<String> actual = gryffindor.getQualities();
		ArrayList<String> expected = qualities;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void setPrefectsTest() {
		//public House(String name, School school, Vector<Student> students, Professor headTeacher, ArrayList<String> qualities, Map<Integer, Student> prefects);
		gryffindor = new House();
	    Map<Integer, Student> prefectsMap = new HashMap<Integer, Student>(); 
	    Student prefect = new Student("Someone");
	    prefectsMap.put(1986, prefect);
		
		gryffindor.setPrefects(prefectsMap);
		Map<Integer, Student> actual = gryffindor.getPrefects();
		Map<Integer, Student> expected = prefectsMap;
		
		Assert.assertEquals(expected, actual);
	}
}
