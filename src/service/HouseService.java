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
	
	public void getData(String fileName){
		BufferedReader br = null;
		FileReader fr = null;
	
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
		    	bw.write(String.valueOf(_allHouses.get(i).getStudents().size()));
		    	bw.write('\n');
		    	//list students
		    	for(int j = 0; j < _allHouses.get(i).getStudents().size(); j++){
			    	bw.write(_allHouses.get(i).getStudents().get(j).getName());
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
}
