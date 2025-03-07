package com.pst.sp.service;

import java.sql.SQLException;

import com.pst.sp.dao.ViewLeaveRequestDao;
import com.pst.sp.dao.ViewLeaveRequestDaoImpl;
import com.pst.sp.dto.ViewLeaveRequestDto;

public class ViewLeaveRequestService {
    ViewLeaveRequestDto dto=null;
	public ViewLeaveRequestDto getLeaveDetails(int leaveId) throws SQLException {
		ViewLeaveRequestDao viewLeaveRequestDao;
		
		viewLeaveRequestDao=new ViewLeaveRequestDaoImpl();
		return viewLeaveRequestDao.getLeaveByRollNumber(leaveId);
		 
	}
}
