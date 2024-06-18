package com.pst.sp.dao;

import java.sql.SQLException;

import com.pst.sp.bo.LeaveBo;

public interface LeaveDao {

	public int createNewLeave(LeaveBo bo) throws SQLException;
	
}
