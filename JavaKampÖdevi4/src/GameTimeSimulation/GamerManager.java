package GameTimeSimulation;

public class GamerManager implements GamerService {

	@Override
	public void addGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + "Added Gamer");
		
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + "Deleted Gamer");
		
	}

	@Override
	public void updateGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + "Updated Gamer");
		
	}

}
