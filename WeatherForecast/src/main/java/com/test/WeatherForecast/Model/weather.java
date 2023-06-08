package com.test.WeatherForecast.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class weather {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer weatherId;
	
	private String weatherLocation;
	
	private String weathertemp;

	public Integer getWeatherId() {
		return weatherId;
	}

	public void setWeatherId(Integer weatherId) {
		this.weatherId = weatherId;
	}

	public String getWeatherLocation() {
		return weatherLocation;
	}

	public void setWeatherLocation(String weatherLocation) {
		this.weatherLocation = weatherLocation;
	}

	public String getWeathertemp() {
		return weathertemp;
	}

	public void setWeathertemp(String weathertemp) {
		this.weathertemp = weathertemp;
	}
	
}
