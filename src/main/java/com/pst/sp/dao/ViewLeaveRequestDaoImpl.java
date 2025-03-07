package com.pst.sp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.pst.sp.common.Constants;
import com.pst.sp.dto.ViewLeaveRequestDto;
import com.pst.sp.util.DatabaseConnection;

public class ViewLeaveRequestDaoImpl implements ViewLeaveRequestDao{

	@Override
	public ViewLeaveRequestDto getLeaveByRollNumber(int leaveId) throws SQLException {
        ViewLeaveRequestDto dto=null;
        
		Connection con=DatabaseConnection.getDatabaseConnection();
		PreparedStatement ps=con.prepareStatement(Constants.GET_LEAVE_REQUEST_BY_ROLLNUMBER);
		ps.setInt(1,leaveId);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			dto=new ViewLeaveRequestDto(rs.getInt(1),
					rs.getInt(2),
					rs.getString(3),
					rs.getString(4),
					rs.getDate(5),
					rs.getDate(6),
					rs.getInt(7),
					rs.getString(8),
					rs.getString(9),
					rs.getString(10),
					rs.getString(11),
					rs.getString(12));		
		}
		return dto;
	}

}
