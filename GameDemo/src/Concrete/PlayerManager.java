package Concrete;

import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager  implements PlayerService{

	MernisManager mernisManager;

	public PlayerManager(MernisManager mernisManager) {
		
		this.mernisManager = mernisManager;
	}
	
	@Override
	public void addPlayer(Player player) {
		boolean result;
		result= mernisManager.mernisManager(player);
		if (result==true) {
			System.out.println(player.getNickName()+" isimli oyuncu eklendi");
		}else {
			System.out.println(player.getNickName()+" isimli oyuncu doðrulanamadý!");
		}
	}

	@Override
	public void deletePlayer(Player player) {
		System.out.println(player.getNickName() + " isimli oyuncu silindi.");
		
	}

	@Override
	public void updatePlayer(Player player) {
		System.out.println(player.getNickName() + " isimli oyuncunun bilgileri güncellendi.");
		
	}

}
