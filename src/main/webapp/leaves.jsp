<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leaves</title>
<link href="css/leaves_styles.css" rel="stylesheet">
</head>
<body>
<%@ include file="student_navigation_bar.html" %>

<%
String message = request.getAttribute("message") == null ? "" : (String)request.getAttribute("message");
String result = request.getAttribute("result") == null ? "" : (String)request.getAttribute("result");

%>

<h1 class="text-center">Leave Requests</h1>

<div class="container table-container">

<% if(!message.equals("") && !result.equals("")) { %>
<div class="alert alert-<%=result %> alert-dismissible fade show" role="alert">
  <strong><%=message %></strong>
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>

<% }%>

<div id="new-req-button">
	<a id="newRequest" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#new-leave-request">New Request</a>
</div>

<table class="table">
  <thead>
    <tr>
      <th scope="col">Roll Number</th>
      <th scope="col">Leave Type</th>
      <th scope="col">From Date</th>
       <th scope="col">To Date</th>
      <th scope="col">Number Of Days</th>
      <th scope="col">Requested Date</th>
      <th scope="col">Status</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">100101</th>
      <td>Sick Leave</td>
      <td>05-06-2024</td>
      <td>06-06-2024</td>
      <td>1</td>
      <td>04-06-2024</td>
      <td>New</td>
      <td>
       <a href=""><i class="bi bi-file-earmark-medical text-danger"></i></a>
       <a href=""><i class="bi bi-pencil-square text-danger"></i></a>
       <a href=""><i class="bi bi-trash text-danger"></i></a>
      </td>
    </tr>
    <tr>
      <th scope="row">100101</th>
      <td>Sick Leave</td>
      <td>05-06-2024</td>
      <td>06-06-2024</td>
      <td>1</td>
      <td>04-06-2024</td>
      <td>New</td>
      <td>
       <a href=""><i class="bi bi-file-earmark-medical text-danger"></i></a>
       <a href=""><i class="bi bi-pencil-square text-danger"></i></a>
       <a href=""><i class="bi bi-trash text-danger"></i></a>
      </td>
    </tr>
    <tr>
      <th scope="row">100101</th>
      <td>Sick Leave</td>
      <td>05-06-2024</td>
      <td>06-06-2024</td>
      <td>1</td>
      <td>04-06-2024</td>
      <td>New</td>
      <td>
       <a href=""><i class="bi bi-file-earmark-medical text-danger"></i></a>
       <a href=""><i class="bi bi-pencil-square text-danger"></i></a>
       <a href=""><i class="bi bi-trash text-danger"></i></a>
      </td>
    </tr>
  </tbody>
</table>
</div>

<!-- model -->
<div class="modal fade" id="new-leave-request" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
        <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
            <h1 class="modal-title fs-5" id="staticBackdropLabel">New Leave Request</h1>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form action="./LeaveController" method="post">
                    <div class="form-group mb-2">
                        <label for="rollNumber">Roll Number</label>
                        <input class="form-control" placeholder="Roll Number" id="rollNumber" type="text" name="rollNumber"/>
                    </div>
                    <div class="form-group mb-2">
                        <label for="leaveType">Leave Type</label>
                        <select id="leaveType" name="leaveType" class="form-select" aria-label="Default select example">
                            <option selected>Open this select menu</option>
                            <option value="Sick Leave">Sick Leave</option>
                            <option value="Casual Leave">Casual Leave </option>
                            <option value="Annual Leave">Annual Leave</option>
                          </select>
                    </div>
                    <div class="form-group mb-2">
                        <label for="reason">Reason</label>
                        <textarea class="form-control" name="reason" rows="3" cols="10"></textarea>
                    </div>
                    <div class="form-group mb-2">
                        <label for="fromDate">From Date</label>
                        <input class="form-control" placeholder="From Date" id="fromDate" type="date" name="fromDate"/>
					</div>
					<div class="form-group mb-2">
                        <label for="toDate">To Date</label>
                        <input class="form-control" placeholder="From Date" id="toDate" type="date" name="toDate"/>
					</div>
                    
                    <div class="form-group mb-2">
                        <label for="numberOfDays">Number Of Days</label>
                        <input class="form-control" placeholder="Number of days" id="numberOfDays" type="number" name="numberOfDays"/>
                    </div>

                    <input class="btn btn-success w-100" type="submit" value="Create">
                </form>
            </div>
        </div>
        </div>
    </div>

</body>
</html>