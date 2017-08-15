package service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import entities.*;

public class SchoolService {
	private School _school;	//The school the services are performed on/at
	
	//constructors
	public SchoolService(School school){
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
		House finalHouse = new House();
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
			finalHouse = new House("Slytherin", _school);
		}
		
		else if(score > questions.size()*2 - 2 && score < questions.size()*3 - 1){
			finalHouse = new House("Ravenclaw", _school);
		}
		
		else if(score > questions.size()*3 - 2 && score < questions.size()*4 - 1){
			finalHouse = new House("Hufflepuff", _school);
		}
		
		else{
			finalHouse = new House("Gryffindor", _school);
		}
		
		return finalHouse;
	}
}
