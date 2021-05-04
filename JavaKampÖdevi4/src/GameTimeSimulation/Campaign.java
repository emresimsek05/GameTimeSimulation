package GameTimeSimulation;

public class Campaign {
	

	private int id;
	private String CampaignName;
	private String Discount;
	
	
	public Campaign () {
		
	}
	
	public Campaign(int id, String CampaignName, String Discount) {
		
		this.id= id;
		this.Discount= Discount;
		this.CampaignName = CampaignName;
		
	}
	

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return CampaignName;
	}

	public void setCampaignName(String campaignName) {
		this.CampaignName = campaignName;
	}

	public String getDiscount() {
		return Discount;
	}

	public void setDiscount (String Discount) {
		this.Discount = Discount;
	}
}
