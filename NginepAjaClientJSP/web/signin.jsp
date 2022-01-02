<%-- 
    Document   : signin
    Created on : Jun 18, 2021, 12:44:03 PM
    Author     : ASUS
--%>
<%-- start web service invocation --%><hr/>
<%
//    if (session.getAttribute("username") == "null") {
//    if (session.getAttribute("Username") != null || !session.getAttribute("Username").equals("")) {
//        response.sendRedirect("home.jsp");
//        out.println(session.getAttribute("Username"));
//    }

%>

<%        try {
        com.nginepaja.peter.NginepAjaWS_Service service = new com.nginepaja.peter.NginepAjaWS_Service();
        com.nginepaja.peter.NginepAjaWS port = service.getNginepAjaWSPort();
        // TODO initialize WS operation arguments here
        java.lang.String username = request.getParameter("user");
        java.lang.String password = request.getParameter("pass");
        // TODO process result here
        java.lang.String result = port.cekLogin(username, password);
        java.lang.String notif = "";

        System.out.println("Result = " + result);
        if (result.equals("CONNECT")) {
            session.setAttribute("username", username);
            response.sendRedirect("home.jsp");
        } else if (result.equals("FAILED")) {
            notif = "Your username or password is incorrect";
            request.setAttribute("notif", notif);
        }
    } catch (Exception ex) {
        // TODO handle custom exceptions here
    }
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <title>Sign In</title>
        <style type="text/css">
            @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');

            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                text-decoration: none;
                font-family: 'Poppins', sans-serif;
            }

            *,
            *:focus,
            *:hover {
                outline: none;
            }

            body {
                background-color: lightgoldenrodyellow;
            }

            a {
                text-decoration: none;
                color: sienna;
                font-weight: bold;
            }

            a:hover {
                color: goldenrod;
            }

            .container {
                position: absolute;
                left: 50%;
                top: 50%;
                transform: translateX(-50%) translateY(-50%);
            }

            .card {
                background-color: white;
                border-radius: 60px;
                box-shadow: 0 2px 10px -3px #333;
                text-align: center;
                min-height: 500px;
                margin: 20px;
                width: 350px;
            }

            .kotak {
                /* margin-top: 10px; */
                position: absolute;
                bottom: 100px;
                /* left: 20%; */
                min-width: 350px;
                /* background-color: red; */
            }

            input {
                /* margin-top: -15px; */
                border: 1px solid silver;
                border-radius: 12px;
                height: 30px;
                font-size: 15px;
                padding: 10px;
            }

            button {
                /* margin-top: -15px; */
                border: 1px solid silver;
                height: 25px;
                border-radius: 10px;
                background-color: goldenrod;
                color: lightgoldenrodyellow;
                cursor: pointer;
            }

            .copyright {
                text-align: center;
                font-style: italic;
                margin-top: -15px;
                font-size: 12px;
            }

            img {
                height: 200px;
                margin-top: 75px;
            }

            .nama {

                background-color: white;
                position: absolute;
                left: 50%;
                top: 60px;
                transform: translateX(-50%);
                font-size: 35px;
                font-style: italic;
                font-weight: 500;
                color: sienna;
            }

            .signup {
                margin-top: 10px;
                font-size: 12px;
            }
        </style>
    </head>

    <body>
        <div class="container">
            <div class="nama">
                <label for="">NginepAja!</label>
            </div>
            <div class="card">
                <div>
                    <img src="https://i.pinimg.com/originals/5e/87/1a/5e871a36092f98428e748dbb9100d3e7.jpg">
                </div>
                <div class="kotak">
                    <form method="post">
                        <label for="" name="notif" style="color: red;font-size: 12px;font-weight: 500;">
                            <%                            
                            String msg = (String) session.getAttribute("notif");
                            if (msg == null) {
                                msg = "";
                            }
                            out.println(msg);%></label><br>
                        <input type="text" name="user" placeholder="Username" required><br><br>
                        <input type="password" name="pass" placeholder="Password" required><br><br>
                        <button type="submit" style="width:57%;" name="btnSubmit">Sign In</button>
                    </form>
                    <div class="signup">
                        Don't have any account? <a href="signup.jsp" title="Register">Sign Up</a>
                    </div>
                </div>
            </div>
            <div class="copyright">
                <p>@LulusDisprog</p>
            </div>

        </div>
        <script>
            <%
                if (session.getAttribute("notif") != null) {
                    out.println("alert('session.getAttribute('notif')');");
                    session.removeAttribute("notif");
                }
            %>
        </script>

    </body>


</html>