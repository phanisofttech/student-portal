<%@page import="com.pst.sp.dto.ViewLeaveRequestDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Leave In Incharge</title>
<link href="css/leaves_styles.css" rel="stylesheet">
</head>
<body>
<%
ViewLeaveRequestDto dto= (ViewLeaveRequestDto)request.getAttribute("leaveDto");
%>
<%@ include file="student_navigation_bar.html" %>

<div class="container mt-3">
      <div class="modal-body">
					<div class="form-group mb-2">
						<label for="leaveId">Leave Id</label> <input
							class="form-control"  id="leaveId"
							type="text" disabled="disabled" value="<%=dto.getId()%>" name="leaveId" />
					</div>
					 <div class="form-group mb-2">
                        <label for="rollNumber">Roll Number</label>
                        <input class="form-control" disabled="disabled" value="<%=dto.getRollNumber() %>"  id="rollNumber" type="text" name="rollNumber"/>
                    </div>
                     <div class="form-group mb-2">
                        <label for="type">Leave Type</label>
                        <input class="form-control" disabled="disabled" value="<%=dto.getLeaveType() %>"  id="type" type="text" name="type"/>
                    </div>
					<div class="form-group mb-2">
                        <label for="reason">Reason</label>
                        <input class="form-control" disabled="disabled" type="text"  id="reason" value="<%=dto.getReason() %>" name="reason">
                    </div>
                      <div class="form-group mb-2">
                        <label for="fromDate">From Date</label>
                        <input class="form-control" disabled="disabled" value="<%=dto.getFromDate() %>" id="fromDate" type="text" name="fromDate"/>
					</div>
					<div class="form-group mb-2">
                        <label for="toDate">To Date</label>
                        <input class="form-control" disabled="disabled" id="toDate" type="text" value="<%=dto.getToDate() %>" name="toDate"/>
					</div>
					 <div class="form-group mb-2">
                        <label for="numberOfDays">Number Of Days</label>
                        <input class="form-control" disabled="disabled" value="<%=dto.getNumberOfDays() %>" id="numberOfDays" type="text" name="numberOfDays"/>
                    </div>
                    <div class="form-group mb-2">
                        <label for="createdAt">Created At</label>
                        <input class="form-control" disabled="disabled" id="createdAt" type="text" value="<%=dto.getCreatedAt() %>" name="createdAt"/>
					</div>		
				</div>
      <div class="modal-footer">
      <button type="button" id="approvebt" class="btn btn-primary">Approve</button>
        <button type="button" id="approvebt" class="btn btn-warning">Reject</button>
      </div>
     </div>
</body>
</html>