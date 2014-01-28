package com.example.resonance.po;

public class AudioPO {
	
	private long audioID;
	private long senderID;
	private long recevicerID;
	private String sendTime;
	private double audioSize;
	private int lastTime;
	
	public long getAudioID() {
		return audioID;
	}
	public void setAudioID(long audioID) {
		this.audioID = audioID;
	}
	public long getSenderID() {
		return senderID;
	}
	public void setSenderID(long senderID) {
		this.senderID = senderID;
	}
	public long getRecevicerID() {
		return recevicerID;
	}
	public void setRecevicerID(long recevicerID) {
		this.recevicerID = recevicerID;
	}
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	public double getAudioSize() {
		return audioSize;
	}
	public void setAudioSize(double audioSize) {
		this.audioSize = audioSize;
	}
	public int getLastTime() {
		return lastTime;
	}
	public void setLastTime(int lastTime) {
		this.lastTime = lastTime;
	}
	
	
	
}
