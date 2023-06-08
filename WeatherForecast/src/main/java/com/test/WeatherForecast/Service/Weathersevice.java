package com.test.WeatherForecast.Service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.WeatherForecast.Authentication.SignIn;
import com.test.WeatherForecast.Model.weather;
import com.test.WeatherForecast.Repo.UserRepo;
import com.test.WeatherForecast.Repo.WeatherRepo;

@Service
public class Weathersevice {

	@Autowired
	WeatherRepo weatherRepo;
	UserRepo userRepo;
	weather weather;
	
	public String updateweather(SignIn signIn) {
	 User Usr = 	userRepo.FindByUserName(signIn.getUserName());
	 if(Usr==null) {
		 return "No such User and weather Report is not available";
	 }
	 weatherRepo.saveAll(signIn.getWeather());
	 
		return "Succesfully weather Updated";
	}

	public String deleteWeather(String Uname) {
		 User usr =  userRepo.FindByUserName(Uname);
		 if(usr == null) {
			 return "No such user defined weather is no exist";
		 }
		 userRepo.DeleteByUserName(Uname);
		return "Successfully deletaed";
	}

	public List<weather> gettingweather(String name) {
		User usr = userRepo.FindByUserName(name);
		  
		
		return usr.getWeather();
	}

	
	 
	 
	 
}
