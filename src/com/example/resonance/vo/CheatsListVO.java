package com.example.resonance.vo;

import java.util.ArrayList;

public class CheatsListVO {
	private ArrayList<CheatsVO> cheatsList;

	public CheatsListVO(ArrayList<CheatsVO> cheatsList) {
		super();
		this.cheatsList = cheatsList;
	}

	public ArrayList<CheatsVO> getCheatsList() {
		return cheatsList;
	}
	
}
