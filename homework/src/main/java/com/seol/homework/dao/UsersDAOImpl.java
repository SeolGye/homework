package com.seol.homework.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seol.homework.domain.Answer;
import com.seol.homework.domain.UserLogin;
import com.seol.homework.domain.Users;
import com.seol.homework.domain.UsersMapper;



@Repository
public class UsersDAOImpl implements UsersDAO {

	
	
	@Autowired
	private SqlSession sqlSession;
	
	//테스트
	@Override
	public List<Users> getUsersList() {
	
		List<Users> result = new ArrayList<Users>();
		UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
		result = usersMapper.getUsersList();
		/*
		 * logger.info("UsersDAO 에서 getUsersList를 가져온다");
		 */		
		return result;
	}
	//아이디로 유저정보(번호, 아이디, 패스워드, 입력값 가져오기)
	@Override
	public Users getUser(String userName) {
		System.out.println(userName + "유저 정보를 갖고온다.");
		return sqlSession.getMapper(UsersMapper.class).getUser(userName);
	
	}
	
	//유저 정보(번호, 아이디, 패스워드, 입력값) 업데이트하기
	@Override
	public void setUser(Users user) {

		sqlSession.getMapper(UsersMapper.class).setUser(user);
		
	}
	/*
	 * UsersMapper 인터페이스에 있는 setUser 메소드를 사용.
	 * 인터페이스 기능은 UsersMapper.xml에 정의 
	 * 인터페이스가 xml을 사용하기 위해서 위치를 알아야함
	 * 위치 정보는 sqlSessionFactory에 정의 
	 * sqlSession은 sqlSessionFactory를 가리킨다. 
	 * 이 정보는 root-context.xml에 정의되어있다.
	 * 
	 * DAO는 Mapper에 있는 기능ㄹ 가져다 사용. 
	 */
	
	//번호로 정답 갖고오기
	@Override
	public String getAnswer(int answerId) {

		return sqlSession.getMapper(UsersMapper.class).getAnswer(answerId);
	}
	
	//입력한 로그인 정보로 회원 테이블에 있는지 확인하기
	@Override
	public UserLogin getUserLogin(UserLogin userLogin) {
		
		return sqlSession.getMapper(UsersMapper.class).getUserLogin(userLogin);
	}
	
	
}

