package com.example.resonance.vo;

import java.util.ArrayList;

public class MCRoomListVO {
	private ArrayList<MCRoomVO> groupChatRomList;

	public MCRoomListVO(ArrayList<MCRoomVO> groupChatRomList) {
		super();
		this.groupChatRomList = groupChatRomList;
	}

	public ArrayList<MCRoomVO> getGroupChatRomList() {
		return groupChatRomList;
	}
	
	
	
}
