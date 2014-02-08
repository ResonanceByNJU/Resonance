package com.example.resonance.vo;

import java.io.Serializable;

public class MessageVO implements Serializable {
	private static final long serialVersionUID = 1L;
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
