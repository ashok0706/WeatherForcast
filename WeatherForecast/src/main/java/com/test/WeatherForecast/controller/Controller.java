package com.test.WeatherForecast.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.WeatherForecast.Authentication.SignIn;
import com.test.WeatherForecast.Authentication.SignUp;
import com.test.WeatherForecast.Model.weather;
import com.test.WeatherForecast.Service.UserService;
import com.test.WeatherForecast.Service.Weathersevice;

@RestController
public class Controller {

	@Autowired
	UserService userservice;
	
	@Autowired
	Weathersevice weathersertvice;
	
	
	@PostMapping
	public String userSigup(@RequestBody SignUp signup  ) {
		return	userservice.RegisterUser(signup);
	}
	
	@PostMapping
	public String userSigup(@RequestBody SignIn signin  ) {
	return	userservice.RegisterUser(signin);
	}
	
	@PutMapping
	public String updateweather(SignIn signIn) {
		return	weathersertvice.updateweather(signIn);
	}
	
	@DeleteMapping("/Weather/{weatherid}/{username}")
	public String deleteWeatherById(@PathVariable String Id, @PathVariable String Uname) {
		return	weathersertvice.deleteWeather(Id);
	}
	
	@GetMapping("/User/{name}")
	public User gerttingUser(String name) {
		return userservice.gettinguser(name);
	}
	
	@GetMapping("/weather/{Userid}")
	public List<weather> gerttingWeather(String userid) {
		return	weathersertvice.gettingweather(userid);
	}
}
