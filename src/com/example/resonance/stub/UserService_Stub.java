package com.example.resonance.stub;

import com.example.resonance.service.ENUM.LOGIN_RESULT;
import com.example.resonance.service.ENUM.LOGOUT_RESULT;
import com.example.resonance.service.ENUM.MODIFY_RESULT;
import com.example.resonance.service.ENUM.REGISTER_RESULT;
import com.example.resonance.service.Inter.UserService;
import com.example.resonance.utils.PrintHelper;
import com.example.resonance.vo.RegisterUserVO;
import com.example.resonance.vo.UserVO;

/**
 *Class <code>UserService_Stub.java</code> UserService接口的桩。
 *
 * @author never
 * @date 2014-2-4
 */
public class UserService_Stub implements UserService{

	/* (non-Javadoc)
	 * Title: login
	 * Description:验证用户登陆.
	 * @see com.example.resonance.service.Inter.UserService#login(java.lang.String, java.lang.String)
	 */
	@Override
	public LOGIN_RESULT login(String userID, String password) {
		PrintHelper.Print(getClass().getName(), "login");
	
		if(userID.equals(TestVOs.login_id) && password.equals(TestVOs.login_password)) {
			return LOGIN_RESULT.登陆成功;
		}
		return LOGIN_RESULT.用户名或密码错误;
	}

	/* (non-Javadoc)
	 * Title: logout
	 * Description:处理用户注销.
	 * @see com.example.resonance.service.Inter.UserService#logout(com.example.resonance.vo.UserVO)
	 */
	@Override
	public LOGOUT_RESULT logout(UserVO logoutUser) {
		PrintHelper.Print(getClass().getName(), "logout");
		if(logoutUser == null) {
			return LOGOUT_RESULT.其他错误;
		}
		return LOGOUT_RESULT.登出成功;
	}

	/* (non-Javadoc)
	 * Title: registerUser
	 * Description:注册用户。
	 * @see com.example.resonance.service.Inter.UserService#registerUser(com.example.resonance.vo.RegisterUserVO)
	 */
	@Override
	public REGISTER_RESULT registerUser(RegisterUserVO registerUser) {
		PrintHelper.Print(getClass().getName(), "registerUser");
		
		if(registerUser == null) {
			return REGISTER_RESULT.其他错误;
		} else {
			return REGISTER_RESULT.注册成功;
		}
	}

	/* (non-Javadoc)
	 * Title: modifyProfile
	 * Description:修改个人信息.
	 * @see com.example.resonance.service.Inter.UserService#modifyProfile(com.example.resonance.vo.UserVO)
	 */
	@Override
	public MODIFY_RESULT modifyProfile(UserVO user) {
		PrintHelper.Print(getClass().getName(), "modifyProfile");
		if(user == null) {
			return MODIFY_RESULT.其他错误;
		}
		return MODIFY_RESULT.修改成功;
	}

	/* (non-Javadoc)
	 * Title: setInterests
	 * Description:设置个人兴趣.  ??
	 * @see com.example.resonance.service.Inter.UserService#setInterests(com.example.resonance.vo.UserVO)
	 */
	@Override
	public MODIFY_RESULT setInterests(UserVO user) {
		//TODO
		PrintHelper.Print(getClass().getName(), "setInterests");
		if(user == null) {
			return MODIFY_RESULT.其他错误;
		}
		return MODIFY_RESULT.修改成功;
	}

}
