package com.seol.homework.domain;

import lombok.Data;

@Data
public class UserLogin {
	private String userName;
	private String userPassword;
}
//로그인 정보를 가져오는 VO