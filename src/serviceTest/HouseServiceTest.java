package serviceTest;

import entities.House;
import entities.School;
import service.HouseService;

public class HouseServiceTest {
	
	public boolean getHouseByNameTest(){
		HouseService gryffindorService = new HouseService();
		gryffindorService.getData("HouseDB.txt");
		House actual = new House("Gryffindor");
		
		try{
			House expected = gryffindorService.getHouseByName(actual.getName());
			if(actual.getName().equals(expected.getName()))
				return true;
			return false;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		} 
	}
	
	public void showAllHousesTest(){
		HouseService allHouseService = new HouseService();
		allHouseService.getData("HouseDB.txt");
		allHouseService.showAllHouses();
	}
	
	public void showHouseTest(){
		HouseService allHouseService = new HouseService();
		allHouseService.getData("HouseDB.txt");
		allHouseService.showHouse("Gryffindor");
	}

	public void createNewHouseTest(){
		HouseService allHouseService = new HouseService();
		House newHouse = new House("New House");
		School newSchool = new School("New School");
		newHouse.setSchool(newSchool);
		allHouseService.createNewHouse(newHouse);
		allHouseService.getData("HouseDB.txt");
		allHouseService.showAllHouses();
	}
	
	public void deleteHouseTest(){
		HouseService allHouseService = new HouseService();
		allHouseService.getData("HouseDB.txt");
		allHouseService.deleteHouse(allHouseService.getAllHouses().get(allHouseService.getAllHouses().size() - 1));
		allHouseService.getData("HouseDB.txt");
		allHouseService.showAllHouses();
	}
	
	public boolean searchByNameTest(){
		HouseService gryffindorService = new HouseService();
		gryffindorService.getData("HouseDB.txt");
		House actual = new House("Gryffindor");
		
		try{
			House expected = gryffindorService.getHouseByName(actual.getName());
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
