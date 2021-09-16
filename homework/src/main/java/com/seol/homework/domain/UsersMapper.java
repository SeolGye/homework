package com.seol.homework.domain;

import java.util.List;

public interface UsersMapper {

	//usersMapper 인터페이스로 구현은 xml에서 한다. 다형성 
//테스트
		List<Users> getUsersList();
//유저정보 가져오기
		Users getUser(String userName);
//유저 답 설정하기
		void setUser(Users vo);
//정답 갖고오기
		String getAnswer(int answerId);
		
//유저 로그인 정보 가져오기
		UserLogin getUserLogin(UserLogin userLogin);
}
