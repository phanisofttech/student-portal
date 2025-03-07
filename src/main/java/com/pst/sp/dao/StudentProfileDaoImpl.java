package com.pst.sp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pst.sp.common.Constants;
import com.pst.sp.dto.StudentProfileDto;
import com.pst.sp.util.DatabaseConnection;

public class StudentProfileDaoImpl implements StudentProfileDao {

	@Override
	public StudentProfileDto getStudentByRollNumber(int rollNumber) throws SQLException {
		
		StudentProfileDto dto = null;
     
		Connection con = DatabaseConnection.getDatabaseConnection();
		PreparedStatement ps = con.prepareStatement(Constants.GET_STUDENT_PROFILE_QUERY);
		ps.setInt(1,rollNumber);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			 dto = new StudentProfileDto(rs.getInt(1),
					 rs.getString(2), rs.getString(3),
			         rs.getDate(4), rs.getString(5),
			         rs.getString(6), rs.getString(7),
			         rs.getString(8), rs.getString(9),
			         rs.getDate(10), rs.getDate(11));
		}
		return dto;
	}
}