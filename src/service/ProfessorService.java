package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import entities.Course;
import entities.Professor;

public class ProfessorService {
	private Professor _professor;
	private Vector<Professor> _allProfessors;
	
	//constructors
	public ProfessorService(Professor professor){
		_allProfessors = new Vector<Professor>();
		_professor = professor;
	}
	public ProfessorService(){
		this(null);
	}
	
	public void getData(String fileName){
		BufferedReader br = null;
		FileReader fr = null;
		int year = 0;
		
		try {
			//br = new BufferedReader(new FileReader(fileName));
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String line;
			// each new house which is read from file is temporarily stored in newCourse
			_professor = new Professor();
			//the number of houses read
			int professorNum = 0;

			//while there are lines, read them!
			while ((line = br.readLine()) != null && line.length() != 0) {
				// end of each house info is with "*"
				if(line.charAt(0) == '*'){
					//indicates the beginning of a new course
					if(professorNum != 0){
						//add the last course to the vector of allCourses
						_allProfessors.add(_professor);
						//System.out.println("Name:" + newStudent.getName() + "year : " + newStudent.getBirthday() + " school :" + newStudent.getSchool().getName() + " house :" + newStudent.getHouse().getName() + "blood : " + newStudent.getBloodStatus());
					}
					_professor = new Professor();
					continue;
				}
				
				else if(line.charAt(0) == '$'){
					if(professorNum != 0){
						//add the last course to the vector of allCourses
						_allProfessors.add(_professor);
					}
					break;
				}
				//read name
				_professor.setName(line);
				professorNum++;
				//read course
				Course newCourse = new Course(br.readLine());
				//read year
				try {
					year = (Integer.parseInt(br.readLine()));
					Map<Integer, Course> newMap = new HashMap<Integer, Course>();
					newMap.put(year, newCourse);
					_professor.setCourses(newMap);
				} catch (Exception e) {
					e.printStackTrace();
				}
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
		    for(int i = 0; i < _allProfessors.size(); i++)
		    {
		    	//name
		    	bw.write(_allProfessors.get(i).getName());
		    	//go to the next line
		    	bw.write('\n');	
		    	
		        for (Map.Entry<Integer,Course> e : _allProfessors.get(i).getCourses().entrySet()) {
		            Integer key = e.getKey();
		            Course value = e.getValue();
		                
		            //course name
				    bw.write(value.getName());
				    bw.write('\n');
				    	
				    //year
				    bw.write(String.valueOf(key));
				    bw.write('\n');
		        }
		    	
		    	if(i < _allProfessors.size() - 1)
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
