package com.pst.sp.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.pst.sp.dto.UserDto;
import com.pst.sp.service.LeaveService;
import com.pst.sp.vo.LeaveVo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LeaveController
 */
public class LeaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private LeaveService leaveService;

	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		Date fromDate = null;
		Date toDate = null;
		int i = 0;
		String message = "";
		String status = "error";
		
		
			String rNum = req.getParameter("rollNumber");
			int rollNumber = Integer.parseInt(rNum);
			
			String leaveType = req.getParameter("leaveType");
			String reason = req.getParameter("reason");
			String fDate = req.getParameter("fromDate");
			String tDate = req.getParameter("toDate");
			
			try {
				fromDate = formatter.parse(fDate);
				toDate = formatter.parse(tDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			
			
			String nod = req.getParameter("numberOfDays");
			int numberOfDays = Integer.parseInt(nod);
			
			
			// framing vo object
			
//			LeaveVo vo = new LeaveVo();
//			vo.setRollNumber(rollNumber);
//			vo.setLeaveType(leaveType);
			
			HttpSession session = req.getSession();
			UserDto user = (UserDto)session.getAttribute("user");
			
			
			LeaveVo vo = new LeaveVo(rollNumber, leaveType, reason, fromDate, toDate, numberOfDays, user.getUserName());
			
			leaveService = new LeaveService();
			try {
				i = leaveService.createNewLeaveRequest(vo);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			if(i > 0) {
				message = "Leave request submitted successfully";
				status = "success";
			} else {
				message = "Leave request failed";
				status = "danger";
			}
			
			req.setAttribute("message", message);
			req.setAttribute("result", status);
			RequestDispatcher dispatcher = req.getRequestDispatcher("leaves.jsp");
			dispatcher.forward(req, resp);
			
	
	    }
	
	
}
