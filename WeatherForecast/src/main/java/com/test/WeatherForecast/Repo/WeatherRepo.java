package com.test.WeatherForecast.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.WeatherForecast.Model.weather;
@Repository
public interface WeatherRepo extends JpaRepository<weather, Integer>{

}
