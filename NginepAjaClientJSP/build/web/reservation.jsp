<%-- 
    Document   : reservation
    Created on : Jun 19, 2021, 4:16:27 PM
    Author     : ASUS
--%>

<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalDate"%>
<%@page import="com.nginepaja.peter.Bookings"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (session.getAttribute("username") == null) {
        response.sendRedirect("signin.jsp");
    }

%>    


<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <title>Reservation</title>
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

            .navbar a:hover{
                color:sienna;text-decoration: underline
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

            table {

                border: 1px solid black;
                border-collapse: collapse;
            }

            td,
            th {
                text-align: center;
                padding: 10px;
                min-width: 175px;
                border: 1px solid black;
            }

            th {
                background-color: goldenrod;
                color: lightgoldenrodyellow;
                font-weight: normal;
            }

            .tengah {
                text-align: left;
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
                <div>
                    <ul>
                        <li><a href="home.jsp" style="font-weight: normal;">Home</a></li>
                        <li style="color:sienna;text-decoration: underline;">Reservation</li>
                        <li><a href="contactus.jsp" style="font-weight: normal;">Contact Us</a></li>
                    </ul>
                    <div style="float:right;position:absolute;right:30px; top:80px;">
                        <p><%=session.getAttribute("username")%></p>
                    </div>

                </div>
            </div>
        </div>
        <div class="container">
            <label for="" name="notif" style="color: red;font-size: 15px;font-weight: 500;">
                <%                                String msg = (String) session.getAttribute("notif2");
                    if (msg == null) {
                        msg = "";
                    }
                    out.println(msg);
                %></label><br>

            <table>
                <tr>
                    <th>Booking<br>Information</th>
                    <th>Identity</th>
                    <th>Unit</th>
                    <th>Rent Duration</br>(in month)</th>
                    <th>Date Start</th>
                    <th>Date End</th>
                    <th>Total</th>
                </tr>
               
                    <%
                        try {
                            com.nginepaja.peter.UserWS_Service service = new com.nginepaja.peter.UserWS_Service();
                            com.nginepaja.peter.UserWS port = service.getUserWSPort();
                            // TODO initialize WS operation arguments here
                            java.lang.String username = (String) session.getAttribute("username");
                            // TODO process result here
                            java.util.List<com.nginepaja.peter.Bookings> result = port.showBooking(username);

                            for (Bookings results : result) {
                                String status = "";
                                if (results.getStatus().equals("0")) {
                                    status = "belum selesai";
                                } else if (results.getStatus().equals("1")) {
                                    status = "dalam proses";
                                } else if (results.getStatus().equals("2")) {
                                    status = "selesai";
                                }
                                int total = (results.getHouse().getPricePerYear() / 12) * results.getRentDuration();
                                String dateStart2 = results.getDateStart().replace("/", "-");
                                System.out.println(dateStart2);
                                LocalDate startDate2 = LocalDate.parse(dateStart2);
                                LocalDate endDate = startDate2.plusMonths(results.getRentDuration());
                                String endDate2 = String.valueOf(endDate).replace("/", "-");
                                
                                
                                out.println("<tr>");
                                out.println("<td class='tengah' style=''><strong>" + results.getBookingId() + "</strong><br><small>" + results.getBookTime() + "</small><br><small>" + status + "</small></td>");
                                out.println("<td class='tengah'>" + results.getFirstName() + " " + results.getLastName() + "<br><small>" + results.getUserAddress() + "</small><br><small>" + results.getPhone()+ "</small></td>");
                                out.println("<td class=tengah'>" + results.getHouse().getAddress() + "</td>");
                                out.println("<td class='tengah' style='text-align:center;'>" + results.getRentDuration() + "</td>");
                                out.println("<td class=tengah'>" + results.getDateStart() + "</td>");
                                out.println("<td class=tengah'>" + endDate2 + "</td>");
                                out.println("<td class=tengah'>Rp " + String.format("%,d\n", total) + "</td>");
                            out.println("</tr>");

                            }
                        } catch (Exception ex) {
                        }
                    %>



                </tr>
            </table>
        </div>
    </body>

</html>