package com.example.resonance.vo;

public class ChangePersonalInformationVO {
	private String username;
	private String imagePath;
	private String sex;
	private String makeFriendContent;
	
	public ChangePersonalInformationVO(String username, String imagePath,
			String sex, String makeFriendContent) {
		super();
		this.username = username;
		this.imagePath = imagePath;
		this.sex = sex;
		this.makeFriendContent = makeFriendContent;
	}
	
	public String getUsername() {
		return username;
	}
	public String getImagePath() {
		return imagePath;
	}
	public String getSex() {
		return sex;
	}
	public String getMakeFriendContent() {
		return makeFriendContent;
	}
	
	
}
