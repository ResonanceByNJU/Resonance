package com.example.resonance.vo;

public class AudioVO {

	private long sendID;
	private long receiveID;
	private String sendTime;
	private String audioPath;
	private int lastTime;
	
	public AudioVO(long sendID, long receiveID, String sendTime,
			String audioPath, int lastTime) {
		super();
		this.sendID = sendID;
		this.receiveID = receiveID;
		this.sendTime = sendTime;
		this.audioPath = audioPath;
		this.lastTime = lastTime;
	}
	
	public long getSendID() {
		return sendID;
	}
	public long getReceiveID() {
		return receiveID;
	}
	public String getSendTime() {
		return sendTime;
	}
	public String getAudioPath() {
		return audioPath;
	}
	public int getLastTime() {
		return lastTime;
	}
	
	

}
