package com.pst.sp.service;

import java.sql.SQLException;

import com.pst.sp.dao.StudentProfileDao;
import com.pst.sp.dao.StudentProfileDaoImpl;
import com.pst.sp.dto.StudentProfileDto;

public class StudentProfileService {
	
	public StudentProfileDto getStudentDetails( int rollNumber) throws SQLException {
		
		StudentProfileDao studentProfileDao ;
		studentProfileDao = new StudentProfileDaoImpl();
		
		return studentProfileDao.getStudentByRollNumber(rollNumber);
	}
}
