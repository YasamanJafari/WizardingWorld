package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import entities.House;
import entities.School;
import entities.Student;

public class HouseService {
	private House _house;
	private Vector<House> _allHouses;
	
	//constructors
	public HouseService(House house){
		_allHouses = new Vector<House>();
		_house = house;
	}
	public HouseService(){
		this(null);
	}
	
	//getter
	public Vector<House> getAllHouses(){
		return _allHouses;
	}
	
	public void getData(String fileName){
		BufferedReader br = null;
		FileReader fr = null;
		
		_allHouses = new Vector<House>();
	
		//num of students of a house
		int studentCount = 0;
		Vector<Student> newStudents = new Vector<Student>();
		
		try {
			//br = new BufferedReader(new FileReader(fileName));
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String line;
			// each new house which is read from file is temporarily stored in newCourse
			_house = new House();
			//the number of houses read
			int houseNum = 0;

			//while there are lines, read them!
			while ((line = br.readLine()) != null && line.length() != 0) {
				// end of each house info is with "*"
				if(line.charAt(0) == '*'){
					//indicates the beginning of a new course
					if(houseNum != 0){
						//add the last course to the vector of allCourses
						_allHouses.add(_house);
						//System.out.println("Name:" + newStudent.getName() + "year : " + newStudent.getBirthday() + " school :" + newStudent.getSchool().getName() + " house :" + newStudent.getHouse().getName() + "blood : " + newStudent.getBloodStatus());
					}
					newStudents = new Vector<Student>();
					_house = new House();
					continue;
				}
				
				else if(line.charAt(0) == '$'){
					if(houseNum != 0){
						//add the last course to the vector of allCourses
						_allHouses.add(_house);
						
					}
					break;
				}
				//read name
				_house.setName(line);
				houseNum++;
				//read school
				_house.setSchool(new School(br.readLine()));
				//read students' count
				try {
					studentCount = (Integer.parseInt(br.readLine()));
				} catch (Exception e) {
					e.printStackTrace();
				}
				//read students
				for(int i = 0; i < studentCount; i++){
					Student newStudent = new Student(br.readLine());
					newStudents.add(newStudent);
				}
				_house.setStudents(newStudents);
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
		    for(int i = 0; i < _allHouses.size(); i++)
		    {
		    	//name
		    	bw.write(_allHouses.get(i).getName());
		    	//go to the next line
		    	bw.write('\n');
		    	//school
		    	bw.write(_allHouses.get(i).getSchool().getName());
		    	bw.write('\n');
		    	//students' count
		    	if(_allHouses.get(i).getStudents() != null){
			    	bw.write(String.valueOf(_allHouses.get(i).getStudents().size()));
			    	bw.write('\n');
			    	//list students
			    	for(int j = 0; j < _allHouses.get(i).getStudents().size(); j++){
				    	bw.write(_allHouses.get(i).getStudents().get(j).getName());
				    	bw.write('\n');
			    	}
		    	}
		    	else{
			    	bw.write('0');
			    	bw.write('\n');
		    	}
		    	
		    	if(i < _allHouses.size() - 1)
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
	
	//shows all Houses in the system
	public void showAllHouses(){
		
		for(int j = 0; j < _allHouses.size(); j++){
			_house = _allHouses.get(j);
			System.out.println(j+1 + "- " + "Name: " + _house.getName() + '\n' + "School: "+ _house.getSchool().getName());
			System.out.println("Students count: " + _house.getStudents().size());
			for(int i = 0; i < _house.getStudents().size(); i++){
				System.out.println(_house.getStudents().get(i).getName());
			}
			System.out.println("----------------------------------------");
		}
	}
	
	//return the House type of the given name
	public House getHouseByName(String name) throws Exception{
		//search through all houses
		for(int i = 0; i < _allHouses.size(); i++){
			//if the names are the same
			if(_allHouses.get(i).getName().equals(name)){
				return _allHouses.get(i);
			}
		}
		//if houses does not exist
		throw new Exception("House with the given name does not exist.");
	}
	
	//shows info of a house in the system, if does not exist, doesn't show anything
	public void showHouse(String name){
		for(int j = 0; j < _allHouses.size(); j++){
			if(_allHouses.get(j).getName().equals(name)){
				_house = _allHouses.get(j);
				System.out.println("Name: " + _house.getName() + '\n' + "School: "+ _house.getSchool().getName());
				System.out.println("Students count: " + _house.getStudents().size());
				for(int i = 0; i < _house.getStudents().size(); i++){
					System.out.println(_house.getStudents().get(i).getName());
				}
			}
		}
	}
	
	//create the new house in both dataBase and systems
	public void createNewHouse(House newHouse){
		this.getData("HouseDB.txt");
		//update system
		_allHouses.add(newHouse);
		//update dataBase
		this.setData("HouseDB.txt");
	}
	
	//delete the specified house
	public void deleteHouse(House house){
		for(int i = 0; i < _allHouses.size(); i++){
			if(house.equals(_allHouses.get(i))){
				_allHouses.remove(i);
				break;
			}
		}
		this.setData("HouseDB.txt");
	}
	
	//edit a specified house
	public void editHouse(House editedHouse, String currentName){
		for(int i = 0; i < _allHouses.size(); i++){
			if(_allHouses.get(i).getName().equals(currentName)){
				this.deleteHouse(_allHouses.get(i));
				break;
			}
		}
		this.createNewHouse(editedHouse);
	}
	
	//This method is like the showHouse method, but it only finds the house.
	public House searchByName(String name) throws Exception{
		for(int i = 0; i < _allHouses.size(); i++){
			//if the names are the same
			if(_allHouses.get(i).getName().equals(name)){
				return _allHouses.get(i);
			}
		}
		//if houses does not exist
		throw new Exception("House with the given name does not exist.");
	}
}
