package com.seol.homework.function;

import org.springframework.stereotype.Component;


public interface EncryptHelper {

	
	String encrypt(String password);
	
	boolean isMatch(String password, String hased);
	
}
