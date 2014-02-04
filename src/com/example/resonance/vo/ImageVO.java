package com.example.resonance.vo;

public class ImageVO {

	private long sendID;
	private long receiveID;
	private String sendTime;
	private String imagePath;
	
	public ImageVO(long sendID, long receiveID, String sendTime,
			String imagePath) {
		super();
		this.sendID = sendID;
		this.receiveID = receiveID;
		this.sendTime = sendTime;
		this.imagePath = imagePath;
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
	public String getImagePath() {
		return imagePath;
	}
	
	
	

}
