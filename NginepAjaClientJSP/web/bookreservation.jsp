<%-- 
    Document   : bookreservation
    Created on : Jun 19, 2021, 4:24:29 PM
    Author     : ASUS
--%>
<%@page import="com.nginepaja.peter.Houses"%>
<%
    if (session.getAttribute("username") == null) {
        response.sendRedirect("signin.jsp");

    }


%>
<%-- start web service invocation --%>

<%-- end web service invocation --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <title>Detail</title>
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
                grid-template-columns: 2fr 1fr;
                gap: 20px;
                padding: 40px;
            }

            .content {
                width: auto;
                padding: 20px;
                border-radius: 10px;
                border: 1px solid silver;
            }


            img {
                width: 800px;
                height: 400px;
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

            .navbar a:hover{
                color:sienna;text-decoration: underline
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

            .name {
                display: grid;
                grid-template-columns: 1fr 1fr;
                gap: 10px;
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

            .firstname,
            .lastname {
                width: 100%;
            }

            .input input,
            textarea {
                width: 100%;
                border: 1px solid silver;
                border-radius: 12px;
                min-height: 30px;
                /* min-height: 10px; */
                font-size: 15px;
                padding: 10px;

            }

            .input {
                margin: 10px;
            }

            .input label {
                margin: 10px;
            }

            .info {
                margin-top: 20px;
            }

            .info p {
                margin-top: 10px;
            }


            .providepin {
                position: fixed;
                left: 50%;
                top: 50%;
                transform: translateX(-50%) translateY(-50%);
                text-align: center;
                background: goldenrod;
                padding: 20px;
                border-radius: 10px;
                color: lightgoldenrodyellow;
                display: none;
            }


            .pin {
                border-radius: 10px;
                margin-top: 10px;
                height: 50px;
                width: 50px;
                border: 1px solid black;
                font-size: 50px;
                text-align: center;
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
                <ul>
                    <li>  <li style="color:sienna;text-decoration: underline;">Home</li>
                    <li><a href="reservation.jsp" style="font-weight: normal;">Reservation</a></li>
                    <li><a href="contactus.jsp" style="font-weight: normal;">Contact Us</a></li>
                </ul>
                <div style="float:right;position:absolute;right:30px; top:80px;">
                    <p><%=session.getAttribute("username")%></p>
                </div>

            </div>
        </div>
        <div class="container">
            <div class="content">
                <%        try {
                        com.nginepaja.peter.UserWS_Service service = new com.nginepaja.peter.UserWS_Service();
                        com.nginepaja.peter.UserWS port = service.getUserWSPort();
                        // TODO initialize WS operation arguments here
                        int houseId = Integer.parseInt(request.getParameter("id"));
                        String img = request.getParameter("img");
                        // TODO process result here
                        java.util.List<com.nginepaja.peter.Houses> result = port.showHouse(houseId);
//                        out.println(request.getParameter("id"));
//                        out.println("Result = " + result);

                        for (Houses results : result) {
                            out.println("<img src=https://d3p0bla3numw14.cloudfront.net/news-content/img/2020/10/" + img + ">");
                            out.println("<div class='info'>");
                            out.println("<h4>" + results.getAddress() + "</h4>");
                            out.println(" <p>" + String.format("%,d\n", results.getPricePerYear()) + " / Tahun</p>");
                            out.println("<p>" + results.getBedroom() + " bedroom, " + results.getBathroom() + " bathroom</p>");
                            out.println("<p>" + results.getElectricalPower() + " V</p>");
                            out.println("</div>");

                        }
                    } catch (Exception ex) {
                        // TODO handle custom exceptions here
                    }
                %>
            </div>
            <div class="content">
                <form method="get" action="authentication.jsp?id=<%=request.getParameter("id")%>">
                    <div class="input name">
                        <div class="firstname">
                            <label for="">First name</label>
                            <input type="text" name="firstname" placeholder="First Name" required>
                        </div>
                        <div class="lastname">
                            <label for="">Last name</label>
                            <input type="text" name="lastname" class="lastname" placeholder="Last Name" required>
                        </div>

                    </div>
                    <div class="input">
                        <label for="">Address</label>
                        <textarea id="address" name="address" placeholder="Address" rows="4" cols="50" required> </textarea>
                    </div>
                    <div class="input">
                        <label for="">Date Start</label>
                        <input type="date" id="bookStart" name="bookStart">
                    </div>
                    <div class="input">
                        <label for="">Rent Duration (in month)</label>
                        <input type="number" id="rent" name="rent" min="1">

                    </div>
                    <div class="input">
                        <label for="">Telephone</label>
                        
                        <input type="text" id="telephone" name="telephone" >
                        <input type="hidden" id="id" name="id" value=<%=request.getParameter("id")%>>
                        <input type="hidden" id="img" name="img" value=<%=request.getParameter("img")%>>


                    </div>
                    <div class="input" style="display:flex; justify-content:center;margin-top:20px;">
                        <button type="submit" id="btnSubmit" style="width:57%;" name="btnSubmit">Book</button>
                    </div>

                </form>
            </div>
        </div>

    </body>
    <script>
//        // Get the modal
//        var modal = document.getElementById("providepin");
//
//        // Get the button that opens the modal
//        var btn = document.getElementById("btnSubmit");
//
//        // When the user clicks the button, open the modal 
//        btn.onclick = function () {
//            modal.style.display = "block";
//        }
//
//        // When the user clicks on <span> (x), close the modal
//        span.onclick = function () {
//            modal.style.display = "none";
//        }
//
//        // When the user clicks anywhere outside of the modal, close it
//        window.onclick = function (event) {
//            if (event.target == modal) {
//                modal.style.display = "none";
//            }
//        }
    </script>

</html>
