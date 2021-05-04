package GameTimeSimulation;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + "Added Game");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + "Deleted Game");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + "Updated Game");
		
	}

}
