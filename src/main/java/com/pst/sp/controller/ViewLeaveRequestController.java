package com.pst.sp.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.pst.sp.dto.ViewLeaveRequestDto;
import com.pst.sp.service.ViewLeaveRequestService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ViewLeaveRequestController
 */
public class ViewLeaveRequestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 ViewLeaveRequestService viewLeaveRequestService;
    	 ViewLeaveRequestDto dto=null;
    	 String message="";
    	    
    	 String id=req.getParameter("leaveId");
    	 int leaveId=Integer.parseInt(id);
    	  
    	  viewLeaveRequestService=new ViewLeaveRequestService();
    	  try {
		  dto=viewLeaveRequestService.getLeaveDetails(leaveId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	  if(dto!=null) {
    		  req.setAttribute("leaveDto",dto);
    		  RequestDispatcher requestDispatcher=req.getRequestDispatcher("./view_leave_page_incharge.jsp");
    		  requestDispatcher.forward(req, resp);
    		  
    	  }else {
    		  System.out.println("error");
    		  message="Leave Request not Found.Try again..";
    		  
				/*
				 * req.setAttribute("message", message); RequestDispatcher
				 * requestDispatcher=req.getRequestDispatcher("./view_leave_page_incharge.jsp");
				 * requestDispatcher.forward(req, resp);
				 */
    	  }
    	 
    	}

}
