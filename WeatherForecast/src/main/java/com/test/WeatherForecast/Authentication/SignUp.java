package com.test.WeatherForecast.Authentication;

import lombok.Data;

@Data
public class SignUp {

	private Integer UserId;
	   private String UserName;
	   
	   private String userEmaileString;
	   private String phoneString;
	   private String password;
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserEmaileString() {
		return userEmaileString;
	}
	public void setUserEmaileString(String userEmaileString) {
		this.userEmaileString = userEmaileString;
	}
	public String getPhoneString() {
		return phoneString;
	}
	public void setPhoneString(String phoneString) {
		this.phoneString = phoneString;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
