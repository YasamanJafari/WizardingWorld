package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Vector;

import entities.*;

public class SchoolService {
	private School _school;	//The school the services are performed on/at
	private Vector<School> allSchools; //All the schools in the system
	
	//constructors
	public SchoolService(School school){
		allSchools = new Vector<School>();
		_school = school;
	}
	public SchoolService(){
		this(null);
	}
	
	//getters
	public School getSchool(){
		return _school;		//get the school field of the class
	}
	
	//setter
	public void setSchool(School school){
		_school = school;
	}
	
	public House sortingHat(Student student){
		int score = 0;
		int result = 0;
		//Instruction on how to answer the questions.
		System.out.println("Please answer the following questions(only enter the number of your answer.)");
		//creating the question list in order to sort students in their appropriate houses.
		ArrayList<String> questions = new ArrayList<String>();
		//question 1
		questions.add("You would be most hurt if a person called you... 1.Weak   2.Ignorant   3.Unkind   4.Coward");
		//question 2
		questions.add("What would you see in the Mirror of Erised? 1.Myself, surrounded by riches. 2.Myself, knowledgable above all. 3.Myself, surrounded by my loving family and friends.	4.Myself, experiencing a marvellous adventure.");
		//question 3
		questions.add("Which potion would you drink? 1.Power potion. 2.Wisdom potion. 3.Love potion.	4.Glory potion.");
		//question 4
		questions.add("And finally: We know that the Sorting Hat takes into account your preferences. So which Hogwarts house do you feel you identify with most closely? 1.Slytherin	2.Ravenclaw	 3.Hufflepuff	4.Gryffindor");
		
		for(int i = 0; i < questions.size(); i++){
			System.out.println(questions.get(i));
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			try {
				result = Integer.parseInt(br.readLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
			 //check the validity of answer.
			 if(result > 0 && result < 5)
				 score += result;
			 //if answer is not valid, then repeat the question
			 else{
				 //show an error message to the user
				 System.out.println("The answer is not valid, you must answer again.");
				 //returning to the previous question in the list
				 i--;
				 continue;
			 }
		}
		

		//evaluating the result of the test
		if(score > questions.size() && score < questions.size()*2 - 1){
			for(int i = 0; i < _school.getHouses().size(); i++){
				if(_school.getHouses().get(i).getName() == "Slytherin"){
					return _school.getHouses().get(i);
				}
			}
		}
		
		else if(score > questions.size()*2 - 2 && score < questions.size()*3 - 1){
			for(int i = 0; i < _school.getHouses().size(); i++){
				if(_school.getHouses().get(i).getName() == "Ravenclaw"){
					return _school.getHouses().get(i);
				}
			}
		}
		
		else if(score > questions.size()*3 - 2 && score < questions.size()*4 - 1){
			for(int i = 0; i < _school.getHouses().size(); i++){
				if(_school.getHouses().get(i).getName() == "Hufflepuff"){
					return _school.getHouses().get(i);
				}
			}
		}
		
		else{
			for(int i = 0; i < _school.getHouses().size(); i++){
				if(_school.getHouses().get(i).getName() == "Gryffindor"){
					return _school.getHouses().get(i);
				}
			}
		}
		
		return new House("Non-Hogwarts House");
	}
	
	public void getData(String fileName){
		BufferedReader br = null;
		FileReader fr = null;
		
		try {

			//br = new BufferedReader(new FileReader(fileName));
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String line;
			//the line number we are in while reading each school info
			int lineNum = 1;
			//number of houses(read at the second line of each school info)
			int houseCount = 0;
			//number of courses
			int courseCount = 0;
			//number of students
			int studentCount = 0;
			// each new school which is read from file is temporarily stored in newSchool
			School newSchool = new School();
			int schoolCount = 0;

			//while there are lines, read them!
			while ((line = br.readLine()) != null && line.length() != 0) {
				// end of each school info is with "*"
				if(line.charAt(0) == '*'){
					//indicates the beginning of a new school
					lineNum = 0;
					houseCount = 0;
					courseCount = 0;
					studentCount = 0;
					if(schoolCount != 0){
						//add the last school to the vector of allSchools
						allSchools.add(newSchool);
						//System.out.println("Name:" + newSchool.getName() + " Students.count :" + newSchool.getStudents().size() + " Professor.count :" + newSchool.getProfessors().size() + "Houses.count" + newSchool.getHouses().size());
					}
					newSchool = new School();
					lineNum++;
					continue;
				}
				
				else if(line.charAt(0) == '$'){
					if(schoolCount != 0){
						//add the last school to the vector of allSchools
						allSchools.add(newSchool);
					}
				}
				
				//read name
				if(lineNum == 1)
				{
					newSchool.setName(line);
					schoolCount++;
					newSchool.setCourses(new ArrayList<Course>());
					newSchool.setStudents(new Vector<Student>());
					newSchool.setProfessors(new Vector<Professor>());
				}
				
				//read houses
				else if(lineNum == 2 && !line.equals('0')){
					ArrayList<House> newHouses = new ArrayList<House>();
					//if houses exist, read them
					try {
						houseCount = Integer.parseInt(line);
					} catch (Exception e) {
						e.printStackTrace();
					}
					//System.out.println("houseCount: " + line);
					for(int i = 0; i < houseCount; i++){
						House newHouse = new House(br.readLine());					
						//System.out.println("School: " + newSchool.getName() + "House " + i + " : " + newHouse.getName());
						newHouses.add(newHouse);
					}
					newSchool.setHouses(newHouses);
					lineNum += houseCount;
				}
				
				else if(lineNum == 2 + houseCount + 1 && !line.equals('0')){
					ArrayList<Course> newCourses = new ArrayList<Course>();
					//if courses exist, read them
					try {
						courseCount = Integer.parseInt(line);
					} catch (Exception e) {
						e.printStackTrace();
					}
					for(int i = 0; i < courseCount; i++){
						Course newCourse = new Course(br.readLine());
						newCourses.add(newCourse);
					}
					newSchool.setCourses(newCourses);
					lineNum += courseCount;
				}
				
				else if(lineNum == 2 + houseCount + courseCount + 2 && !line.equals('0')){
					Vector<Student> newStudents = new Vector<Student>();
					//if houses exist, read them
					try {
						studentCount = Integer.parseInt(line);
					} catch (Exception e) {
						e.printStackTrace();
					}
					for(int i = 0; i < studentCount; i++){
						Student newStudent = new Student(br.readLine());
						newStudents.add(newStudent);
					}
					newSchool.setStudents(newStudents);
					lineNum += studentCount;
				}
				
				else if(lineNum == 2 + houseCount + courseCount + studentCount + 3 && !line.equals('0')){
					Vector<Professor> newProfessors = new Vector<Professor>();
					int professorCount = 0;
					//if houses exist, read them
					try {
						professorCount = Integer.parseInt(line);
					} catch (Exception e) {
						e.printStackTrace();
					}
					for(int i = 0; i < professorCount; i++){
						Professor newProfessor = new Professor(br.readLine());
						newProfessors.add(newProfessor);
					}
					newSchool.setProfessors(newProfessors);
					lineNum += studentCount;
				}
				
				lineNum++;
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
		    for(int i = 0; i < allSchools.size(); i++)
		    {
		    	bw.write(allSchools.get(i).getName());
		    	//go to the next line
		    	bw.write('\n');
		    	bw.write(String.valueOf(allSchools.get(i).getHouses().size()));
		    	bw.write('\n');
		    	for(int j = 0; j < allSchools.get(i).getHouses().size(); j++){
			    	bw.write(allSchools.get(i).getHouses().get(j).getName());
			    	bw.write('\n');
		    	}
		    	
		    	bw.write(String.valueOf(allSchools.get(i).getCourses().size()));
		    	bw.write('\n');
		    	for(int j = 0; j < allSchools.get(i).getCourses().size(); j++){
			    	bw.write(allSchools.get(i).getCourses().get(j).getName());
			    	bw.write('\n');
		    	}
		    	
		    	bw.write(String.valueOf(allSchools.get(i).getStudents().size()));
		    	bw.write('\n');
		    	for(int j = 0; j < allSchools.get(i).getStudents().size(); j++){
			    	bw.write(allSchools.get(i).getStudents().get(j).getName());
			    	bw.write('\n');
		    	}
		    	
		    	bw.write(String.valueOf(allSchools.get(i).getProfessors().size()));
		    	bw.write('\n');
		    	for(int j = 0; j < allSchools.get(i).getProfessors().size(); j++){
			    	bw.write(allSchools.get(i).getProfessors().get(j).getName());
			    	bw.write('\n');
		    	}
		    	
		    	if(i < allSchools.size() - 1)
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