package com.gym.store.restimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.gym.store.rest.UserRest;
import com.gym.store.service.UserService;

@RestController
public class UserRestImpl implements UserRest{

	@Autowired
	UserService userService;

	@Override
	public ResponseEntity<String> signUp(Map<String, String> requestMap) {
		try {
			return userService.signUp(requestMap);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return new ResponseEntity<String>("{\"message\":\"Something went Wrong\"}",HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
