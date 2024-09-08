<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="css/stylelogin.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="regbox box">
                <img class="avatar" src="img/login.png">
                <h1>Login Account</h1>
                <form action="LoginServlet" method="post">
                    <p>Useremail</p>
                    <input type="text" placeholder="Useremail" name="email" required>
                    <p>Password</p>
                    <input type="password" placeholder="Password" name="password" required>
                    <input type="submit" value="Login">
                    <a href="registration.jsp">You do not have Account</a>
                    <div class="error-message">
                        <% 
                            String errorMessage = (String) request.getAttribute("errorMessage");
                            if (errorMessage != null) {
                                out.println("<p>" + errorMessage + "</p>");
                            }
                        %>
                    </div>
                </form>              
            </div>
        </div>
    </body>
</html>
