package com.example.resonance.vo;

public class VideoVO {
	private long sendID;
	private long receiveID;
	private String sendtime;
	private String videoPath;
	
	public VideoVO(long sendID, long receiveID, String sendtime,
			String videoPath) {
		super();
		this.sendID = sendID;
		this.receiveID = receiveID;
		this.sendtime = sendtime;
		this.videoPath = videoPath;
	}
	public long getSendID() {
		return sendID;
	}
	public long getReceiveID() {
		return receiveID;
	}
	public String getSendtime() {
		return sendtime;
	}
	public String getVideoPath() {
		return videoPath;
	}
	
	
	
}
