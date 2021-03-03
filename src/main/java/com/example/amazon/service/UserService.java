package com.example.amazon.service;

import com.example.amazon.dto.UserRequestDto;
import com.example.amazon.model.User;

public interface UserService {

	boolean saveUserDetails(UserRequestDto userRequestDto);

	String authenticate(String username, String password);

}
