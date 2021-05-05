package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " isimli kampanya baþladý.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " isimli kampanya sonlandý.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " isimli kampanya güncellendi.");
		
	}

}
