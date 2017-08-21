package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import entities.BloodStatus;
import entities.House;
import entities.Person;
import entities.School;

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
	
	public void getData(String fileName){
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			//br = new BufferedReader(new FileReader(fileName));
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String line;
			// each new house which is read from file is temporarily stored in newCourse
			_person = new Person();
			//the number of houses read
			int personNum = 0;

			//while there are lines, read them!
			while ((line = br.readLine()) != null && line.length() != 0) {
				// end of each house info is with "*"
				if(line.charAt(0) == '*'){
					//indicates the beginning of a new course
					if(personNum != 0){
						//add the last course to the vector of allCourses
						_allPersons.add(_person);
						//System.out.println("Name:" + newStudent.getName() + "year : " + newStudent.getBirthday() + " school :" + newStudent.getSchool().getName() + " house :" + newStudent.getHouse().getName() + "blood : " + newStudent.getBloodStatus());
					}
					_person = new Person();
					continue;
				}
				
				else if(line.charAt(0) == '$'){
					if(personNum != 0){
						//add the last course to the vector of allCourses
						_allPersons.add(_person);
					}
					break;
				}
				//read name
				_person.setName(line);
				personNum++;
				//read house
				_person.setHouse(new House(br.readLine()));
				//read bloodStatus
				_person.setBloodStatus(BloodStatus.valueOf(br.readLine()));
				//read school
				_person.setSchool(new School(br.readLine()));
				//read birthday
				_person.setBirthday(br.readLine());
				//read role
				_person.setRole(br.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (br != null)
					br.close();

				if (fr != null)
					fr.close();
				
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
