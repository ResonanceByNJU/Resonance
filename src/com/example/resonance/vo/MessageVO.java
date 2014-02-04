package com.example.resonance.vo;

public class MessageVO {

	private long sendID;
	private long receiveID;
	private String sendTime;
	private String message;
	
	public MessageVO(long sendID, long receiveID, String sendTime,
			String message) {
		super();
		this.sendID = sendID;
		this.receiveID = receiveID;
		this.sendTime = sendTime;
		this.message = message;
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
	public String getMessage() {
		return message;
	}
	
	

}
