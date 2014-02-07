package com.example.resonance.vo;

import java.io.Serializable;

public class FriendVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String beginWord;
	private String imagePath;
	private String username;
	private String makeFriendContent;
	
	public FriendVO(String beginWord, String imagePath, String username,
			String makeFriendContent) {
		super();
		this.beginWord = beginWord;
		this.imagePath = imagePath;
		this.username = username;
		this.makeFriendContent = makeFriendContent;
	}
	
	public String getBeginWord() {
		return beginWord;
	}
	public String getImagePath() {
		return imagePath;
	}
	public String getUsername() {
		return username;
	}
	public String getMakeFriendContent() {
		return makeFriendContent;
	}
	
	
	
}
