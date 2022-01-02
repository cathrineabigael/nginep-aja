<%-- 
    Document   : authentication
    Created on : Jun 21, 2021, 6:58:31 PM
    Author     : ASUS
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.time.LocalTime"%>
<%
    if (session.getAttribute("username") == null) {
        response.sendRedirect("signin.jsp");
    }
%>

<%
    int houseid = Integer.parseInt(request.getParameter("id"));
    String firstname = request.getParameter("firstname");
    String lastname = request.getParameter("lastname");
    String address = request.getParameter("address");
    String bookStart = request.getParameter("bookStart");
    int rent = Integer.parseInt(request.getParameter("rent"));
    String telephone1 = request.getParameter("telephone");
%>

<%
    try {
        com.nginepaja.peter.NginepAjaWS_Service service = new com.nginepaja.peter.NginepAjaWS_Service();
        com.nginepaja.peter.NginepAjaWS port = service.getNginepAjaWSPort();
        // TODO initialize WS operation arguments here
        java.lang.String username = (String) session.getAttribute("username");
        java.lang.String pin = request.getParameter("pin");
        // TODO process result here
        boolean result = port.cekPin(username, pin);
        String notif = "";

        if (!result) {
            notif = "PIN is wrong";
            request.setAttribute("notif", notif);
        } else {
            com.nginepaja.peter.UserWS_Service service2 = new com.nginepaja.peter.UserWS_Service();
            com.nginepaja.peter.UserWS port2 = service2.getUserWSPort();
            // TODO initialize WS operation arguments here
            java.lang.String pin2 = request.getParameter("pin");
            int houseId = houseid;
            java.lang.String username2 = (String) session.getAttribute("username");
            java.lang.String status = "0";
            java.lang.String dateStart = bookStart;
            int rentDuration = rent;

            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:MM:ss");
            Calendar cal = Calendar.getInstance();
            String datetime = dateFormat.format(cal.getTime());

            java.lang.String booktime = datetime;

            java.lang.String userAddress = address;
            java.lang.String firstName = firstname;
            java.lang.String lastName = lastname;
            java.lang.String telephone = telephone1;
            // TODO process result here
            java.lang.String result2 = port2.book(houseId, username2, status, dateStart, rentDuration, booktime, userAddress, firstName, lastName, telephone);
//            java.lang.String result2 = port2.book(pin2, houseId, username2, status, dateStart, rentDuration, booktime, userAddress, firstName, lastName, telephone);
//        out.println("Result = " + result2);
            String notif2 = "Booking was successfully made. Please check your booking list below.";
            session.setAttribute("notif2", notif2);
            response.sendRedirect("reservation.jsp");
        }
//        out.println("Result = " + result);
    } catch (Exception ex) {
        // TODO handle custom exceptions here
    }
%>

<%
    try {

    } catch (Exception ex) {
        // TODO handle custom exceptions here
    }
%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <title>Authentication</title>
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

            .navbar a:hover {
                color: sienna;
                text-decoration: underline
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

            .container {}

            .tulis {
                font-style: italic;
                font-size: 20px;
                text-align: center;
                position: absolute;
                left: 50%;
                top: 50%;
                transform: translateX(-50%) translateY(-50%);
            }

            .bawah {
                position: absolute;
                left: 50%;
                top: 50%;
                transform: translateX(-50%) translateY(-50%);
            }

            .bawahlagi {
                position: absolute;
                left: 50%;
                top: 53%;
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

            button {
                /* margin-top: -15px; */
                border: 1px solid silver;
                height: 25px;
                border-radius: 10px;
                background-color: goldenrod;
                color: lightgoldenrodyellow;
                cursor: pointer;

            }


            .input {
                /* margin: 10px; */
            }

            .input label {
                /* margin: 10px; */
            }

            .info {
                margin-top: 20px;
            }

            .info p {
                margin-top: 10px;
            }




            /* The Close Button */
            .close {
                color: #aaaaaa;
                float: right;
                font-size: 28px;
                font-weight: bold;
            }

            .close:hover,
            .close:focus {
                color: #000;
                text-decoration: none;
                cursor: pointer;
            }

            /* tambahan */
            .card {
                /* background-color: white; */
                /* border-radius: 60px; */
                /* box-shadow: 0 2px 10px -3px #333; */
                text-align: center;
                /* min-height: 600px; */
                /* margin: 20px; */
                /* min-width: 400px; */
            }


            .kotak {
                margin-top: 200px;

            }

            form {
                /* margin-top: -10px; */
                /* width: fit-content; */

                /* margin-left: 50px; */
                /* display: flex; */
            }


            .input input,
            textarea {
                width: 200px;
                border: 1px solid silver;
                border-radius: 12px;
                height: 30px;
                font-size: 15px;
                padding: 10px;


            }



            button {
                /* margin-top: 20px; */
                border: 1px solid silver;
                height: 25px;
                border-radius: 10px;
                background-color: goldenrod;
                color: lightgoldenrodyellow;
                cursor: pointer;
                margin: 10px;
                margin-bottom: 10px;
            }



            .kotak .input {
                /* margin: 10px; */
                /* margin-left: 50px; */
                /* text-align: center; */

            }

            .kotak .pin .input {
                margin: 0px;
                /* margin-left: 0px; */
                /* margin-right: 10px; */
                /* text-align: left; */
                /* width: 100%; */
            }

            .input label {
                /* margin: 50px; */
                /* margin-left: 10px; */
            }

            .notif label {
                /* margin: 50px; */
                text-align: center;
            }

            a {
                text-decoration: none;
                color: sienna;
                font-weight: bold;
            }

            a:hover {
                color: goldenrod;
            }

            .signin {
                font-size: 12px;
                /* margin-bottom: 30px; */
                height: 30px;
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
        </div>

        <div class="card">
            <div class="kotak">
                <form method="post" action="">

                    <div class="input">
                        <div class="notif" style="">
                            <label for="" style="color:red;"> <%
                                String msg = (String) request.getAttribute("notif");
                                if (msg == null) {
                                    msg = "";
                                }
                                out.println(msg);%></label><br>
                        </div style="margin-bottom:20px;">
                        <label for="" style="text-align:center;">Please provide PIN to continue</label><br>
                        <input type="password" name="pin" placeholder="PIN" required>
                    </div>
                    <div class="" style="">
                        <button type="submit" id="btnSubmit" style="width: 200px;" name="btnSubmit">OK</button>
                    </div>
                </form>
                <div class="signin">
                    <a href="bookreservation.jsp?id=<%=request.getParameter("id")%>&img=<%=request.getParameter("img")%>" title="Cancel">Cancel</a>
                </div>
            </div>
        </div>
    </body>

</html>