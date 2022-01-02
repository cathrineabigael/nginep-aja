<%-- 
    Document   : home
    Created on : Jun 18, 2021, 1:47:45 PM
    Author     : ASUS
--%>
<%@page import="java.util.Random"%>
<%@page import="org.apache.jasper.tagplugins.jstl.ForEach"%>
<%@page import="com.nginepaja.peter.Houses"%>
<%@page import="com.nginepaja.peter.Users"%>
<%@page import="java.util.ArrayList"%>
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
        <title>Home</title>
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
                /* margin-top: 20px; */
                border: 1px solid silver;
                width: auto;
                padding: 20px;
                border-radius: 10px;
            }

            .content > h4{
                margin-top: 15px;
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
                /*font-weight: bold;*/
            }

            a:hover > .content {
                background-color: lightgoldenrodyellow;
                border: 1px solid sienna;

            }

            a:hover >.content> h4 {
                color: sienna;
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

            .navbar a:hover{
                color:sienna;text-decoration: underline
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
                        <li style="color:sienna;text-decoration: underline;">Home</li>
                        <li><a href="reservation.jsp" style="font-weight: normal;">Reservation</a></li>
                        <li><a href="contactus.jsp" style="font-weight: normal;">Contact Us</a></li>
                    </ul>
                    <div style="float:right;position:absolute;right:30px; top:80px;">
                         <p><%=session.getAttribute("username")%></p>
                    </div>

                </div>
            </div>
        </div>
        <div class="container">
            <%                try {
                    com.nginepaja.peter.UserWS_Service service = new com.nginepaja.peter.UserWS_Service();
                    com.nginepaja.peter.UserWS port = service.getUserWSPort();
                    // TODO process result here
                    java.util.List<com.nginepaja.peter.Houses> result = port.showHouses();

                    for (Houses results : result) {
                        Random rand = new Random();
                        String img = "";
                        int rand_int1 = rand.nextInt(3);
                        if (rand_int1 == 0) {
                            img = "02094137/gambar-rumah-minimalis-2.jpg";
                        } else if (rand_int1 == 1) {
                            img = "02094028/gambar-rumah-minimalis-1.jpg";
                        } else if (rand_int1 == 2) {
                            img = "02094227/gambar-rumah-minimalis-3.jpg";
                        }
                        out.println("<a href='bookreservation.jsp?id=" + results.getHouseId() + "&img=" + img + "'>");
                        out.println("<div class='content'>");
                        out.println("<img src=https://d3p0bla3numw14.cloudfront.net/news-content/img/2020/10/" + img + ">");
                        out.println("<h4>" + results.getAddress() + "</h4>");
                        out.println("<p>Rp " + String.format("%,d\n", results.getPricePerYear()) + " / Tahun</p>");
                        out.println("<p>" + results.getBedroom() + " bedroom, " + results.getBathroom() + " bathroom</p>");
                        out.println("<p>" + results.getElectricalPower() + " V</p>");
                        out.println("</div>");
                        out.println("</a>");
                    }
                } catch (Exception ex) {
                    // TODO handle custom exceptions here
                }
            %>
        </div>

    </body>

</html>