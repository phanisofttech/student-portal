package com.pst.sp.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.pst.sp.service.UserService;
import com.pst.sp.vo.UserVo;

/**
 * Servlet implementation class UserController
 */
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;
	private UserVo vo;
	private String message = "";
	private String result = "";
       
   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   int i = 0;
	   
	   String rNo = req.getParameter("rollNumber");
	   int rollNumber = Integer.parseInt(rNo);
	   String userName = req.getParameter("userName");
	   String password = req.getParameter("password");
	   String secQuestion1 = req.getParameter("sq1");
	   String secQuestion2 = req.getParameter("sq2");
	   String ans1 = req.getParameter("ans1");
	   String ans2 = req.getParameter("ans2");
	   
	   vo = new UserVo(rollNumber, userName, password, secQuestion1, secQuestion2, ans1, ans2);
	   userService = new UserService();
	   try {
		i = userService.registerNewUser(vo);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	   
	   
	   if(i > 0) {
		   result = "success";
		   message = "Successfully registered";
	   } else {
		   result = "danger";
		   message = "Registration failed. Please try again";
	   }
	   
	   req.setAttribute("msg", message);
	   req.setAttribute("result", result);
	   RequestDispatcher dispatcher = req.getRequestDispatcher("./home.jsp");
	   dispatcher.forward(req, resp);
	   
	   
	   
    }

}
