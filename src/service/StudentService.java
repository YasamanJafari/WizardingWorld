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
import entities.School;
import entities.Student;

public class StudentService {
	private Student _student;	//The student the services are performed on/at
	private Vector<Student> _allStudents;
	
	//constructors
	public StudentService(Student student){
		_allStudents = new Vector<Student>();
		_student = student;
	}
	public StudentService(){
		this(null);
	}
	
	//getters
	public Student getStudent(){
		return _student;		//get the student field of the class
	}
	
	//setter
	public void setStudent(Student student){
		_student = student;
	}
	
	public void sortToHouse(House house){
		//set this student's house to the one given
		_student.setHouse(house);
	}
	
	public void getData(String fileName){
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			//br = new BufferedReader(new FileReader(fileName));
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String line;
			// each new student which is read from file is temporarily stored in newCourse
			Student newStudent = new Student();
			//the number of students read
			int studentNum = 0;

			//while there are lines, read them!
			while ((line = br.readLine()) != null && line.length() != 0) {
				// end of each student info is with "*"
				if(line.charAt(0) == '*'){
					//indicates the beginning of a new course
					if(studentNum != 0){
						//add the last course to the vector of allCourses
						_allStudents.add(newStudent);
					}
					newStudent = new Student();
					continue;
				}
				
				else if(line.charAt(0) == '$'){
					if(studentNum != 0){
						//add the last course to the vector of allCourses
						_allStudents.add(newStudent);
					}
					
					//TEST
					for(int j = 0; j < _allStudents.size(); j++)
					{
						newStudent = _allStudents.get(j);
						System.out.println("** STUDENT_SERVICE::getData TEST **");
						System.out.println(j+1 + "- " + "Name: " + newStudent.getName() + '\n' + "School: "+ newStudent.getSchool().getName() + '\n' + "House: " + newStudent.getHouse().getName() + '\n' + "Blood-Status: " + newStudent.getBloodStatus() + '\n' + "Birthday: " + newStudent.getBirthday());
						System.out.println("----------------------------------------");
					}
					
					
					break;
				}
				//read name
				newStudent.setName(line);
				studentNum++;
				//read school
				newStudent.setSchool(new School(br.readLine()));
				//read house
				newStudent.setHouse(new House(br.readLine()));
				//read blood-status
					newStudent.setBloodStatus(BloodStatus.valueOf(br.readLine()));
				//read birthday
					newStudent.setBirthday(br.readLine());
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
		    for(int i = 0; i < _allStudents.size(); i++)
		    {
		    	//name
		    	bw.write(_allStudents.get(i).getName());
		    	//go to the next line
		    	bw.write('\n');
		    	//school
		    	bw.write(_allStudents.get(i).getSchool().getName());
		    	bw.write('\n');
		    	//house
		    	bw.write(_allStudents.get(i).getHouse().getName());
		    	bw.write('\n');
		    	//blood
		    	bw.write(String.valueOf(_allStudents.get(i).getBloodStatus()));
		    	bw.write('\n');
		    	//birthday
		    	bw.write(_allStudents.get(i).getBirthday());
		    	bw.write('\n');
		    	
		    	if(i < _allStudents.size() - 1)
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
