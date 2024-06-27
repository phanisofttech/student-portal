package com.pst.sp.dao;

import java.sql.SQLException;

import com.pst.sp.dto.StudentProfileDto;

public interface StudentProfileDao {
	
	public StudentProfileDto getStudentByRollNumber( int rollNumber)  throws SQLException;
}
