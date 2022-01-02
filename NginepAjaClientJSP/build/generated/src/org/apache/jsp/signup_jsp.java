package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("<hr/>\n");

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Sign Up</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');\n");
      out.write("\n");
      out.write("            * {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-family: 'Poppins', sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            *,\n");
      out.write("            *:focus,\n");
      out.write("            *:hover {\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                background-color: lightgoldenrodyellow;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 50%;\n");
      out.write("                top: 50%;\n");
      out.write("                transform: translateX(-50%) translateY(-50%);\n");
      out.write("                /* padding: 20px; */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card {\n");
      out.write("                background-color: white;\n");
      out.write("                border-radius: 60px;\n");
      out.write("                box-shadow: 0 2px 10px -3px #333;\n");
      out.write("                text-align: center;\n");
      out.write("                min-height: 600px;\n");
      out.write("                margin: 20px;\n");
      out.write("                min-width: 400px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .kotak {\n");
      out.write("                margin-top: -50px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .copyright {\n");
      out.write("                text-align: center;\n");
      out.write("                font-style: italic;\n");
      out.write("                margin-top: -15px;\n");
      out.write("                font-size: 12px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button {\n");
      out.write("                /* margin-top: -15px; */\n");
      out.write("                border: 1px solid silver;\n");
      out.write("                height: 25px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                background-color: goldenrod;\n");
      out.write("                color: lightgoldenrodyellow;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            img {\n");
      out.write("                height: 200px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nama {\n");
      out.write("                background-color: white;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 50%;\n");
      out.write("                top: 30px;\n");
      out.write("                transform: translateX(-50%);\n");
      out.write("                font-size: 35px;\n");
      out.write("                font-style: italic;\n");
      out.write("                font-weight: 500;\n");
      out.write("                color: sienna;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* for form */\n");
      out.write("            form {\n");
      out.write("                /* margin-top: -10px; */\n");
      out.write("                /* width: fit-content; */\n");
      out.write("\n");
      out.write("                margin-left: 50px;\n");
      out.write("                /* display: flex; */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .input input,\n");
      out.write("            textarea {\n");
      out.write("                width: 75%;\n");
      out.write("                border: 1px solid silver;\n");
      out.write("                border-radius: 12px;\n");
      out.write("                height: 30px;\n");
      out.write("                /* min-height: 10px; */\n");
      out.write("                font-size: 15px;\n");
      out.write("                padding: 10px;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .pin {\n");
      out.write("                display: grid;\n");
      out.write("                grid-template-columns: auto auto;\n");
      out.write("                /* flex-wrap: ; */\n");
      out.write("                justify-content: flex-start;\n");
      out.write("                /* background-color: red; */\n");
      out.write("                /* width: fit-content; */\n");
      out.write("                margin: 10px;\n");
      out.write("                margin-left: 50px;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button {\n");
      out.write("                /* margin-top: 20px; */\n");
      out.write("                border: 1px solid silver;\n");
      out.write("                height: 25px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                background-color: goldenrod;\n");
      out.write("                color: lightgoldenrodyellow;\n");
      out.write("                cursor: pointer;\n");
      out.write("                margin: 10px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .kotak .input {\n");
      out.write("                margin: 10px;\n");
      out.write("                margin-left: 50px;\n");
      out.write("                text-align: left;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .kotak .pin .input {\n");
      out.write("                margin: 0px;\n");
      out.write("                /* margin-left: 0px; */\n");
      out.write("                margin-right: 10px;\n");
      out.write("                text-align: left;\n");
      out.write("                /* width: 100%; */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .input label {\n");
      out.write("                margin: 50px;\n");
      out.write("                margin-left: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .notif label {\n");
      out.write("                margin: 50px;\n");
      out.write("                margin-left: 0px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: sienna;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a:hover {\n");
      out.write("                color: goldenrod;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signin {\n");
      out.write("                font-size: 12px;\n");
      out.write("                /* margin-bottom: 30px; */\n");
      out.write("                height: 30px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"nama\">\n");
      out.write("                NginepAja!\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div>\n");
      out.write("                    <img src=\"https://i.pinimg.com/originals/5e/87/1a/5e871a36092f98428e748dbb9100d3e7.jpg\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"kotak\">\n");
      out.write("                    <form method=\"POST\">\n");
      out.write("                        <div class=\"notif\" style=\"\">\n");
      out.write("                            ");

                                String msg = (String) request.getAttribute("notif");
                                if (msg != null) {

                                    String label = "<label style='color:red;'>";
                                    String label2 = "</label><br>";
                                    label = label.concat(msg);
                                    label = label.concat(label2);
                                    out.println(label);
                                }
                            
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input\" style=\"\">\n");
      out.write("                            <label for=\"\">Username</label><br>\n");
      out.write("                            <input type=\"text\" name=\"username\" placeholder=\"Username\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input\">\n");
      out.write("                            <label for=\"\">Email</label><br>\n");
      out.write("                            <input type=\"email\" name=\"email\" placeholder=\"Email\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input\">\n");
      out.write("                            <label for=\"\">Password</label><br>\n");
      out.write("                            <input type=\"password\" name=\"pass\" placeholder=\"Password\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input\">\n");
      out.write("                            <label for=\"\">Repeat password</label><br>\n");
      out.write("                            <input type=\"password\" name=\"pass2\" placeholder=\"Repeat Password\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"pin\">\n");
      out.write("                            <div class=\"input\">\n");
      out.write("                                <label for=\"\" style=\"text-align:left;\">PIN</label><br>\n");
      out.write("                                <input type=\"password\" name=\"pin\" placeholder=\"PIN\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input\" style=\"margin-left: -50px;\">\n");
      out.write("                                <label for=\"\">Repeat PIN</label><br>\n");
      out.write("                                <input type=\"password\" name=\"pin2\" placeholder=\"Repeat PIN\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"\" style=\"margin-left: -50px;\">\n");
      out.write("                            <button type=\"submit\" id=\"btnSubmit\" style=\"width:57%;\" name=\"btnSubmit\">Sign Up</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <div class=\"signin\">\n");
      out.write("                        Already have account? <a href=\"signin.jsp\" title=\"SignIn\">Sign In</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <p>@LulusDisprog</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("                <script  type=\"text/javascript\">\n");
      out.write("                    $(document).ready(function () {\n");
      out.write("                        $(\"form\").submit(function () {\n");
      out.write("                            //buat ga ilang message errornya karena ke refresh\n");
      out.write("                            event.preventDefault();\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("                </script>-->\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
