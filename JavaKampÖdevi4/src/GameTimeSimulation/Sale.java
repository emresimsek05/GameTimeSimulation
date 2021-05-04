package GameTimeSimulation;

public class Sale {

	private int SaleId;
	private String SaleType;
	private String SaleCard;
	
	public Sale() {
		
	}
		
		public Sale(int SaleId, String SaleType, String SaleCard) {
			
			this.SaleId= SaleId;
			this.SaleType= SaleType;
			this.SaleCard= SaleCard;
		}

		public int getSaleId() {
			return SaleId;
		}

		public void setSaleId(int saleId) {
			SaleId = saleId;
		}

		public String getSaleType() {
			return SaleType;
		}

		public void setSaleType(String saleType) {
			SaleType = saleType;
		}

		public String getSaleCard() {
			return SaleCard;
		}

		public void setSaleCard(String saleCard) {
			SaleCard = saleCard;
		}
	
}
