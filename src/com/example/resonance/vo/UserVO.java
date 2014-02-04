package com.example.resonance.vo;

public class UserVO {
	
	private String username;
	private String headPicturePath;
	
	public UserVO(String username, String headPicturePath) {
		super();
		this.username = username;
		this.headPicturePath = headPicturePath;
	}
	public String getUsername() {
		return username;
	}
	public String getHeadPicturePath() {
		return headPicturePath;
	}
	
	
	
}
