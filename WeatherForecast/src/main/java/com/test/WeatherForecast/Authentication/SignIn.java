package com.test.WeatherForecast.Authentication;

import java.util.List;

import javax.persistence.OneToMany;

import com.test.WeatherForecast.Model.weather;

import lombok.Data;

@Data

public class SignIn {

	private String userName;
	
	private String password;
	
	@OneToMany
	private List<weather> weather;
	
	public List<weather> getWeather() {
		return weather;
	}
	public void setWeather(List<weather> weather) {
		this.weather = weather;
	}
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


	
	
}