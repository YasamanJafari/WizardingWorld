package serviceTest;

import service.ProfessorService;

public class ProfessorServiceTest {
	public void showAllProfessorsTest(){
		ProfessorService allProfessorService = new ProfessorService();
		allProfessorService.getData("ProfessorDB.txt");
		allProfessorService.showAllProfessors();
	}
}
