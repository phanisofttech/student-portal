package com.pst.sp.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.pst.sp.dto.StudentProfileDto;
import com.pst.sp.dto.UserDto;
import com.pst.sp.service.StudentProfileService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class StudentProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
		StudentProfileService studentProfileService;
		StudentProfileDto dto = null;
		
		/*
		 * String rNumber = req.getParameter("rollNumber"); int rollNumber =
		 * Integer.parseInt(rNumber);
		 */
		HttpSession session=req.getSession();
	UserDto user=(UserDto)session.getAttribute("user");
		
		studentProfileService = new StudentProfileService();
		try {
		dto = studentProfileService.getStudentDetails(user.getRollNumber());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(dto != null) {
			req.setAttribute("dto", dto);
			RequestDispatcher dispatcher = req.getRequestDispatcher("./student_profile.jsp");
			dispatcher.forward(req, resp);
		}else {
			System.out.println("error");
		}
	}
      
}
