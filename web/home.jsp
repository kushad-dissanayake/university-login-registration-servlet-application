<%@page import="java.util.List"%>
<%@page import="dbo.Course"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home Page</title>
    <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
    <link href="css/stylehome.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <div class="container">
        <div class="header">
            <h1>Course Registration</h1>
        </div>
        <div class="form-box">
            <form action="HomeServlet" method="post" autocomplete="off">
                <input type="hidden" name="action" value="add">
                <div class="input-box">
                    <label for="firstName">First Name</label>
                    <input class="input" id="firstName" name="firstName" type="text" placeholder="Enter Full Name">
                </div>
                <div class="input-box">
                    <label for="idno">ID Number</label>
                    <input class="input" id="idNumber" name="idNumber" type="text" placeholder="Enter ID Number">
                </div>
                <div class="input-box">
                    <label for="courseName">Course Name</label>
                    <input class="input" id="courseName" name="courseName" type="text" placeholder="Enter Course Name">
                </div>
                <div class="input-box">
                    <label for="address">Home Address</label>
                    <input class="input" id="address" name="address" type="text" placeholder="Enter Address">
                </div>
                <div class="input-box">
                    <label for="phone">Phone Number</label>
                    <input class="input" id="phoneNumber" name="phoneNumber" type="text" placeholder="Enter Phone Number">
                </div>
                <div class="sub">
                    <input class="btn add" type="submit" value="Submit">
                </div>
            </form>
            <div class="list mt5">
                <table class="tbl dark">
                    <thead>
                        <tr>
                            <th>First Name</th>
                            <th>ID Number</th>
                            <th>Course Name</th>
                            <th>Home Address</th>
                            <th>Phone Number</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody class="students">
                        <%
                            List<Course> courses = (List<Course>) request.getAttribute("courses");
                            if (courses != null) {
                                for (Course course : courses) {
                        %>
                        <tr>
                            <td><%= course.getFirstName() %></td>
                            <td><%= course.getIdNumber() %></td>
                            <td><%= course.getCourseName() %></td>
                            <td><%= course.getAddress() %></td>
                            <td><%= course.getPhoneNumber() %></td>
                            <td class="actions">
                                <a href="HomeServlet?action=edit&id=<%= course.getId() %>" class="btn edit">Edit</a>
                                <a href="HomeServlet?action=delete&id=<%= course.getId() %>" class="btn delete">Delete</a>
                            </td>
                        </tr>
                        <%
                                }
                            }
                        %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
