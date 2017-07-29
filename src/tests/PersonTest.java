package tests;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Assert;
import org.junit.Test;

import entities.Person;

public class PersonTest {

	Person snape;
	@Test
	public void getNameTest()
	{
		snape = new Person("Severus Snape");
		
		String actual = snape.getName();
		String expected = "Severus Snape";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getHouseTest() throws ParseException
	{
		DateFormat formatter = new SimpleDateFormat("d-MM-yyyy"); 
		snape = new Person("Severus Snape", "Slytherin", "half-blood", "Hogwarts", formatter.parse("9-01-1960"));
		String actual = snape.getHouseName();
		String expected = "Slytherin";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getBloodStatusTest() throws ParseException
	{
		DateFormat formatter = new SimpleDateFormat("d-MM-yyyy"); 
		snape = new Person("Severus Snape", "Slytherin", "half-blood", "Hogwarts", formatter.parse("9-01-1960"));
		
		String actual = snape.getBloodStatus();
		String expected = "half-blood";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getSchoolTest() throws ParseException
	{
		DateFormat formatter = new SimpleDateFormat("d-MM-yyyy"); 
		snape = new Person("Severus Snape", "Slytherin", "half-blood", "Hogwarts", formatter.parse("9-01-1960"));		
		String actual = snape.getSchool();
		String expected = "Hogwarts";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void setNameTest()
	{
		snape = new Person("");
		snape.setName("Severus Snape");
		String actual = snape.getName();
		String expected = "Severus Snape";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void setHouseTest()
	{
		snape = new Person("Severus Snape");
		snape.setHouseName("Slytherin");
		String actual = snape.getHouseName();
		String expected = "Slytherin";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void setBloodStatusTest()
	{
		snape = new Person("Severus Snape");
		snape.setBloodStatus("Half-Blood");
		String actual = snape.getBloodStatus();
		String expected = "Half-Blood";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void setSchoolTest()
	{
		snape = new Person("Severus Snape");
		snape.setSchool("Hogwarts");
		String actual = snape.getSchool();
		String expected = "Hogwarts";
		
		Assert.assertEquals(expected, actual);
	}

}
