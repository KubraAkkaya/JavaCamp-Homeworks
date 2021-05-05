package Entities;

public class Game {
	private int gameId;
	private String gameName;
	private float price;
		
	
	public Game(int gameId, String gameName, float price) {
		this.gameId=gameId;
		this.gameName=gameName;
		this.price=price;
	}
	
	public int getGameId() {
		return gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
