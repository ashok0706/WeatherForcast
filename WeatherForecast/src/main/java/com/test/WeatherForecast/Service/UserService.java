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

	public String RegisterUser(SignUp signup) {
		
		userRepo.save(signup);
		return "Successfully registerd";
	}

	public User gettinguser(String name) {
	  User Uname = userRepo.FindByUserName(name);
	  
		return Uname ;
	}
	public String UserSign(SignIn signin) {
		User Usr =	userRepo.FindByPassword(signin.getPassword());
			
			if(Usr!=null) {
				return "You Succesfully Logined ";
			}
			return "No such user Excist";
	}

	

}
