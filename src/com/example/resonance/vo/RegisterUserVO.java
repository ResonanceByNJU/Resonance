package com.example.resonance.vo;

public class RegisterUserVO {
	private String username;
	private String password;
	private String comfirmPassword;
	private String imagePath;
	
	public RegisterUserVO(String username, String password,
			String comfirmPassword, String imagePath) {
		super();
		this.username = username;
		this.password = password;
		this.comfirmPassword = comfirmPassword;
		this.imagePath = imagePath;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getComfirmPassword() {
		return comfirmPassword;
	}
	public String getImagePath() {
		return imagePath;
	}
	
	
	
}
