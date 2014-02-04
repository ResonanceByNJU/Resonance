package com.example.resonance.vo;

public class MatchFriendVO {
	private String imagePath;
	private String friendName;
	private double heartRate;
	
	public MatchFriendVO(String imagePath, String friendName, double heartRate) {
		super();
		this.imagePath = imagePath;
		this.friendName = friendName;
		this.heartRate = heartRate;
	}
	public String getImagePath() {
		return imagePath;
	}
	public String getFriendName() {
		return friendName;
	}
	public double getHeartRate() {
		return heartRate;
	}
	
	
	
}
