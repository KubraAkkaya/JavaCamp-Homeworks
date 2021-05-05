package Concrete;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import Entities.Sale;

public class SaleManager {
	
	public void salesWithoutCampaign(Player player,Game game,Sale sale) {
		System.out.println(sale.getSaleId() + " numaralý satýþ: " + game.getGameName()+" adlý oyun " +
						player.getNickName() +" tarafýndan "+game.getPrice() +" TL'ye alýnmýþtýr.");
	}
	
	public void salesWithCampaign(Player player,Game game,Campaign campaign,Sale sale) {
		int priceAfterCampaign=  (int) (game.getPrice()-((game.getPrice()*campaign.getRate())/100));
		System.out.println(sale.getSaleId() + " numaralý satýþ: " + campaign.getCampaignGameName()+" adlý oyun " +
				player.getNickName() +" tarafýndan "+campaign.getDiscountCoupon() +" indirim kuponu ile "+priceAfterCampaign + " TL'ye alýnmýþtýr.");
	}
}
