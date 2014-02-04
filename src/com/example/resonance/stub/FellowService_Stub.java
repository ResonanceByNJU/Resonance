package com.example.resonance.stub;

import com.example.resonance.service.ENUM.ADD_RESULT;
import com.example.resonance.service.ENUM.DELETE_RESULT;
import com.example.resonance.service.Inter.FellowService;
import com.example.resonance.utils.PrintHelper;
import com.example.resonance.vo.FriendListVO;
import com.example.resonance.vo.FriendVO;

/**
 *Class <code>FellowService_Stub.java</code> FellowService接口的桩.
 *
 * @author never
 * @date 2014-2-3
 */
public class FellowService_Stub implements FellowService{
    private TestVOs testVOs = null;
	public FellowService_Stub() {
		testVOs = new TestVOs();
	}
	
	/* (non-Javadoc)
	 * Title: searchFriendByID
	 * Description:根据用户ID搜索好友.
	 * @see com.example.resonance.service.Inter.FellowService#searchFriendByID(long)
	 */
	@Override
	public FriendVO searchFriendByID(long userID) {
		PrintHelper.Print(getClass().getName(), "searchFriendByID");
		
		if(userID == TestVOs.USERID) {
			return testVOs.friendVOs.get(0);
		}
		return null;
	}

	/* (non-Javadoc)
	 * Title: viewFriendProfile
	 * Description:???
	 * @see com.example.resonance.service.Inter.FellowService#viewFriendProfile(long)
	 */
	@Override
	public FriendVO viewFriendProfile(long userID) {
		// TODO Auto-generated method stub
		PrintHelper.Print(getClass().getName(), "viewFriendProfile");
		if(userID == TestVOs.USERID) {
			return testVOs.friendVOs.get(0);
		}
		return null;
	}

	/* (non-Javadoc)
	 * Title: searchFriend
	 * Description:根据关键字搜索好友列表.
	 * @see com.example.resonance.service.Inter.FellowService#searchFriend(java.lang.String)
	 */
	@Override
	public FriendListVO searchFriend(String keyword) {
		PrintHelper.Print(getClass().getName(), "searchFriend");
		if(keyword.equals(TestVOs.KEY)) {
			return testVOs.friendListVO;
		}
		return null;
	}

	/* (non-Javadoc)
	 * Title: addOneFriend
	 * Description:添加一位好友.
	 * @see com.example.resonance.service.Inter.FellowService#addOneFriend(com.example.resonance.vo.FriendVO)
	 */
	@Override
	public ADD_RESULT addOneFriend(FriendVO addFriend) {
		PrintHelper.Print(getClass().getName(), "addOneFriend");
		if(addFriend == null) {
			return ADD_RESULT.添加人不存在;
		} else {
			return ADD_RESULT.添加成功;
		}
		
	}

	/* (non-Javadoc)
	 * Title: addMultiFriend
	 * Description:添加多个好友.
	 * @see com.example.resonance.service.Inter.FellowService#addMultiFriend(com.example.resonance.vo.FriendListVO)
	 */
	@Override
	public ADD_RESULT addMultiFriend(FriendListVO addFriendList) {
		PrintHelper.Print(getClass().getName(), "addMultiFriend");
		
		if(addFriendList == null || addFriendList.getFriendList().size() == 0) {
			return ADD_RESULT.添加人不存在;
		}
		return ADD_RESULT.添加成功;
	}

	/* (non-Javadoc)
	 * Title: deleteOneFriend
	 * Description:删除一个好友.
	 * @see com.example.resonance.service.Inter.FellowService#deleteOneFriend(com.example.resonance.vo.FriendVO)
	 */
	@Override
	public DELETE_RESULT deleteOneFriend(FriendVO deleteFriend) {
		PrintHelper.Print(getClass().getName(), "deleteOneFriend");
        if(deleteFriend == null) {
        	return DELETE_RESULT.其他错误;
        } else {
        	for(FriendVO f:testVOs.friendListVO.getFriendList()) {
        		if(f == deleteFriend) {
        	        testVOs.friendListVO.getFriendList().remove(f);
        	        break;
        		}
        	}
        	return DELETE_RESULT.删除成功;
        }
	}

	/* (non-Javadoc)
	 * Title: deleteMultiFriend
	 * Description:
	 * @see com.example.resonance.service.Inter.FellowService#deleteMultiFriend(com.example.resonance.vo.FriendListVO)
	 */
	@Override
	public DELETE_RESULT deleteMultiFriend(FriendListVO deleteFriendList) {
		PrintHelper.Print(getClass().getName(), "deleteMultiFriend");
		if(deleteFriendList == null || deleteFriendList.getFriendList().size() == 0) {
			return DELETE_RESULT.其他错误;
		} else {
			return DELETE_RESULT.删除成功;
		}
	}

}
