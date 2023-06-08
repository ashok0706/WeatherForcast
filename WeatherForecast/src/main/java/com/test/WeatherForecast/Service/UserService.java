package com.test.WeatherForecast.Service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.WeatherForecast.Authentication.SignIn;
import com.test.WeatherForecast.Authentication.SignUp;
import com.test.WeatherForecast.Model.weather;
import com.test.WeatherForecast.Repo.UserRepo;
import com.test.WeatherForecast.Repo.WeatherRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	WeatherRepo weatherRepo;

	public String RegisterUser(SignIn signin) {
		userRepo.save(signin);
		return "Successfully registerd";
	}

	public User gettinguser(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
