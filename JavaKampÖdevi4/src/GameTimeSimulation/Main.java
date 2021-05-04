package GameTimeSimulation;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("EMRE");
		gamer1.setLastName("SÝMSEK");
		gamer1.setNationalityNumber("213132143121");
		gamer1.setDogumTarihi(11/10/1998);
		gamer1.setEmail("emresimsek05@gmail.com");
		gamer1.setUserName("emre1998.");
		gamer1.setPassword("12345");
		
		Gamer[] gamers = {gamer1};	
		
		
		Game game1 = new Game ();
		game1.setId(1);
		game1.setGameName("FIFA20");
		game1.setPrice(100.);
		game1.setCampaign("HAPPY NEW YEAR");
		game1.setCompany("EA SPORTS");
		
		Game[] games = {game1};
		
		
		Sale sale1 = new Sale();
		sale1.setSaleId(1);
		sale1.setSaleType("PC OYUNU");
		sale1.setSaleCard("243532");
		
		Sale[] sales = {sale1};
		
		
		Campaign campaign1 = new Campaign();
		campaign1.setCampaignName("HAPPY NEW YEAR");
		campaign1.setDiscount("40");
		campaign1.setId(1);
		
		Campaign[] campaigns = {campaign1};
		
		
		GameManager gameManager1 = new GameManager();
		gameManager1.add(game1);
		gameManager1.delete(game1);
		gameManager1.update(game1);
		
		System.out.println("GAMEMANAGER OPERATION");
		
		
		SaleManager saleManager1 = new SaleManager();
		saleManager1.addSale(sale1);
		saleManager1.deleteSale(sale1);
		saleManager1.updateSale(sale1);
		
		System.out.println("SALEMANAGER OPERATION");
		
		
		CampaignManager campaignManager1 = new CampaignManager();
		campaignManager1.add(campaign1);
		campaignManager1.delete(campaign1);
		campaignManager1.update(campaign1);
		
		System.out.println("CAMPAIGNMANAGER OPERATION");
		
		
		VerificationManager verificationManager1 = new VerificationManager();
		verificationManager1.vericifationService(gamer1);
		
		System.out.println("VERIFICATIONMANAGER OPERATION");
		
		
		GamerManager gamerManager1 = new GamerManager();
		gamerManager1.addGamer(gamer1);
		gamerManager1.deleteGamer(gamer1);
		gamerManager1.updateGamer(gamer1);
		
		System.out.println("GAMER OPERATION");
	
	}

}
