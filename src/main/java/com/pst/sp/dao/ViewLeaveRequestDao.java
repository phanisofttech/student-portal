package com.pst.sp.dao;

import java.sql.SQLException;

import com.pst.sp.dto.ViewLeaveRequestDto;

public interface ViewLeaveRequestDao {

	public ViewLeaveRequestDto getLeaveByRollNumber(int leaveId) throws SQLException;
}
