package entities;
import java.util.*;

public class Person {
	//fields
	private String _name;
	private String _houseName;
	private String _bloodStatus;
	private String _school;
	private Date _birthday;
	
	//constructors
	public Person(String name, String houseName, String bloodStatus, String school, Date birthday){
		_name = name;
		_houseName = houseName;
		_bloodStatus = bloodStatus;
		_school = school;
		_birthday = birthday;
	}
	public Person(String name, String houseName, String bloodStatus, String school){
		this(name, houseName, bloodStatus, school, null);
	}
	public Person(String name){
		this(name, "", "", "", null);
	}
	public Person(){
		this("", "", "", "", null);
	}
	
	//getters
	public String getName(){
		return _name;
	}
	public String getHouseName(){
		return _houseName;
	}
	public String getBloodStatus(){
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
	public void setHouseName(String houseName){
		_houseName = houseName;
	}
	public void setBloodStatus(String bloodStatus){
		_bloodStatus = bloodStatus;
	}
	public void setSchool(String school){
		_school = school;
	}
	public void setBirthday(Date birthday){
		_birthday = birthday;
	}
}
