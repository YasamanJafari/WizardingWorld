package serviceTest;

import entities.House;
import service.HouseService;

public class HouseServiceTest extends HouseService {
	
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

}
