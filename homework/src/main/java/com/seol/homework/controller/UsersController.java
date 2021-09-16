package com.seol.homework.controller;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.seol.homework.domain.UserAnswer;
import com.seol.homework.domain.UserLogin;
import com.seol.homework.domain.UserResult;
import com.seol.homework.domain.Users;
import com.seol.homework.service.UsersService;

@Controller
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	@Autowired
	DefaultListableBeanFactory df;
		
	@RequestMapping(value = "/")
	public String home(HttpServletRequest req, HttpSession session) {
		for(String name : df.getBeanDefinitionNames()) {
			System.out.println("빈 이름 : " + df.getBean(name).getClass().getName());
		}
		
		return "home";
	}

//학생 리스트 블러오기 (테스트)
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String hello(ModelMap model) {
		List<Users> usersList = usersService.getUsersList();

		model.addAttribute("list", usersList);

		return "studentList";

	}

//답안지 입력 페이지로 이동
	@RequestMapping(value = "/answerSheet", method = RequestMethod.GET)
	public String getWrite(Model model, HttpServletRequest req) {

		HttpSession session = req.getSession();
		// 세션으로 로그인 확인
		//로그인 했으면
		if (session.getAttribute("user") != null) {
			return "answerSheet";
		} else {
			// 로그인 안 했으면
			return "redirect:/";
		}

	}

	/*
	 * 결과 페이지 유저 답안을 vo로 받는다. 서비스 레이어에 vo 전달 답을 문자열로 변경 유저 테이블에 입력 정답 테이블에서 답 가져옴 채점
	 * 결과값 컨트롤러에 전달 결과값을 페이지에 전달한다.
	 */
	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String getResult(UserAnswer userAnswer, Model model, HttpServletRequest req) {

		HttpSession session = req.getSession();
		// 세션으로 로그인 확인 
		// 로그인 했으면
		if (session.getAttribute("user") != null) {
			
			//유저가 입력한 값을 vo로 가져오고 서비스레이어에 있는 결과값 반환 메서드에 vo를 입력.
			//채점을 실시하고 결과값은 dto에 담아 반환
			UserResult userResult = usersService.getResult(userAnswer);
			//하나만 입력하면 자동으로 매핑
			model.addAttribute(userResult);
			//view 페이지 열기
			return "result";
		} else {
			// 로그인 안 했으면
			return "redirect:/";
		}
	}

	
	
	// 로그인 처리 과정
			// 로그인 form에서 vo로 아이디와 비밀번호를 가져오고 서비스 레이어에 입력
			// 서비스 레이어에서 dao로 전달하여 dao에서 데이터베이스에 아이디와 비밀번호 맞는지 확인한다.
			// 있으면 세션에 등록
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(UserLogin userLogin, HttpServletRequest req, RedirectAttributes rttr) {
	//파라미터 값을 Users로 두면 Post로 넘어올 시 필드값과 자동으로 맵핑 주의점은 필드 이름과 일치해야 함
		
		usersService.getUserLogin(userLogin);
		// 세션 값 가져오기
		HttpSession session = req.getSession();
		// 로그인 했으면 세션에 있으므로 있을 것
		if (session.getAttribute("user") != null) {

			System.out.println(session.getAttribute("user") + "로그인 user 정보");

			return "redirect:/answerSheet";
		} else {
			// 로그인 안 했으면
			System.out.println("로그인 실패");
			// msg 정보에 false 값이 들어가서 전송되는데 이 값은 다른 페이지로 이동하거나 새로고침을 하면 없어지는 일회용 값
			rttr.addFlashAttribute("msg", false);
			
			System.out.println(rttr.getFlashAttributes() + "이거는 이전");
			
			// 홈 페이지로
			return "redirect:/";
		}
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {

		// 세션값 확인
		Enumeration se = session.getAttributeNames();
		while (se.hasMoreElements()) {
			String getse = se.nextElement() + "";
			System.out.println("@@@@@ session: " + getse + ":" + session.getAttribute(getse));
		}

		// 세션값 제거
		session.invalidate();
		return "redirect:/";
	}
}
