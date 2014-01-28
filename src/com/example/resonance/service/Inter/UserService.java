package com.example.resonance.service.Inter;

import com.example.resonance.service.ENUM.LOGIN_RESULT;
import com.example.resonance.service.ENUM.LOGOUT_RESULT;
import com.example.resonance.service.ENUM.MODIFY_RESULT;
import com.example.resonance.service.ENUM.REGISTER_RESULT;
import com.example.resonance.vo.RegisterUserVO;
import com.example.resonance.vo.UserVO;

public interface UserService {
	
	public LOGIN_RESULT login(String userID,String password);
	
	public LOGOUT_RESULT logout(UserVO logoutUser);
	
	public REGISTER_RESULT registerUser(RegisterUserVO registerUser);
	
	public MODIFY_RESULT modifyProfile(UserVO user);
	
	public MODIFY_RESULT setInterests(UserVO user);

}
