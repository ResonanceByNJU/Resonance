package com.example.resonance.po;

public class VideoPO {
	
	private long videoID;
	private long senderID;
	private long receiverID;
	private String sendtime;
	private String videoPath;
	
	public long getVideoID() {
		return videoID;
	}
	public void setVideoID(long videoID) {
		this.videoID = videoID;
	}
	public long getSenderID() {
		return senderID;
	}
	public void setSenderID(long senderID) {
		this.senderID = senderID;
	}
	public long getReceiverID() {
		return receiverID;
	}
	public void setReceiverID(long receiverID) {
		this.receiverID = receiverID;
	}
	public String getSendtime() {
		return sendtime;
	}
	public void setSendtime(String sendtime) {
		this.sendtime = sendtime;
	}
	public String getVideoPath() {
		return videoPath;
	}
	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}
	
	
	
}
