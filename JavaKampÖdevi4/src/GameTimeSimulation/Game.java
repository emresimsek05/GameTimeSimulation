package GameTimeSimulation;

	public class Game {
		
		private int id;
		private String GameName;
		private double Price;
		private String Company;
		private String Campaign;
		
		public Game () {
			
		}
			
			
			public  Game(int id, String GameName, double Price, String Company, String Campaign) {
				
			this.id= id;
			this.GameName= GameName;
			this.Price= Price;
			this.Company= Company;
			this.Campaign= Campaign;
      }


			public int getId() {
				return id;
			}


			public void setId(int id) {
				this.id = id;
			}


			public String getGameName() {
				return GameName;
			}


			public void setGameName(String gameName) {
				GameName = gameName;
			}


			public double getPrice() {
				return Price;
			}


			public void setPrice(double price) {
				Price = price;
			}


			public String getCompany() {
				return Company;
			}


			public void setCompany(String company) {
				Company = company;
			}


			public String getCampaign() {
				return Campaign;
			}


			public void setCampaign(String campaign) {
				Campaign = campaign;
			}
			
}


