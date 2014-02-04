package com.example.resonance.vo;

import java.util.ArrayList;

public class CompleteUserVO {

	private String sex;
	private ArrayList<String> interestList;
	private String makeFriendContent;
	
	public CompleteUserVO(String sex, ArrayList<String> interestList,
			String makeFriendContent) {
		super();
		this.sex = sex;
		this.interestList = interestList;
		this.makeFriendContent = makeFriendContent;
	}
	
	public String getSex() {
		return sex;
	}
	public ArrayList<String> getInterestList() {
		return interestList;
	}
	public String getMakeFriendContent() {
		return makeFriendContent;
	}

	
	
}
