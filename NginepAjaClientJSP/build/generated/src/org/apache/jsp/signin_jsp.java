package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

//    if (session.getAttribute("username") == "null") {
//    if (session.getAttribute("Username") != null || !session.getAttribute("Username").equals("")) {
//        response.sendRedirect("home.jsp");
//        out.println(session.getAttribute("Username"));
//    }


      out.write('\n');
      out.write('\n');
        try {
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Sign In</title>\n");
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
      out.write("            .container {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 50%;\n");
      out.write("                top: 50%;\n");
      out.write("                transform: translateX(-50%) translateY(-50%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card {\n");
      out.write("                background-color: white;\n");
      out.write("                border-radius: 60px;\n");
      out.write("                box-shadow: 0 2px 10px -3px #333;\n");
      out.write("                text-align: center;\n");
      out.write("                min-height: 500px;\n");
      out.write("                margin: 20px;\n");
      out.write("                width: 350px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .kotak {\n");
      out.write("                /* margin-top: 10px; */\n");
      out.write("                position: absolute;\n");
      out.write("                bottom: 100px;\n");
      out.write("                /* left: 20%; */\n");
      out.write("                min-width: 350px;\n");
      out.write("                /* background-color: red; */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input {\n");
      out.write("                /* margin-top: -15px; */\n");
      out.write("                border: 1px solid silver;\n");
      out.write("                border-radius: 12px;\n");
      out.write("                height: 30px;\n");
      out.write("                font-size: 15px;\n");
      out.write("                padding: 10px;\n");
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
      out.write("            .copyright {\n");
      out.write("                text-align: center;\n");
      out.write("                font-style: italic;\n");
      out.write("                margin-top: -15px;\n");
      out.write("                font-size: 12px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            img {\n");
      out.write("                height: 200px;\n");
      out.write("                margin-top: 75px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nama {\n");
      out.write("\n");
      out.write("                background-color: white;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 50%;\n");
      out.write("                top: 60px;\n");
      out.write("                transform: translateX(-50%);\n");
      out.write("                font-size: 35px;\n");
      out.write("                font-style: italic;\n");
      out.write("                font-weight: 500;\n");
      out.write("                color: sienna;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup {\n");
      out.write("                margin-top: 10px;\n");
      out.write("                font-size: 12px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"nama\">\n");
      out.write("                <label for=\"\">NginepAja!</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div>\n");
      out.write("                    <img src=\"https://i.pinimg.com/originals/5e/87/1a/5e871a36092f98428e748dbb9100d3e7.jpg\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"kotak\">\n");
      out.write("                    <form method=\"post\">\n");
      out.write("                        <label for=\"\" name=\"notif\" style=\"color: red;font-size: 12px;font-weight: 500;\">\n");
      out.write("                            ");
                            
                            String msg = (String) session.getAttribute("notif");
                            if (msg == null) {
                                msg = "";
                            }
                            out.println(msg);
      out.write("</label><br>\n");
      out.write("                        <input type=\"text\" name=\"user\" placeholder=\"Username\" required><br><br>\n");
      out.write("                        <input type=\"password\" name=\"pass\" placeholder=\"Password\" required><br><br>\n");
      out.write("                        <button type=\"submit\" style=\"width:57%;\" name=\"btnSubmit\">Sign In</button>\n");
      out.write("                    </form>\n");
      out.write("                    <div class=\"signup\">\n");
      out.write("                        Don't have any account? <a href=\"signup.jsp\" title=\"Register\">Sign Up</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <p>@LulusDisprog</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            ");

                if (session.getAttribute("notif") != null) {
                    out.println("alert('session.getAttribute('notif')');");
                    session.removeAttribute("notif");
                }
            
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
