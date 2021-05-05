package Entities;

import java.util.Date;

public class Player {

	private int playerId;
	private String firtName;
	private String lastName;
	private int yearOfBirt;
	private String idNumber;
	private String nickName;
	
	public Player(int playerId, String firtstName, String lastName, int yearOfBirt, String idNumber,String nickName) {
		this.playerId=playerId;
		this.firtName=firtstName;
		this.lastName=lastName;
		this.yearOfBirt=yearOfBirt;
		this.idNumber=idNumber;
		this.nickName=nickName;
	}

	
	public String getFirtName() {
		return firtName;
	}
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYearOfBirt() {
		return yearOfBirt;
	}
	public void setYearOfBirt(int yearOfBirt) {
		this.yearOfBirt = yearOfBirt;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
}
