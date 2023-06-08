package com.test.WeatherForecast.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class User {
  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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