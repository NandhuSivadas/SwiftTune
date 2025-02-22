package org.apache.jsp.Guest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      DB.ConnectionClass con = null;
      synchronized (_jspx_page_context) {
        con = (DB.ConnectionClass) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login</title>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        /* Preloader */\n");
      out.write("        #preloader {\n");
      out.write("            position: fixed;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            background: white;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            z-index: 9999;\n");
      out.write("        }\n");
      out.write("        .loader {\n");
      out.write("            width: 50px;\n");
      out.write("            height: 50px;\n");
      out.write("            border: 5px solid #fff;\n");
      out.write("            border-top: 5px solid transparent;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            animation: spin 1s linear infinite;\n");
      out.write("        }\n");
      out.write("        @keyframes spin {\n");
      out.write("            0% { transform: rotate(0deg); }\n");
      out.write("            100% { transform: rotate(360deg); }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Background Styling */\n");
      out.write("        body {\n");
      out.write("            font-family: 'Poppins', sans-serif;\n");
      out.write("            background: linear-gradient(to right, #4A00E0, #8E2DE2);\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Login Container - Glassmorphism */\n");
      out.write("        .login-container {\n");
      out.write("            background: rgba(255, 255, 255, 0.1);\n");
      out.write("            backdrop-filter: blur(10px);\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 12px;\n");
      out.write("            box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);\n");
      out.write("            text-align: center;\n");
      out.write("            width: 350px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            color: #fff;\n");
      out.write("            font-size: 28px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Input Fields */\n");
      out.write("        input[type=\"text\"], input[type=\"password\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 12px;\n");
      out.write("            margin: 10px 0;\n");
      out.write("            border: 1px solid rgba(255, 255, 255, 0.3);\n");
      out.write("            border-radius: 6px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            background: rgba(255, 255, 255, 0.2);\n");
      out.write("            color: #fff;\n");
      out.write("            outline: none;\n");
      out.write("            transition: 0.3s ease-in-out;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"]:focus, input[type=\"password\"]:focus {\n");
      out.write("            background: rgba(255, 255, 255, 0.3);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Login Button */\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 12px;\n");
      out.write("            background: #ff6b6b;\n");
      out.write("            border: none;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 18px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 6px;\n");
      out.write("            transition: 0.3s ease-in-out;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background: #ff4757;\n");
      out.write("            box-shadow: 0px 0px 10px rgba(255, 99, 99, 0.8);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #fff;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a:hover {\n");
      out.write("            text-decoration: underline;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Loader -->\n");
      out.write("    <div id=\"preloader\">\n");
      out.write("        <div class=\"loader\"></div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Login Form -->\n");
      out.write("    <div class=\"login-container\">\n");
      out.write("        <h1>Login</h1>\n");
      out.write("\n");
      out.write("        ");

            if (request.getParameter("btnlogin") != null) {
                String username = request.getParameter("txtusername");
                String password = request.getParameter("txtpassword");

                if (username.equals("admin@gmail.com") && password.equals("admin123")) {
                    session.setAttribute("aid", "1");
                    session.setAttribute("aname", "Admin");
                    response.sendRedirect("../Admin/HomePage.jsp");
                } else {
                    String selQryUser = "SELECT * FROM tbl_user WHERE bike_registration='" + username + "' AND user_password='" + password + "'";
                    ResultSet user = con.selectCommand(selQryUser);

                    if (user.next()) {
                        session.setAttribute("uid", user.getString("user_id"));
                        session.setAttribute("uname", user.getString("user_name"));
                     
                        session.setAttribute("bike_reg", user.getString("bike_registration")); 
                        response.sendRedirect("../User/UserHome.jsp");
                    } else {
                        out.print("<script>alert('Invalid Credentials')</script>");
                    }
                }
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"txtusername\" placeholder=\"Email / Bike Registration No.\" required>\n");
      out.write("            <input type=\"password\" name=\"txtpassword\" placeholder=\"Password\" required>\n");
      out.write("            <input type=\"submit\" name=\"btnlogin\" value=\"Login\">\n");
      out.write("        </form>\n");
      out.write("        <p><a href=\"NewUserRegistration.jsp\">New User? Register Here</a></p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        // Remove preloader after page load\n");
      out.write("        window.onload = function() {\n");
      out.write("            document.getElementById(\"preloader\").style.display = \"none\";\n");
      out.write("        };\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
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
