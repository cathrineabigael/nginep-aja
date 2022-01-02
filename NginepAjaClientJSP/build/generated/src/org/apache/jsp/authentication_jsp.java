package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;
import java.time.LocalTime;

public final class authentication_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    if (session.getAttribute("username") == null) {
        response.sendRedirect("signin.jsp");

    }
//     out.println(session.getAttribute("username"));

      out.write('\n');
int 
    houseid = Integer.parseInt(request.getParameter("id"));
    String firstname = request.getParameter("firstname");
    String lastname = request.getParameter("lastname");
    String address = request.getParameter("address");
    String bookStart = request.getParameter("bookStart");
    int rent = Integer.parseInt(request.getParameter("rent"));
    String telephone1 = request.getParameter("telephone");

      out.write('\n');
      out.write('\n');

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
        }
        out.println("Result = " + result);
    } catch (Exception ex) {
        // TODO handle custom exceptions here
    }

      out.write('\n');
      out.write('\n');

    try {
        com.nginepaja.peter.UserWS_Service service = new com.nginepaja.peter.UserWS_Service();
        com.nginepaja.peter.UserWS port = service.getUserWSPort();
        // TODO initialize WS operation arguments here
        java.lang.String pin = request.getParameter("pin");
        int houseId = houseid;
        java.lang.String username = (String) session.getAttribute("username");
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
        java.lang.String result = port.book(pin, houseId, username, status, dateStart, rentDuration, booktime, userAddress, firstName, lastName, telephone);
        out.println("Result = " + result);
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
      out.write("        <title>Contact Us</title>\n");
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
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar a:hover {\n");
      out.write("                color: sienna;\n");
      out.write("                text-decoration: underline\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar {\n");
      out.write("                background-color: lightgoldenrodyellow;\n");
      out.write("                min-height: 75px;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar label {\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-style: italic;\n");
      out.write("                font-weight: 500;\n");
      out.write("                color: sienna;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {}\n");
      out.write("\n");
      out.write("            .tulis {\n");
      out.write("                font-style: italic;\n");
      out.write("                font-size: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 50%;\n");
      out.write("                top: 50%;\n");
      out.write("                transform: translateX(-50%) translateY(-50%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bawah {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 50%;\n");
      out.write("                top: 50%;\n");
      out.write("                transform: translateX(-50%) translateY(-50%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bawahlagi {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 50%;\n");
      out.write("                top: 53%;\n");
      out.write("                transform: translateX(-50%) translateY(-50%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .content {\n");
      out.write("                border: 1px solid silver;\n");
      out.write("                width: auto;\n");
      out.write("                padding: 20px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            img {\n");
      out.write("                width: 600px;\n");
      out.write("                height: 300px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                display: block;\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .logo {\n");
      out.write("                background-color: white;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                margin: auto;\n");
      out.write("                width: 200px;\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                align-items: center;\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .icon {\n");
      out.write("                height: 50px;\n");
      out.write("                width: 50px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: black;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            ul {\n");
      out.write("                margin-top: 10px;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li {\n");
      out.write("                display: inline;\n");
      out.write("                margin: 10px;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a {\n");
      out.write("                font-weight: normal;\n");
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
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .input {\n");
      out.write("                /* margin: 10px; */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .input label {\n");
      out.write("                /* margin: 10px; */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .info {\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .info p {\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            /* The Close Button */\n");
      out.write("            .close {\n");
      out.write("                color: #aaaaaa;\n");
      out.write("                float: right;\n");
      out.write("                font-size: 28px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .close:hover,\n");
      out.write("            .close:focus {\n");
      out.write("                color: #000;\n");
      out.write("                text-decoration: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* tambahan */\n");
      out.write("            .card {\n");
      out.write("                /* background-color: white; */\n");
      out.write("                /* border-radius: 60px; */\n");
      out.write("                /* box-shadow: 0 2px 10px -3px #333; */\n");
      out.write("                text-align: center;\n");
      out.write("                /* min-height: 600px; */\n");
      out.write("                /* margin: 20px; */\n");
      out.write("                /* min-width: 400px; */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .kotak {\n");
      out.write("                margin-top: 200px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form {\n");
      out.write("                /* margin-top: -10px; */\n");
      out.write("                /* width: fit-content; */\n");
      out.write("\n");
      out.write("                /* margin-left: 50px; */\n");
      out.write("                /* display: flex; */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .input input,\n");
      out.write("            textarea {\n");
      out.write("                width: 200px;\n");
      out.write("                border: 1px solid silver;\n");
      out.write("                border-radius: 12px;\n");
      out.write("                height: 30px;\n");
      out.write("                font-size: 15px;\n");
      out.write("                padding: 10px;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                /* margin: 10px; */\n");
      out.write("                /* margin-left: 50px; */\n");
      out.write("                /* text-align: center; */\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .kotak .pin .input {\n");
      out.write("                margin: 0px;\n");
      out.write("                /* margin-left: 0px; */\n");
      out.write("                /* margin-right: 10px; */\n");
      out.write("                /* text-align: left; */\n");
      out.write("                /* width: 100%; */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .input label {\n");
      out.write("                /* margin: 50px; */\n");
      out.write("                /* margin-left: 10px; */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .notif label {\n");
      out.write("                /* margin: 50px; */\n");
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
      out.write("        <div class=\"navbar\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <div class=\"contentlogo\">\n");
      out.write("                    <img class=\"icon\" src=\"https://i.pinimg.com/originals/5e/87/1a/5e871a36092f98428e748dbb9100d3e7.jpg\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"contentlogo\">\n");
      out.write("                    <label for=\"\">NginepAja!</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <div class=\"kotak\">\n");
      out.write("                <form method=\"post\" action=\"\">\n");
      out.write("\n");
      out.write("                    <div class=\"input\">\n");
      out.write("                        <div class=\"notif\" style=\"\">\n");
      out.write("                            <label for=\"\" style=\"color:red;\"> ");

                                String msg = (String) request.getAttribute("notif");
                                if (msg == null) {
                                    msg = "";
                                }
                                out.println(msg);
      out.write("</label><br>\n");
      out.write("                        </div style=\"margin-bottom:20px;\">\n");
      out.write("                        <label for=\"\" style=\"text-align:center;\">Please provide PIN to continue</label><br>\n");
      out.write("                        <input type=\"password\" name=\"pin\" placeholder=\"PIN\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"\" style=\"\">\n");
      out.write("                        <button type=\"button\" id=\"btnSubmit\" style=\"width: 200px;\" name=\"btnSubmit\">OK</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"signin\">\n");
      out.write("                    <a href=\"bookreservation.jsp");
      out.print(request.getParameter("id"));
      out.write("\" title=\"Cancel\">Cancel</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
