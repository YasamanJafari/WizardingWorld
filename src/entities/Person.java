package entities;
import java.util.*;

public class Person {
	//fields
	private String _name;
	private House _house;
	private BloodStatus _bloodStatus;
	private String _school;
	private Date _birthday;
	
	//constructors
	public Person(String name, House house, BloodStatus bloodStatus, String school, Date birthday){
		_name = name;
		_house = house;
		_bloodStatus = bloodStatus;
		_school = school;
		_birthday = birthday;
	}
	public Person(String name, House house, BloodStatus bloodStatus, String school){
		this(name, house, bloodStatus, school, null);
	}
	public Person(String name){
		this(name, null, null, "", null);
	}
	public Person(){
		this("", null, null, "", null);
	}
	
	//getters
	public String getName(){
		return _name;
	}
	public House getHouse(){
		return _house;
	}
	public BloodStatus getBloodStatus(){
		return _bloodStatus;
	}
	public String getSchool(){
		return _school;
	}
	public Date getBirthday(){
		return _birthday;
	}
	
	//setters
	public void setName(String name){
		_name = name;
	}
	public void setHouse(House house){
		_house = house;
	}
	public void setBloodStatus(BloodStatus bloodStatus){
		_bloodStatus = bloodStatus;
	}
	public void setSchool(String school){
		_school = school;
	}
	public void setBirthday(Date birthday){
		_birthday = birthday;
	}
}
