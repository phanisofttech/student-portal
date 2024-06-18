package com.pst.sp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pst.sp.bo.UserBo;
import com.pst.sp.common.Constants;
import com.pst.sp.dto.UserDto;
import com.pst.sp.util.DatabaseConnection;

public class UserDaoImpl implements UserDao{
   
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private UserDto userDto = null;
	
	@Override
	public int addUser(UserBo bo) throws SQLException {
		
		con = DatabaseConnection.getDatabaseConnection();
		PreparedStatement ps = con.prepareStatement(Constants.INSERT_USER_QUERY);
		ps.setInt(1, bo.getRollNumber());
		ps.setString(2, bo.getUserName());
		ps.setString(3, bo.getPassword());
		ps.setString(4, bo.getSecQuestion1());
		ps.setString(5, bo.getAns1());
		ps.setString(6, bo.getSecQuestion2());
		ps.setString(7, bo.getAns2());
		ps.setString(8, bo.getCreatedBy());
		int i = ps.executeUpdate();
		return i;
	}
	
	
	@Override
	public UserDto getUser(String userName, String password) throws SQLException {
		
		con = DatabaseConnection.getDatabaseConnection();
		ps = con.prepareStatement(Constants.GET_ACCOUNT_QUERY);
		ps.setString(1, userName);
        ps.setString(2, password);	
        rs = ps.executeQuery();
        if(rs.next()) {
        	userDto = new UserDto(
        			rs.getInt(1),
        			rs.getInt(2),
        			rs.getString(3),
        			rs.getString(4),
        			rs.getString(5),
        			rs.getString(7),
        			rs.getString(6),
        			rs.getString(8),
        			rs.getString(9),
        			rs.getDate(10),
        			rs.getDate(11));
        }
        return userDto;
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		DatabaseConnection.closeConnection(con);
	}

}
