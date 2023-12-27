package com.jsp.medicworld.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.medicworld.entity.User;

public interface UserDao extends JpaRepository<User, Integer>
 {
	@Query(value="select * from user where email=?1",nativeQuery=true)
	public User getusermaill(String usermail);
}
