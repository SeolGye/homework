package com.seol.homework.domain;

import lombok.Data;

@Data
public class UserAnswer {
	private String q1="0";
	private String q2="0";
	private String q3="0";
	private String q4="0";
	private String q5="0";
	private String q6="0";
	private String q7="0";
	private String q8="0";
	private String q9="0";
	private String q10="0";
	
	@Override
	public String toString() {
		return q1 + q2 + q3 + q4 + q5 + q6
				+ q7 + q8 + q9 + q10 ;
	}
	
	// 답 입력 페이지에서 입력한 정보를 담는 VO
}
