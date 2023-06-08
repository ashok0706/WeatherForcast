package com.test.WeatherForecast.Repo;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

public	User FindByPassword(String password);

public	User FindByUserName(String name);

public void DeleteByUserName(String uname);

}
