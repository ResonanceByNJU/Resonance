package com.example.resonance.stub;

import java.util.ArrayList;
import java.util.Calendar;

import com.example.resonance.po.UserPO;
import com.example.resonance.service.ENUM.SEND_RESULT;
import com.example.resonance.service.Inter.ChatService;
import com.example.resonance.vo.LogVO;
import com.example.resonance.vo.MCRoomVO;
import com.example.resonance.vo.MessageVO;
import com.example.resonance.vo.QuestionListVO;
import com.example.resonance.vo.QuestionVO;
import com.example.resonance.vo.UserVO;

/**
 *Class <code>ChatService_Stub.java</code> ChatService接口的桩.
 *
 * @author never
 * @date 2014-2-4
 */
public class ChatService_Stub implements ChatService{

	/* (non-Javadoc)
	 * Title: sendMessageToSingle
	 * Description:向一个人发送信息.
	 * @see com.example.resonance.service.Inter.ChatService#sendMessageToSingle(com.example.resonance.vo.MessageVO, com.example.resonance.vo.UserVO, com.example.resonance.vo.UserVO)
	 */
	@Override
	public SEND_RESULT sendMessageToSingle(MessageVO message, UserVO sender,
			UserVO receiver) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * Title: sendMessageToMulti
	 * Description:向多个人群发消息.
	 * @see com.example.resonance.service.Inter.ChatService#sendMessageToMulti(com.example.resonance.vo.MessageVO, com.example.resonance.vo.UserVO, com.example.resonance.vo.MCRoomVO)
	 */
	@Override
	public SEND_RESULT sendMessageToMulti(MessageVO message, UserVO sender,
			MCRoomVO mcRoom) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * Title: checkMessage
	 * Description:接受消息.
	 * @see com.example.resonance.service.Inter.ChatService#checkMessage(com.example.resonance.vo.UserVO)
	 */
	@Override
	public MessageVO checkMessage(UserVO receiver) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * Title: scanLog
	 * Description:查看聊天记录.
	 * @see com.example.resonance.service.Inter.ChatService#scanLog(java.util.Calendar, com.example.resonance.vo.UserVO, com.example.resonance.vo.UserVO)
	 */
	@Override
	public LogVO scanLog(Calendar logTime, UserVO user1, UserVO user2) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * Title: searchQuestion
	 * Description:搜索问题.
	 * @see com.example.resonance.service.Inter.ChatService#searchQuestion(java.lang.String)
	 */
	@Override
	public QuestionListVO searchQuestion(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * Title: viewOneQuestion
	 * Description:查看某个问题.
	 * @see com.example.resonance.service.Inter.ChatService#viewOneQuestion(long)
	 */
	@Override
	public QuestionVO viewOneQuestion(long questionID) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * Title: getAIQuestion
	 * Description:获取AI给出的问题.
	 * @see com.example.resonance.service.Inter.ChatService#getAIQuestion(com.example.resonance.vo.LogVO, com.example.resonance.vo.UserVO, com.example.resonance.vo.UserVO)
	 */
	@Override
	public QuestionVO getAIQuestion(LogVO reference, UserVO sender,
			UserVO receiver) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * Title: getSystemQuestion
	 * Description:获取系统提供的问题.
	 * @see com.example.resonance.service.Inter.ChatService#getSystemQuestion(java.lang.String, com.example.resonance.vo.UserVO, com.example.resonance.vo.UserVO)
	 */
	@Override
	public QuestionListVO getSystemQuestion(String keyword, UserVO user1,
			UserVO user2) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * Title: matchChatter
	 * Description: 匹配好友.
	 * @see com.example.resonance.service.Inter.ChatService#matchChatter(com.example.resonance.vo.UserVO)
	 */
	@Override
	public ArrayList<UserPO> matchChatter(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

}
