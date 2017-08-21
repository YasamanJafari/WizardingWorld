package entities;

public class Person {
	//fields
	private String _name;
	private House _house;
	private BloodStatus _bloodStatus;
	private School _school;
	private String _birthday;
	private String _role;
	
	//constructors
	public Person(String name, House house, BloodStatus bloodStatus, School school, String birthday){
		_name = name;
		_house = house;
		_bloodStatus = bloodStatus;
		_school = school;
		_birthday = birthday;
	}
	public Person(String name, House house, BloodStatus bloodStatus, School school){
		this(name, house, bloodStatus, school, "");
	}
	public Person(String name){
		this(name, null, null, null, "");
	}
	public Person(){
		this("", null, null, null, "");
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
	public School getSchool(){
		return _school;
	}
	public String getBirthday(){
		return _birthday;
	}
	public String getRole(){
		return _role;
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
	public void setSchool(School school){
		_school = school;
	}
	public void setBirthday(String birthday){
		_birthday = birthday;
	}
	
	public void setRole(String role){
		_role = role;
	}
}
