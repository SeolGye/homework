package com.seol.homework.dao;

import java.util.List;

import com.seol.homework.domain.Answer;
import com.seol.homework.domain.UserLogin;
import com.seol.homework.domain.Users;

public interface UsersDAO {
	
	//테스트
	List<Users> getUsersList();
	//아이디로 유저정보(번호, 아이디, 패스워드, 입력값 가져오기)
	Users getUser(String userName);
	//유저 정보(번호, 아이디, 패스워드, 입력값) 업데이트하기
	void setUser(Users user);
	//번호로 정답 갖고오기
	String getAnswer(int answerId);
	//유저 로그인 정보 가져오기
	UserLogin getUserLogin(UserLogin userLogin);

	
}
