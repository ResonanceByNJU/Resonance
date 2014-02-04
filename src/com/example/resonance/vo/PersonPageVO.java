package com.example.resonance.vo;

import java.util.ArrayList;

public class PersonPageVO {
	private String backgroundPath;
	private String personalImagePath;
	private String username;
	private ArrayList<String> interestList;
	
	public PersonPageVO(String backgroundPath, String personalImagePath,
			String username, ArrayList<String> interestList) {
		super();
		this.backgroundPath = backgroundPath;
		this.personalImagePath = personalImagePath;
		this.username = username;
		this.interestList = interestList;
	}
	public String getBackgroundPath() {
		return backgroundPath;
	}
	public String getPersonalImagePath() {
		return personalImagePath;
	}
	public String getUsername() {
		return username;
	}
	public ArrayList<String> getInterestList() {
		return interestList;
	}
	
	
	
}
