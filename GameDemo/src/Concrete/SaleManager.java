package Concrete;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import Entities.Sale;

public class SaleManager {
	
	public void salesWithoutCampaign(Player player,Game game,Sale sale) {
		System.out.println(sale.getSaleId() + " numaral� sat��: " + game.getGameName()+" adl� oyun " +
						player.getNickName() +" taraf�ndan "+game.getPrice() +" TL'ye al�nm��t�r.");
	}
	
	public void salesWithCampaign(Player player,Game game,Campaign campaign,Sale sale) {
		int priceAfterCampaign=  (int) (game.getPrice()-((game.getPrice()*campaign.getRate())/100));
		System.out.println(sale.getSaleId() + " numaral� sat��: " + campaign.getCampaignGameName()+" adl� oyun " +
				player.getNickName() +" taraf�ndan "+campaign.getDiscountCoupon() +" indirim kuponu ile "+priceAfterCampaign + " TL'ye al�nm��t�r.");
	}
}
