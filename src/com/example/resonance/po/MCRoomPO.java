package com.example.resonance.po;

import java.util.ArrayList;

public class MCRoomPO {
	
	private long mcRoomID;
	private String macRoomName;
	private String imagePath;
	private ArrayList<UserPO> userList;
	
	public long getMcRoomID() {
		return mcRoomID;
	}
	public void setMcRoomID(long mcRoomID) {
		this.mcRoomID = mcRoomID;
	}
	public String getMacRoomName() {
		return macRoomName;
	}
	public void setMacRoomName(String macRoomName) {
		this.macRoomName = macRoomName;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public ArrayList<UserPO> getUserList() {
		return userList;
	}
	public void setUserList(ArrayList<UserPO> userList) {
		this.userList = userList;
	}
	
	
	
}
