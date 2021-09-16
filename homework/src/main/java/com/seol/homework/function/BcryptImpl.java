package com.seol.homework.function;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;

@Component
public class BcryptImpl implements EncryptHelper {

	
	//암호화 만들기
	@Override
	public String encrypt(String password) {

		return BCrypt.hashpw(password, BCrypt.gensalt());
	}

	//일치여부확인
	@Override
	public boolean isMatch(String password, String hashed) {
		
		return BCrypt.checkpw(password, hashed);
	}

}
