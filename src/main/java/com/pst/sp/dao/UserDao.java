package com.pst.sp.dao;

import java.sql.SQLException;

import com.pst.sp.bo.UserBo;
import com.pst.sp.dto.UserDto;

public interface UserDao {

	public int addUser(UserBo bo)throws SQLException;
	public UserDto getUser(String userName, String password)throws SQLException;
	
	
}
