package com.seol.homework.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.seol.homework.dao.UsersDAO;
import com.seol.homework.domain.UserAnswer;
import com.seol.homework.domain.UserLogin;
import com.seol.homework.domain.UserResult;
import com.seol.homework.domain.Users;
import com.seol.homework.function.AnswerProcess;
import com.seol.homework.function.EncryptHelper;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersDAO dao;
	@Autowired
	private AnswerProcess answerProcess; // 커스텀 알고리즘

	@Autowired
	private EncryptHelper bcrypt;

	private UserResult userResult; // 유저 채점 결과값 dto

	private String userAnswerString; // 유저 입력값 문자열
	private Users currentUser; // 임시 유저 vo
	private String answerString; // 정답값

//유저 리스트 가져오는 메서드(테스트)
	@Override
	public List<Users> getUsersList() {

		return dao.getUsersList();
	}

//유저 채점 결과값 가져오기
	@Override
	public UserResult getResult(UserAnswer userAnswer) {

		// 세션 갖고 오기
		HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = req.getSession();

		// 유저가 입력한 vo를 문자열로 변환한다.
		userAnswerString = userAnswer.toString();

		// 세션에 현재 로그인 유저 가져온다.
		UserLogin userLogin = (UserLogin) session.getAttribute("user");
		// 세션은 아이디와 비밀번호 정보밖에 없다.

		// 아이디를 가지고 유저 정보를 가져온다.
		currentUser = dao.getUser(userLogin.getUserName());

		// vo에 있는 데이터 입력
		currentUser.setUserAnswer(userAnswerString);
		// 데이터베이스에 유저 정보 업데이트
		dao.setUser(currentUser);
		// 데이터베이스에서 정답 테이블에 id로 정답을 가져온다.
		answerString = dao.getAnswer(1);

		// 채점 클래스
		/*
		 * answerProcess = new AnswerProcess();
		 */
		// 유저 입력값과 정답을 비교한다.
		userResult = answerProcess.isItRight(userAnswerString, answerString);
		// 결과값을 반환
		return userResult;
	}

//로그인 프로세스
	/*
	 * 로그인하려는 유저 정보( 아이디 비밀번호) 가져온다. 아이디로 데이터베이스에서 유저정보 (번호 아이디 패스워드 입력값)를 가져온다.
	 * 입력값과 데이터베이스 비밀번호를 비교한다. Bcrypt.checkpw 일치하면 session에 아이디와 비밀번호를 등록한다. 일치하지
	 * 않으면 null 등록
	 */
	@Override
	public void getUserLogin(UserLogin userLogin) {
		// 세션 갖고오기
		HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = req.getSession();

		System.out.println("시도하려는 유저 : " + userLogin.toString());
		Users user = dao.getUser(userLogin.getUserName());
		if (user == null) {
			System.out.println("유저가 없습니다 ㅠ");
			session.setAttribute("user", null);
		} else {
			System.out.println("유저입력값 : " + userLogin.getUserPassword() + "데이터베이스에 있는 암호값 : " + user.getUserPassword());
			boolean correctFlag = bcrypt.isMatch(userLogin.getUserPassword(), user.getUserPassword());
			UserLogin login = new UserLogin();
			if (correctFlag == true) {
				System.out.println(correctFlag + "일치한다.");
				login.setUserName(user.getUserName());
				login.setUserPassword(user.getUserPassword());
				session.setAttribute("user", login);
			} else {
				System.out.println(correctFlag + "불일치");
				session.setAttribute("user", null);
			}
		}

		// 서비스 레이어에서 dao로 전달하여 dao에서 데이터베이스에 아이디와 비밀번호 맞는지 확인한다.
		// UserLogin login = dao.getUserLogin(userLogin);

		// if(login == null) {
		// 없으면 null
		// session.setAttribute("user", null);
		// }else {
		// 있으면 세션에 등록
		// session.setAttribute("user", login);
		// }
	}
}
