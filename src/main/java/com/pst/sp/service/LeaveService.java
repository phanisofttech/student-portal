package com.pst.sp.service;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.pst.sp.bo.LeaveBo;
import com.pst.sp.dao.LeaveDao;
import com.pst.sp.dao.LeaveDaoImpl;
import com.pst.sp.vo.LeaveVo;

import jakarta.servlet.http.HttpServletRequest;

public class LeaveService {
	
	private LeaveDao dao;

	public int createNewLeaveRequest(LeaveVo vo) throws SQLException {
		dao = new LeaveDaoImpl();
		// framing vo object to bo object
		
		// converting util fromdate, todate to sql fromdate todate
		// vo having java.util.Date fromDate and convert it into sql.Date format and stored into bo object
		// vo -> java.util.Date fromDate
		// bo -> java.sql.Date fromDate
		
		java.sql.Date fromDate = new java.sql.Date(vo.getFromDate().getTime());
		java.sql.Date toDate = new java.sql.Date(vo.getToDate().getTime());
		
		
		
		LeaveBo bo = new LeaveBo(vo.getRollNumber(), vo.getLeaveType(), vo.getReason(), fromDate, toDate, vo.getNumberOfDays(), "new", "", vo.getUserName());
		int i = dao.createNewLeave(bo);
		return i;
	}
	
//	public static void main(String[] args) throws ParseException {
//		
//		String d = "2021-01-01";
//		
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		java.util.Date udt = format.parse(d);
//		System.out.println(udt);
//		
//		java.sql.Date sdt = new java.sql.Date(udt.getTime());
//		System.out.println("sql date: "+sdt);
//		
//		
//		
//	}
	
}
