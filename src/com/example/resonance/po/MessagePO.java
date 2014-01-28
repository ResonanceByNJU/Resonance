package com.example.resonance.po;

public class MessagePO {
	
	private long messageID;
	private long senderID;
	private long receiverID;
	private String sendTime;
	private String message;
	
	public long getMessageID() {
		return messageID;
	}
	public void setMessageID(long messageID) {
		this.messageID = messageID;
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
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
