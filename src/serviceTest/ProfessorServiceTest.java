package serviceTest;

import entities.*;
import service.*;

public class ProfessorServiceTest {
	public void showAllProfessorsTest(){
		ProfessorService allProfessorService = new ProfessorService();
		allProfessorService.getData("ProfessorDB.txt");
		allProfessorService.showAllProfessors();
	}
	
	public boolean getProfessorByNameTest(){
		ProfessorService professorService = new ProfessorService();
		professorService.getData("ProfessorDB.txt");
		Professor actual = new Professor("Severus Snape");
		
		try{
			Person expected = professorService.getProfessorByName(actual.getName());
			if(actual.getName().equals(expected.getName()))
				return true;
			return false;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		} 
	}
}
