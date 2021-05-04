package GameTimeSimulation;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		 System.out.println(campaign.getId() +  "Added Campaign");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getId() + "Deleted Campaign");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getId() + "Updated Campaign");
		
	}
	
	
}
	


