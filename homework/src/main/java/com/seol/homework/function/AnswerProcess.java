package com.seol.homework.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.seol.homework.domain.UserAnswer;
import com.seol.homework.domain.UserResult;

@Component
public class AnswerProcess {

	List<String> userAnswerValue = new ArrayList<>();
	List<String> userAnswerFinal = new ArrayList<>();

	private UserResult userResult = new UserResult();

	// 입력 문제 수
	private int userInputCount;
	// 정답 수
	private int correctCount;
	// 정답 비율
	private float correctPercent;
	// 총점
	private int totalScore;
	// 합격 불합격
	private boolean passOrFail;

	List<String> userStrList = new ArrayList<>();
	List<String> answerStrList = new ArrayList<>();

// 유저 입력값과 정답을 비교
	public UserResult isItRight(String userStr, String answerStr) {

		// 입력 문제 수
		userInputCount = 0;
		// 정답 수
		correctCount = 0;
		// 정답 비율
		correctPercent = 0;
		// 총점
		totalScore = 0;
		// 합격 불합격
		passOrFail = false;

		// 입력 문자열을 arrayList로 옮긴다.
		userStrList = Arrays.asList(userStr.split(""));
		answerStrList = Arrays.asList(answerStr.split(""));

		// 하나씩 비교
		for (int i = 0; i < answerStrList.size(); i++) {
			if (userStrList.get(i).equals("0")) {
				// 0이면 다음 문제
				continue;
			} else // 0이 아니면
			{
				// 유저 문제 수 증가
				userInputCount += 1;

				if (userStrList.get(i).equals(answerStrList.get(i))) {
					// i 번째 문자가 같다면 정답 수 증가
					correctCount += 1;
				} else {
					// 틀리면 다음 문제
					continue;
				}
			}
		}

		// 정답비율 계산
		correctPercent = (correctCount/(float)answerStrList.size()) * 100;
		// 총점 계싼
		totalScore = correctCount * 10;
		// 합격 불합격 판단
		if (totalScore >= 60) {
			passOrFail = true;
		} else {
			passOrFail = false;
		}

		// 객체에 주입
		userResult.setCorrectCount(correctCount);
		userResult.setCorrectPercent(correctPercent);
		userResult.setPassOrFail(passOrFail);
		userResult.setTotalScore(totalScore);
		userResult.setUserInputCount(userInputCount);

		// 비교하고 dto에 넣어서 반환
		return userResult;
	}
}
