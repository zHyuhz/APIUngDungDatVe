package com.DoAnChuyenNganh.UngDungDatVeXemPhim.dto.request;

import jakarta.validation.constraints.Size;

public class RegisterAccountRequest {
	private String userName;
	@Size(min = 8, message = "ACCOUNT_PASSWORD_INVALID")
	private String password; 
	private String email; 
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
