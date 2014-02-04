package com.example.resonance.vo;

public class QuestionVO {
	private String startWord;
	private String catalogy;
	private String content;
	
	public QuestionVO(String startWord, String catalogy, String content) {
		super();
		this.startWord = startWord;
		this.catalogy = catalogy;
		this.content = content;
	}
	public String getStartWord() {
		return startWord;
	}
	public String getCatalogy() {
		return catalogy;
	}
	public String getContent() {
		return content;
	}
	
}
