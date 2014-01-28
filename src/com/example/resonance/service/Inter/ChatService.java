package com.example.resonance.service.Inter;

import java.util.ArrayList;
import java.util.Calendar;

import com.example.resonance.po.UserPO;
import com.example.resonance.service.ENUM.SEND_RESULT;
import com.example.resonance.vo.LogVO;
import com.example.resonance.vo.MCRoomVO;
import com.example.resonance.vo.MessageVO;
import com.example.resonance.vo.QuestionListVO;
import com.example.resonance.vo.QuestionVO;
import com.example.resonance.vo.UserVO;

public interface ChatService {
	
	public SEND_RESULT sendMessageToSingle(MessageVO message,UserVO sender,UserVO receiver);
	
	public SEND_RESULT sendMessageToMulti(MessageVO message,UserVO sender,MCRoomVO mcRoom);
	
	public MessageVO checkMessage(UserVO receiver);

	public LogVO scanLog(Calendar logTime,UserVO user1,UserVO user2);
	
	public QuestionListVO searchQuestion(String keyword);
	
	public QuestionVO viewOneQuestion(long questionID);
	
	public QuestionVO getAIQuestion(LogVO reference,UserVO sender,UserVO receiver);
	
	public QuestionListVO getSystemQuestion(String keyword,UserVO user1,UserVO user2);
	
	public ArrayList<UserPO> matchChatter(UserVO user);
	
}
