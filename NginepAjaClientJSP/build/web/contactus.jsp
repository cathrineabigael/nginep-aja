<%-- 
    Document   : contactus
    Created on : Jun 19, 2021, 4:14:50 PM
    Author     : ASUS
--%>
<%
    if (session.getAttribute("username")== null) {
        response.sendRedirect("signin.jsp");
        
    }
//     out.println(session.getAttribute("username"));
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Contact Us</title>
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
                margin: 0;
            }

            .navbar a:hover{
                color:sienna;text-decoration: underline
            }

            .navbar {
                background-color: lightgoldenrodyellow;
                min-height: 75px;
                text-align: center;
                padding: 20px;
            }

            .navbar label {
                font-size: 25px;
                font-style: italic;
                font-weight: 500;
                color: sienna;
            }

            .container {
                display: grid;
                grid-template-columns: 1fr 1fr;
                /* justify-content: center;
                margin-top: 10px;
                margin-left: 20px;
                margin-right: 20px; */
                gap: 20px;
                padding: 40px;
            }
            .tulis{
                font-style: italic;
                font-size: 20px;
                text-align: center;
                position: absolute;
                left: 50%; top: 50%;
                transform: translateX(-50%) translateY(-50%);
            }

            .content {
                border: 1px solid silver;
                width: auto;
                padding: 20px;
                border-radius: 10px;
            }


            img {
                width: 600px;
                height: 300px;
                margin-left: auto;
                margin-right: auto;
                display: block;
                border-radius: 10px;
            }

            .logo {
                background-color: white;
                margin-top: 10px;
                margin: auto;
                width: 200px;
                display: flex;
                flex-wrap: wrap;
                align-items: center;
                border-radius: 10px;
            }

            .icon {
                height: 50px;
                width: 50px;

            }

            a {
                text-decoration: none;
                color: black;
                font-weight: bold;
            }

            ul {
                margin-top: 10px;
                text-align: left;
            }

            li {
                display: inline;
                margin: 10px;
                text-align: left;
            }
            li a {
                font-weight: normal;
            }
        </style>
    </head>
    <body>
        <div class="navbar">
            <div class="logo">
                <div class="contentlogo">
                    <img class="icon" src="https://i.pinimg.com/originals/5e/87/1a/5e871a36092f98428e748dbb9100d3e7.jpg">
                </div>
                <div class="contentlogo">
                    <label for="">NginepAja!</label>
                </div>
            </div>
            <div>
                <div >
                    <ul>
                        <li><a href="home.jsp" style="font-weight: normal;">Home</a></li>
                        <li><a href="reservation.jsp" style="font-weight: normal;">Reservation</a></li>
                        <li style="color:sienna;text-decoration: underline;">Contact Us</li>
                    </ul>
                    <div style="float:right;position:absolute;right:30px; top:80px;">
                         <p><%=session.getAttribute("username")%></p>
                    </div>

                </div>
            </div>
        </div>
        <div style="height: 10px;"></div>
        <div class="countainer" >
            <p class="tulis">To consultate with us please install apk <br> (Untuk konsultasi silahkan unduh aplikasi)</p>
        </div>
    </body>
</html>
