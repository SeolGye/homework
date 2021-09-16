package com.seol.homework.domain;

import lombok.Data;

@Data
public class UserResult {

	//입력 문제 수
	private int userInputCount;
	//정답 수
	private int correctCount;
	//정답 비율
	private float correctPercent;
	//총점
	private int totalScore;
	//합격 불합격
	private boolean passOrFail;
	
}
