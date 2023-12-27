package com.jsp.medicworld.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.medicworld.dao.UserDao;
import com.jsp.medicworld.entity.User;
import com.jsp.medicworld.service.UserService;
@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	private UserDao repo;
	
	@Override
	public User getObject(String usermail) {
		return repo.getusermaill(usermail);
	}

}
