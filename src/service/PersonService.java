package service;

import java.util.Vector;

import entities.House;
import entities.Person;

public class PersonService {
	private Person _person;
	private Vector<Person> _allPersons;
	
	//constructors
	public PersonService(Person person){
		_allPersons = new Vector<Person>();
		_person = person;
	}
	public PersonService(){
		this(null);
	}
}
