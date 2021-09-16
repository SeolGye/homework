package com.seol.homework.service;

import java.util.List;

import com.seol.homework.domain.UserAnswer;
import com.seol.homework.domain.UserLogin;
import com.seol.homework.domain.UserResult;
import com.seol.homework.domain.Users;

public interface UsersService {

	List<Users> getUsersList();

//유저 로그인 정보 가져오기
	void getUserLogin(UserLogin userLogin);

//유저 결과값 가져오기
	UserResult getResult(UserAnswer userAnswer);
	
}


/*
 * 컨트롤러에서 입력값을 vo로 받음 
 * 서비스 레이어에 vo 전달 
 * 서비스 레이어에서 vo 필드값을 문자열화 알고리즘 실행 
 * 				문자열을 dao에 전달하여 유저 데이터에 저장 
 * 				dao으로 데이터베이스에서 답을 가져옴 
 * 				유저입력값과 답을 비교하는 알고리즘 실행 
 * 				결과값을 dto에 입력하여 컨트롤러에 전달 
 * 컨트로러에서 dto를 받아 view에 전달 
 * view에서 보여줌
 */
