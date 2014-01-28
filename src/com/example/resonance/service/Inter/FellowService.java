package com.example.resonance.service.Inter;

import com.example.resonance.service.ENUM.ADD_RESULT;
import com.example.resonance.service.ENUM.DELETE_RESULT;
import com.example.resonance.vo.FriendListVO;
import com.example.resonance.vo.FriendVO;

public interface FellowService {

	public FriendVO searchFriendByID(long userID);
	
	public FriendVO viewFriendProfile(long userID);
	
	public FriendListVO searchFriend(String keyword);
	
	public ADD_RESULT addOneFriend(FriendVO addFriend);
	
	public ADD_RESULT addMultiFriend(FriendListVO addFriendList);
	
	public DELETE_RESULT deleteOneFriend(FriendVO deleteFriend);
	
	public DELETE_RESULT deleteMultiFriend(FriendListVO deleteFriendList);
}
