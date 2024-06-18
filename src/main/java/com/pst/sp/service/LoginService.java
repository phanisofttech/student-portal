package com.pst.sp.service;

import java.sql.SQLException;

import com.pst.sp.dao.UserDao;
import com.pst.sp.dao.UserDaoImpl;
import com.pst.sp.dto.UserDto;

public class LoginService {
	
	private UserDao dao;

	public UserDto doLogin(String userName, String password) throws SQLException {
		 dao = new UserDaoImpl();
		return dao.getUser(userName, password);
	}
	
}
