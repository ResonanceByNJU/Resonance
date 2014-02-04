package com.example.resonance.vo;

import java.util.ArrayList;

public class QuestionListVO {
	private ArrayList<QuestionVO> problemList;

	public QuestionListVO(ArrayList<QuestionVO> problemList) {
		super();
		this.problemList = problemList;
	}

	public ArrayList<QuestionVO> getProblemList() {
		return problemList;
	}
	
	
	
}
