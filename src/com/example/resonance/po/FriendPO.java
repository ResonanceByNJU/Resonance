package com.example.resonance.po;

import java.util.ArrayList;

public class FriendPO {
	
	private long friendID;
	private String friendName;
	private String imagePath;
	private ArrayList<String> interestList;
	private String makeFriendContent;
	
	public long getFriendID() {
		return friendID;
	}
	public void setFriendID(long friendID) {
		this.friendID = friendID;
	}
	public String getFriendName() {
		return friendName;
	}
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public ArrayList<String> getInterestList() {
		return interestList;
	}
	public void setInterestList(ArrayList<String> interestList) {
		this.interestList = interestList;
	}
	public String getMakeFriendContent() {
		return makeFriendContent;
	}
	public void setMakeFriendContent(String makeFriendContent) {
		this.makeFriendContent = makeFriendContent;
	}
	
	
	
	
}
