<%-- 
    Document   : signup
    Created on : Jun 18, 2021, 1:52:02 PM
    Author     : ASUS
--%>
<%
//    if (session.getAttribute("username") == "null") {
//    if (session.getAttribute("Username") != null || !session.getAttribute("Username").equals("")) {
//        response.sendRedirect("home.jsp");
//    }

%>
<%-- start web service invocation --%><hr/>
<%
    try {
        java.lang.String password = request.getParameter("pass");
        java.lang.String password2 = request.getParameter("pass2");
        java.lang.String pin = request.getParameter("pin");
        java.lang.String pin2 = request.getParameter("pin2");
        java.lang.String email = request.getParameter("email");
        java.lang.String username = request.getParameter("username");
        java.lang.String notif = "";

        if (!password.equals(password2)) {
            notif = "Your password is wrong";
        } else if (!pin.equals(pin2)) {
            notif = "Your PIN is wrong";
        } else if (password.equals(password2) && pin.equals(pin2)) {
            com.nginepaja.peter.NginepAjaWS_Service service = new com.nginepaja.peter.NginepAjaWS_Service();
            com.nginepaja.peter.NginepAjaWS port = service.getNginepAjaWSPort();
            // TODO initialize WS operation arguments here

            java.lang.String result = port.register(username, password, pin, email);
            System.out.println("Result = " + result);

            if (result.equals("uname")) {
                notif = "Your username is taken";
            } else if (result.equals("email")) {
                notif = "Your email is taken";
            } else if (result.equals("sukses")) {
                notif = "You have successfully signed up</br>Sign in to continue";
                session.setAttribute("notif", notif);
                response.sendRedirect("signin.jsp");

            }
        }
        request.setAttribute("notif", notif);

    } catch (Exception ex) {
        // TODO handle custom exceptions here
    }
%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <title>Sign Up</title>
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

            .container {
                position: absolute;
                left: 50%;
                top: 50%;
                transform: translateX(-50%) translateY(-50%);
                /* padding: 20px; */
            }

            .card {
                background-color: white;
                border-radius: 60px;
                box-shadow: 0 2px 10px -3px #333;
                text-align: center;
                min-height: 600px;
                margin: 20px;
                min-width: 400px;
            }


            .kotak {
                margin-top: -50px;

            }



            .copyright {
                text-align: center;
                font-style: italic;
                margin-top: -15px;
                font-size: 12px;
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

            img {
                height: 200px;
                margin-top: 10px;
            }

            .nama {
                background-color: white;
                position: absolute;
                left: 50%;
                top: 30px;
                transform: translateX(-50%);
                font-size: 35px;
                font-style: italic;
                font-weight: 500;
                color: sienna;

            }

            /* for form */
            form {
                /* margin-top: -10px; */
                /* width: fit-content; */

                margin-left: 50px;
                /* display: flex; */
            }


            .input input,
            textarea {
                width: 75%;
                border: 1px solid silver;
                border-radius: 12px;
                height: 30px;
                /* min-height: 10px; */
                font-size: 15px;
                padding: 10px;


            }

            .pin {
                display: grid;
                grid-template-columns: auto auto;
                /* flex-wrap: ; */
                justify-content: flex-start;
                /* background-color: red; */
                /* width: fit-content; */
                margin: 10px;
                margin-left: 50px;
                text-align: left;
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
                margin: 10px;
                margin-left: 50px;
                text-align: left;

            }

            .kotak .pin .input {
                margin: 0px;
                /* margin-left: 0px; */
                margin-right: 10px;
                text-align: left;
                /* width: 100%; */
            }

            .input label {
                margin: 50px;
                margin-left: 10px;
            }

            .notif label {
                margin: 50px;
                margin-left: 0px;
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
        <div class="container">
            <div class="nama">
                NginepAja!
            </div>
            <div class="card">
                <div>
                    <img src="https://i.pinimg.com/originals/5e/87/1a/5e871a36092f98428e748dbb9100d3e7.jpg">
                </div>
                <div class="kotak">
                    <form method="POST">
                        <div class="notif" style="">
                            <%
                                String msg = (String) request.getAttribute("notif");
                                if (msg != null) {

                                    String label = "<label style='color:red;'>";
                                    String label2 = "</label><br>";
                                    label = label.concat(msg);
                                    label = label.concat(label2);
                                    out.println(label);
                                }
                            %>
                        </div>
                        <div class="input" style="">
                            <label for="">Username</label><br>
                            <input type="text" name="username" placeholder="Username" required>
                        </div>
                        <div class="input">
                            <label for="">Email</label><br>
                            <input type="email" name="email" placeholder="Email" required>
                        </div>

                        <div class="input">
                            <label for="">Password</label><br>
                            <input type="password" name="pass" placeholder="Password" required>
                        </div>
                        <div class="input">
                            <label for="">Repeat password</label><br>
                            <input type="password" name="pass2" placeholder="Repeat Password" required>
                        </div>
                        <div class="pin">
                            <div class="input">
                                <label for="" style="text-align:left;">PIN</label><br>
                                <input type="password" name="pin" placeholder="PIN" required>
                            </div>
                            <div class="input" style="margin-left: -50px;">
                                <label for="">Repeat PIN</label><br>
                                <input type="password" name="pin2" placeholder="Repeat PIN" required>
                            </div>
                        </div>
                        <div class="" style="margin-left: -50px;">
                            <button type="submit" id="btnSubmit" style="width:57%;" name="btnSubmit">Sign Up</button>
                        </div>
                    </form>
                    <div class="signin">
                        Already have account? <a href="signin.jsp" title="SignIn">Sign In</a>
                    </div>
                </div>
            </div>
            <div class="copyright">
                <p>@LulusDisprog</p>
            </div>

        </div>
        <!--        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
                <script  type="text/javascript">
                    $(document).ready(function () {
                        $("form").submit(function () {
                            //buat ga ilang message errornya karena ke refresh
                            event.preventDefault();
                        });
                    });
                </script>-->
    </body>

</html>