<%@page import="com.pst.sp.dto.StudentProfileDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Student Profile page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<link href="css/styles.css" rel="stylesheet">
</head>
<body>
<%
  StudentProfileDto dto =(StudentProfileDto)request.getAttribute("dto");
%>

<%@ include file="student_navigation_bar.html" %>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

 <div class="pcontainer mt-4">
    <div class="row">
        <div class="col-md-3 border-right">
            <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class=" mt-5" width="150px" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSw8xcmdG5JjS8OA5jnh1wKttCgibR74gZ0Q&s"><span class="font-weight-bold"><%=dto.getStudentName() %></span><span class="text-black-50"><%=dto.getEmail() %></span><span> </span></div>
        </div>
        <div class="col-md-5 border-right">
            <div class="p-3 py-5">
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h4 class="text-right">Profile Settings</h4>
                </div>
                <div class="row ">
                    <div class="col-md-6"><label class="labels">Name</label><input type="text" class="form-control"  value="<%=dto.getStudentName() %>" disabled="disabled"></div>
                    <div class="col-md-6"><label class="labels">Roll Number</label><input type="text" class="form-control" value="<%=dto.getRollNumber() %>" disabled="disabled" ></div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-12"><label class="labels">Mobile Number</label><input type="text" class="form-control"  value="<%=dto.getMobileNumber() %>" disabled="disabled"></div>
                    <div class="col-md-12"><label class="labels">Address</label><input type="text" class="form-control"  value="<%=dto.getAddress() %>" disabled="disabled"></div>
                    <div class="col-md-12"><label class="labels">Date Of Birth</label><input type="text" class="form-control"  value="<%=dto.getDob() %>" disabled="disabled"></div>
                    
                </div>
                   <div class="mt-5 text-center "><button class="btn btn-primary " type="button">Save Profile</button>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<button class="btn btn-warning " type="button">Cancle</button></div>
           </div>
       </div>
        <div class="col-md-4 mt-5">
            <div class="p-3 py-5">
                    <div class="col-md-12"><label class="labels">Gender</label><input type="text" class="form-control"  value="<%=dto.getGender() %>" disabled="disabled"></div>
                    <div class="col-md-12"><label class="labels">Email ID</label><input type="text" class="form-control"  value="<%=dto.getEmail() %>" disabled="disabled"></div>
                    <div class="col-md-12"><label class="labels">Course</label><input type="text" class="form-control"  value="<%=dto.getCourseName() %>" disabled="disabled"></div>
            </div>
        </div>
    </div>
  </div>
 </div>
</div>
</body>
</html>