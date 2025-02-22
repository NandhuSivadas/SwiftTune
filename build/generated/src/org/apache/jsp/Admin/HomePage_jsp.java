package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Admin Dashboard</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\">\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        /* Background with gradient */\n");
      out.write("        body {\n");
      out.write("            background: linear-gradient(135deg, #0f0c29, #302b63, #24243e);\n");
      out.write("            color: white;\n");
      out.write("            font-family: 'Poppins', sans-serif;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        /* Dashboard Card Styling */\n");
      out.write("        .dashboard-card {\n");
      out.write("            background: rgba(20, 20, 20, 0.9);\n");
      out.write("            border-radius: 15px;\n");
      out.write("            padding: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            transition: 0.3s;\n");
      out.write("            box-shadow: 0px 0px 10px rgba(0, 255, 255, 0.2);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .dashboard-card:hover {\n");
      out.write("            transform: translateY(-5px);\n");
      out.write("            box-shadow: 0px 0px 20px rgba(0, 255, 255, 0.7);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .dashboard-card i {\n");
      out.write("            font-size: 40px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            color: #4dabf7;\n");
      out.write("            transition: 0.3s;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .dashboard-card:hover i {\n");
      out.write("            color: cyan;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        /* Logout Button */\n");
      out.write("        .logout-btn {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 20px;\n");
      out.write("            right: 20px;\n");
      out.write("            background: #ff4d4d;\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-weight: bold;\n");
      out.write("            transition: 0.3s;\n");
      out.write("            box-shadow: 0px 0px 10px rgba(255, 77, 77, 0.5);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .logout-btn:hover {\n");
      out.write("            background: #cc0000;\n");
      out.write("            box-shadow: 0px 0px 20px rgba(255, 77, 77, 1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Smooth fade-in animation */\n");
      out.write("        .fade-in {\n");
      out.write("            animation: fadeIn 1s ease-in-out;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @keyframes fadeIn {\n");
      out.write("            from {\n");
      out.write("                opacity: 0;\n");
      out.write("                transform: translateY(-10px);\n");
      out.write("            }\n");
      out.write("            to {\n");
      out.write("                opacity: 1;\n");
      out.write("                transform: translateY(0);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <a href=\"logout.jsp\" class=\"logout-btn fade-in\"><i class=\"fas fa-sign-out-alt\"></i> Logout</a>\n");
      out.write("\n");
      out.write("    <div class=\"container text-center mt-5 fade-in\">\n");
      out.write("        <h1 class=\"mb-3\">Welcome, <span style=\"color: cyan;\">Admin</span></h1>\n");
      out.write("        <p>Manage your platform efficiently</p>\n");
      out.write("\n");
      out.write("        <div class=\"row mt-4\">\n");
      out.write("            <div class=\"col-md-4 mb-3\">\n");
      out.write("                <a href=\"manage_users.jsp\" class=\"text-decoration-none\">\n");
      out.write("                    <div class=\"dashboard-card\">\n");
      out.write("                        <i class=\"fas fa-users\"></i>\n");
      out.write("                        <h5>Manage Users</h5>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 mb-3\">\n");
      out.write("                <a href=\"manage_bikes.jsp\" class=\"text-decoration-none\">\n");
      out.write("                    <div class=\"dashboard-card\">\n");
      out.write("                        <i class=\"fas fa-motorcycle\"></i>\n");
      out.write("                        <h5>Manage Bikes</h5>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 mb-3\">\n");
      out.write("                <a href=\"view_reports.jsp\" class=\"text-decoration-none\">\n");
      out.write("                    <div class=\"dashboard-card\">\n");
      out.write("                        <i class=\"fas fa-chart-line\"></i>\n");
      out.write("                        <h5>View Reports</h5>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 mb-3\">\n");
      out.write("                <a href=\"settings.jsp\" class=\"text-decoration-none\">\n");
      out.write("                    <div class=\"dashboard-card\">\n");
      out.write("                        <i class=\"fas fa-cogs\"></i>\n");
      out.write("                        <h5>Settings</h5>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 mb-3\">\n");
      out.write("                <a href=\"messages.jsp\" class=\"text-decoration-none\">\n");
      out.write("                    <div class=\"dashboard-card\">\n");
      out.write("                        <i class=\"fas fa-envelope\"></i>\n");
      out.write("                        <h5>Messages</h5>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 mb-3\">\n");
      out.write("                <a href=\"profile.jsp\" class=\"text-decoration-none\">\n");
      out.write("                    <div class=\"dashboard-card\">\n");
      out.write("                        <i class=\"fas fa-user\"></i>\n");
      out.write("                        <h5>Profile</h5>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("give me a navbar or sidebar to inlcude all the pages and to include it in all pages foe navigations");
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
