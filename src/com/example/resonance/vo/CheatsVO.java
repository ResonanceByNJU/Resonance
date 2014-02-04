package com.example.resonance.vo;

public class CheatsVO {
	private String imagePath;
	private String cheatsName;
	private String content;
	
	public CheatsVO(String imagePath, String cheatsName, String content) {
		super();
		this.imagePath = imagePath;
		this.cheatsName = cheatsName;
		this.content = content;
	}
	
	public String getImagePath() {
		return imagePath;
	}
	public String getCheatsName() {
		return cheatsName;
	}
	public String getContent() {
		return content;
	}
	
	
}
