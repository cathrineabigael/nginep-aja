package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (session.getAttribute("username")== null) {
        response.sendRedirect("signin.jsp");
        
    }
//     out.println(session.getAttribute("username"));

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
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
      out.write("            .navbar a:hover{\n");
      out.write("                color:sienna;text-decoration: underline\n");
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
      out.write("            .container {\n");
      out.write("                display: grid;\n");
      out.write("                grid-template-columns: 1fr 1fr;\n");
      out.write("                /* justify-content: center;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                margin-left: 20px;\n");
      out.write("                margin-right: 20px; */\n");
      out.write("                gap: 20px;\n");
      out.write("                padding: 40px;\n");
      out.write("            }\n");
      out.write("            .tulis{\n");
      out.write("                font-style: italic;\n");
      out.write("                font-size: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 50%; top: 50%;\n");
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
      out.write("            li a {\n");
      out.write("                font-weight: normal;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
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
      out.write("            <div>\n");
      out.write("                <div >\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"home.jsp\" style=\"font-weight: normal;\">Home</a></li>\n");
      out.write("                        <li><a href=\"reservation.jsp\" style=\"font-weight: normal;\">Reservation</a></li>\n");
      out.write("                        <li style=\"color:sienna;text-decoration: underline;\">Contact Us</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div style=\"float:right;position:absolute;right:30px; top:80px;\">\n");
      out.write("                        <p>John Doe</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"height: 10px;\"></div>\n");
      out.write("        <div class=\"countainer\" >\n");
      out.write("            <p class=\"tulis\">To consultate with us please install apk <br> (Untuk konsultasi silahkan unduh aplikasi)</p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
