package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
	
	//getter
	public Vector<Person> getAllPersons(){
		return _allPersons;
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
	
	public void setData(String fileName){
		try{
		    File file = new File(fileName);

		    // if file doesn't exists, then create it
		    if (!file.exists()) {
		        file.createNewFile();
		    }

		    FileWriter fw = new FileWriter(file.getAbsoluteFile());
		    BufferedWriter bw = new BufferedWriter(fw);
		    for(int i = 0; i < _allPersons.size(); i++)
		    {
		    	//name
		    	bw.write(_allPersons.get(i).getName());
		    	//go to the next line
		    	bw.write('\n');
		    	//house
		    	bw.write(_allPersons.get(i).getHouse().getName());
		    	bw.write('\n');
		    	//students' count
		    	bw.write(String.valueOf(_allPersons.get(i).getBloodStatus()));
		    	bw.write('\n');
		    	//school
		    	bw.write(_allPersons.get(i).getSchool().getName());
		    	bw.write('\n');
		    	//birthday
		    	bw.write(_allPersons.get(i).getBirthday());
		    	bw.write('\n');
		    	//role
		    	bw.write(_allPersons.get(i).getRole());
		    	bw.write('\n');
		    	
		    	if(i < _allPersons.size() - 1)
		    	{
		    		bw.write('*');
		    		bw.write('\n');
		    	}
		    	else
		    		bw.write('$');
		    }
		    bw.close();
		    
		}catch(IOException e){
		    e.printStackTrace();
		}
	}
	
	//shows all people in the system
	public void showAllPersons(){
		for(int j = 0; j < _allPersons.size(); j++)
		{
			_person = _allPersons.get(j);
			System.out.println(j+1 + "- " + "Name: " + _person.getName() + '\n' + "House: "+ _person.getHouse().getName() + '\n' + "Blood-Status: " + _person.getBloodStatus() + '\n' + "School: " + _person.getSchool().getName() + '\n' + "Birthday: " + _person.getBirthday() + '\n' + "Role: " + _person.getRole());
			System.out.println("----------------------------------------");
		}
		
	}
}
