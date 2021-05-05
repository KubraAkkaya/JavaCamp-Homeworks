package Entities;

public class Campaign {
	private int campaignId;
	private String discountCoupon;
	private String campaignGameName;
	private String name;
	private double rate;
	
	public Campaign(int CampaignId, String discountCoupon,String campaignGameName,String name,double rate) {
		this.campaignId=CampaignId;
		this.campaignGameName=campaignGameName;
		this.discountCoupon=discountCoupon;
		this.name=name;
		this.rate=rate;
	}
	
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public String getDiscountCoupon() {
		return discountCoupon;
	}
	public void setDiscountCoupon(String discountCoupon) {
		this.discountCoupon = discountCoupon;
	}
	public String getCampaignGameName() {
		return campaignGameName;
	}
	public void setCampaignGameName(String campaignGameName) {
		this.campaignGameName = campaignGameName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}
