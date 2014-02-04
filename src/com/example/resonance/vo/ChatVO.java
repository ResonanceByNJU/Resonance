package com.example.resonance.vo;

import java.util.ArrayList;

public class ChatVO {
	private String chatFriendName;
	private String friendPicturePath;
	private String latestTime;
	private String latestWord;
	private ArrayList<MessageVO> messageList;
	private ArrayList<ImageVO> imageList;
	private ArrayList<AudioVO> audioList;
	private ArrayList<VideoVO> videoList;
	
	public ChatVO(String chatFriendName, String friendPicturePath,
			String latestTime, String latestWord,
			ArrayList<MessageVO> messageList, ArrayList<ImageVO> imageList,
			ArrayList<AudioVO> audioList, ArrayList<VideoVO> videoList) {
		super();
		this.chatFriendName = chatFriendName;
		this.friendPicturePath = friendPicturePath;
		this.latestTime = latestTime;
		this.latestWord = latestWord;
		this.messageList = messageList;
		this.imageList = imageList;
		this.audioList = audioList;
		this.videoList = videoList;
	}
	public String getChatFriendName() {
		return chatFriendName;
	}
	public String getFriendPicturePath() {
		return friendPicturePath;
	}
	public String getLatestTime() {
		return latestTime;
	}
	public String getLatestWord() {
		return latestWord;
	}
	public ArrayList<MessageVO> getMessageList() {
		return messageList;
	}
	public ArrayList<ImageVO> getImageList() {
		return imageList;
	}
	public ArrayList<AudioVO> getAudioList() {
		return audioList;
	}
	public ArrayList<VideoVO> getVideoList() {
		return videoList;
	}
	
	
}
