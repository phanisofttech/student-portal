package com.pst.sp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pst.sp.bo.LeaveBo;
import com.pst.sp.common.Constants;
import com.pst.sp.util.DatabaseConnection;

public class LeaveDaoImpl  implements LeaveDao{

	@Override
	public int createNewLeave(LeaveBo bo) throws SQLException {
		
		
		Connection con = DatabaseConnection.getDatabaseConnection();
		PreparedStatement ps = con.prepareStatement(Constants.NEW_LEAVE_REQUEST);
		ps.setInt(1, bo.getRollNumber());
		ps.setString(2, bo.getLeaveType());
		ps.setString(3, bo.getReason());
		ps.setDate(4, bo.getFromDate());
		ps.setDate(5, bo.getToDate());
		ps.setInt(6, bo.getNumberOfDays());
		ps.setString(7, bo.getStatus());
		ps.setString(8, bo.getComments());
		ps.setString(9, bo.getCreatedBy());
		int i = ps.executeUpdate();
		return i;
	}

}
