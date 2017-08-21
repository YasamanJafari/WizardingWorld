package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import entities.Course;
import entities.Grades;
import entities.Professor;
import entities.Student;

public class CourseService {
	private Course _course; 	//The course the services are performed on/at
	private Vector<Course> _allCourses;
	
	//constructors
	public CourseService(Course course){
		_allCourses = new Vector<Course>();
		_course = course;
	}
	public CourseService(){
		this(null);
	}
	
	//getters
	public Course getCourse(){
		return _course;		//get the course field of the class
	}
	
	//setter
	public void setCourse(Course course){
		_course = course;
	}
	
	public void getData(String fileName){
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			//br = new BufferedReader(new FileReader(fileName));
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String line;
			// each new course which is read from file is temporarily stored in newCourse
			Course newCourse = new Course();
			//the number of courses read
			int courseNum = 0;
			int studentCount = 0;
			Vector<Student> newStudents = new Vector<Student>();

			//while there are lines, read them!
			while ((line = br.readLine()) != null && line.length() != 0) {
				// end of each course info is with "*"
				if(line.charAt(0) == '*'){
					//indicates the beginning of a new course
					if(courseNum != 0){
						//add the last course to the vector of allCourses
						_allCourses.add(newCourse);
						
						//TEST
						System.out.println("** COURSE_SERVICE::getData TEST **");
						System.out.println(courseNum + "- " + "Name: " + newCourse.getName() + '\n' + "Min Grade: "+ newCourse.getMinGrade() + '\n' + "Professor: " + newCourse.getProfessor().getName() + '\n' + "year: " + newCourse.getYear());
						System.out.println("Students count :" + newCourse.getStudents().size());
						for(int i = 0; i < newCourse.getStudents().size(); i++){
							System.out.println(newCourse.getStudents().get(i).getName());
						}
						System.out.println("----------------------------------------");
					}
					newCourse = new Course();
					newStudents = new Vector<Student>();
					continue;
				}
				
				else if(line.charAt(0) == '$'){
					if(courseNum != 0){
						//add the last course to the vector of allCourses
						_allCourses.add(newCourse);
					}
					
					//TEST
					for(int j = 0; j < _allCourses.size(); j++)
					{
						newCourse = _allCourses.get(j);
						System.out.println("** COURSE_SERVICE::getData TEST **");
						System.out.println(j+1 + "- " + "Name: " + newCourse.getName() + '\n' + "Min Grade: "+ newCourse.getMinGrade() + '\n' + "Professor: " + newCourse.getProfessor().getName() + '\n' + "year: " + newCourse.getYear());
						System.out.println("Students count :" + newCourse.getStudents().size());
						for(int i = 0; i < newCourse.getStudents().size(); i++){
							System.out.println(newCourse.getStudents().get(i).getName());
						}
						System.out.println("----------------------------------------");
					}
					
					break;
				}
				//read name
				newCourse.setName(line);
				courseNum++;
				//read minGrade
				newCourse.setMinGrade(Grades.valueOf(br.readLine()));
				//read professor
				newCourse.setProfessor(new Professor(br.readLine()));
				//read year
				try {
					newCourse.setYear(Integer.parseInt(br.readLine()));
				} catch (Exception e) {
					e.printStackTrace();
				}
				//read studentCount
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
				newCourse.setStudents(newStudents);
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
		    for(int i = 0; i < _allCourses.size(); i++)
		    {
		    	//name
		    	bw.write(_allCourses.get(i).getName());
		    	//go to the next line
		    	bw.write('\n');
		    	//minGrade
		    	bw.write(String.valueOf(_allCourses.get(i).getMinGrade()));
		    	bw.write('\n');
		    	//professor
		    	bw.write(_allCourses.get(i).getProfessor().getName());
		    	bw.write('\n');
		    	//year
		    	bw.write(String.valueOf(_allCourses.get(i).getYear()));
		    	bw.write('\n');
		    	//students' count
		    	bw.write(String.valueOf(_allCourses.get(i).getStudents().size()));
		    	bw.write('\n');
		    	//list students
		    	for(int j = 0; j < _allCourses.get(i).getStudents().size(); j++){
			    	bw.write(_allCourses.get(i).getStudents().get(j).getName());
			    	bw.write('\n');
		    	}
		    	
		    	if(i < _allCourses.size() - 1)
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
