package com.example.resonance.po;

import java.util.ArrayList;

public class UserPO {
	
	private long userID;
	private String userName;
	private String imagePath;
	private ArrayList<String> interestList;
	private String makeFriendContent;
	
	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getMakefriendContent() {
		return makeFriendContent;
	}
	public void setMakeuserContent(String makeFriendContent) {
		this.makeFriendContent = makeFriendContent;
	}
}
