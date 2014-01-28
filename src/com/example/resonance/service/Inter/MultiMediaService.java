package com.example.resonance.service.Inter;

import com.example.resonance.service.ENUM.CANCEL_RESULT;
import com.example.resonance.service.ENUM.SEND_RESULT;
import com.example.resonance.vo.AudioVO;
import com.example.resonance.vo.UserVO;
import com.example.resonance.vo.VideoVO;

public interface MultiMediaService {
	
	public SEND_RESULT sendAudioToSingle(AudioVO audio);
	
	public SEND_RESULT sendVedioToSingle(VideoVO vedio);
	
	public SEND_RESULT sendAudioToMulti(AudioVO audio);
	
	public SEND_RESULT sendVedioToMulti(VideoVO vedio);
	
	public CANCEL_RESULT cancelSendAudio(AudioVO audio);
	
	public AudioVO checkAudio(UserVO receiver);
	
	public VideoVO checkVideo(UserVO receiver);
	
	public SEND_RESULT resumeBreadTransfer(UserVO user);

}
