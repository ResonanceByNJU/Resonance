package com.example.resonance.vo;

public class ProblemBeforeChatVO {
	private String username;
	private String problem;
	private String answer;
	
	public ProblemBeforeChatVO(String username, String problem, String answer) {
		super();
		this.username = username;
		this.problem = problem;
		this.answer = answer;
	}
	public String getUsername() {
		return username;
	}
	public String getProblem() {
		return problem;
	}
	public String getAnswer() {
		return answer;
	}
	
	
	
}
