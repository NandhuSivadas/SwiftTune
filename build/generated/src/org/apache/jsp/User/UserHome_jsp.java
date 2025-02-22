package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>User Dashboard - Bike Service Management</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://kit.fontawesome.com/a076d05399.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap');\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            font-family: 'Poppins', sans-serif;\n");
      out.write("            background: linear-gradient(135deg, #1e3c72, #2a5298);\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            display: flex;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .wrapper {\n");
      out.write("            display: flex;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100vh;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Sidebar */\n");
      out.write("        .sidebar {\n");
      out.write("            width: 260px;\n");
      out.write("            background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);\n");
      out.write("            color: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("            position: fixed;\n");
      out.write("            height: 100%;\n");
      out.write("            box-shadow: 3px 0px 15px rgba(0, 0, 0, 0.3);\n");
      out.write("            transition: 0.3s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .sidebar h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 22px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("            border-bottom: 2px solid white;\n");
      out.write("            padding-bottom: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .sidebar a {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 12px;\n");
      out.write("            margin: 8px 0;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 18px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            gap: 10px;\n");
      out.write("            transition: all 0.3s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .sidebar a:hover {\n");
      out.write("            background: rgba(255, 255, 255, 0.2);\n");
      out.write("            transform: scale(1.05);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .main-content {\n");
      out.write("            margin-left: 280px;\n");
      out.write("            padding: 40px;\n");
      out.write("            width: 100%;\n");
      out.write("            text-align: center;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .dashboard-header {\n");
      out.write("            font-size: 30px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            text-shadow: 2px 2px 5px rgba(0, 0, 0, 0.2);\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Cards */\n");
      out.write("        .card-box {\n");
      out.write("            display: flex;\n");
      out.write("            flex-wrap: wrap;\n");
      out.write("            gap: 20px;\n");
      out.write("            justify-content: center;\n");
      out.write("            margin-top: 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card {\n");
      out.write("            width: 270px;\n");
      out.write("            height: 170px;\n");
      out.write("            background: rgba(255, 255, 255, 0.1);\n");
      out.write("            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.3);\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            border-radius: 12px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 18px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            transition: 0.3s;\n");
      out.write("            backdrop-filter: blur(10px);\n");
      out.write("            border: 1px solid rgba(255, 255, 255, 0.3);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card i {\n");
      out.write("            font-size: 40px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            color: #ffcc00;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card:hover {\n");
      out.write("            transform: scale(1.08);\n");
      out.write("            box-shadow: 0px 6px 15px rgba(0, 0, 0, 0.5);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("    <!-- Sidebar -->\n");
      out.write("    <div class=\"sidebar\">\n");
      out.write("        <h2>🚀 Bike Service</h2>\n");
      out.write("        <a href=\"UserHome.jsp\"><i class=\"fas fa-home\"></i> Home</a>\n");
      out.write("        <a href=\"UserRegistration.jsp\"><i class=\"fas fa-motorcycle\"></i> Register Bike</a>\n");
      out.write("        <a href=\"ScheduleService.jsp\"><i class=\"fas fa-tools\"></i> Schedule Service</a>\n");
      out.write("        <a href=\"ViewScheduledService.jsp\"><i class=\"fas fa-calendar-check\"></i> View Scheduled Services</a>\n");
      out.write("        <a href=\"ServiceHistory.jsp\"><i class=\"fas fa-history\"></i> Service History</a>\n");
      out.write("        <a href=\"Logout.jsp\"><i class=\"fas fa-sign-out-alt\"></i> Logout</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Main Content -->\n");
      out.write("    <div class=\"main-content\">\n");
      out.write("        <div class=\"dashboard-header\">Welcome to <span style=\"color:#ffcc00;\">Bike Service Management</span> 🚲</div>\n");
      out.write("        <p>Manage your bike service bookings efficiently and keep your ride in top condition.</p>\n");
      out.write("\n");
      out.write("        <!-- Cards Section -->\n");
      out.write("        <div class=\"card-box\">\n");
      out.write("            <a href=\"UserRegistration.jsp\" class=\"card\">\n");
      out.write("                <i class=\"fas fa-motorcycle\"></i>\n");
      out.write("                Register Your Bike\n");
      out.write("            </a>\n");
      out.write("            <a href=\"ScheduleService.jsp\" class=\"card\">\n");
      out.write("                <i class=\"fas fa-tools\"></i>\n");
      out.write("                Schedule Service\n");
      out.write("            </a>\n");
      out.write("            <a href=\"ViewScheduledService.jsp\" class=\"card\">\n");
      out.write("                <i class=\"fas fa-calendar-check\"></i>\n");
      out.write("                View Scheduled Services\n");
      out.write("            </a>\n");
      out.write("            <a href=\"ServiceHistory.jsp\" class=\"card\">\n");
      out.write("                <i class=\"fas fa-history\"></i>\n");
      out.write("                Service History\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
