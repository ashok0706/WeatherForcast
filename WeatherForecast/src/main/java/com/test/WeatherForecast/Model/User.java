package com.test.WeatherForecast.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor 
public class User {
  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer UserId;
   private String UserName;
   
   private String userEmaileString;
   private String phoneString;
   private String password;
   
   @OneToMany(cascade = CascadeType.ALL)
   private List<weather> weather;
   
   
   
/**
 * @param userId
 * @param userName
 * @param userEmaileString
 * @param phoneString
 * @param password
 */
public User(Integer userId, String userName, String userEmaileString, String phoneString, String password) {
	super();
	UserId = userId;
	UserName = userName;
	this.userEmaileString = userEmaileString;
	this.phoneString = phoneString;
	this.password = password;
}
public List<weather> getWeather() {
	return weather;
}
public void setWeather(List<weather> weather) {
	this.weather = weather;
}
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
