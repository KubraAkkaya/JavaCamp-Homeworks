import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import Entities.Sale;

import java.util.Date;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.MernisManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;


public class Main {

	public static void main(String[] args) {
		Player player1 = new Player(1,"Kübra", "Akkaya", 2001, "12345678995", "Oyuncu123");
		Game game1= new Game(1, "Call Of Duty", 100);
		Campaign campaign1 = new Campaign(1, "benimoyuncum12", "Call Of Duty", "Bahar indirimi", 20);
		Sale sale1 = new Sale(1);
		Sale sale2 = new Sale(2);
		
		PlayerManager playerManager = new PlayerManager(new MernisManager());
		playerManager.addPlayer(player1);
		//playerManager.updatePlayer(player);
		
		GameManager gameManager = new GameManager();
		gameManager.addGame(game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign1);
		
		SaleManager saleManager = new SaleManager();
		saleManager.salesWithCampaign(player1, game1, campaign1, sale1);
		saleManager.salesWithoutCampaign(player1, game1, sale2);
		
	}

}
